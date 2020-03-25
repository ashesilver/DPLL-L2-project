package basicClasses;

import java.util.ArrayList;

public class EnsembleClauses {
	//Attributes
	ArrayList<Clause> listeClauses;
	
	//Constructor
	public EnsembleClauses()
	{
		this.listeClauses = new ArrayList<>();
	}
	
	public EnsembleClauses(EnsembleClauses listeClauses)
	{
		this.listeClauses = listeClauses.listeClauses;
	}
	
	//Methods
	public void add(Clause e)
	{
		this.listeClauses.add(e);
	}
	
	public void addAll(EnsembleClauses listeClauses)
	{
		this.listeClauses.addAll(listeClauses.listeClauses);
	}
	
	public Clause iemeClause(int i)
	{
		return (i < this.listeClauses.size()) ? this.listeClauses.get(i) : null;
	}
	
	public Litteral iemeLitteraliemeClause(int i, int j)
	{
		return this.iemeClause(j).iemeLitteral(i);
	}
	
	public void printEnsembleClauses()
    {
        System.out.println(this.listeClauses.toString());
    }
	
	public ArrayList<Integer> avoirTautologie()
	{
		ArrayList<Integer> T = new ArrayList<Integer>();
		
		for (int i = 0; i < this.listeClauses.size(); i++)
		{
			if (this.iemeClause(i).estTautologie())
			{
				T.add(i);
			}
		}
		
		return T;
	}
	
	public void dpll_Tautologie()
	{
		ArrayList<Integer> T = avoirTautologie();
		
		if (!(T.isEmpty()))
		{
			for (int i = 0; i < T.size(); i++)
			{
				this.listeClauses.remove(T.get(i) - i);
			}
		}
	}
	
	public int avoirUnitaire()
	{
		int k = 0;
		int resultat = -1;

		while (k < this.listeClauses.size() && resultat == -1)
		{
			if (this.iemeClause(k).estUnitaire())
			{
				resultat = k;
			}
			
			k++;
		}

		return resultat;
	}
	
	private void changerPourTrue(Form e)
	{
		for (int i = 0; i < this.listeClauses.size(); i++)
		{
			this.iemeClause(i).changerPourTrue(e);
			
			if (this.iemeClause(i).possedeTrue())
			{
				this.listeClauses.remove(i);
				i--;
			}
			else
			{
				this.iemeClause(i).possedeFalse();
			}
		}
	}
	
	private void changerPourFalse(Form e)
	{
		for (int i = 0; i < this.listeClauses.size(); i++)
		{
			this.iemeClause(i).changerPourFalse(e);
			
			if (this.iemeClause(i).possedeTrue())
			{
				this.listeClauses.remove(i);
				i--;
			}
			else
			{
				this.iemeClause(i).possedeFalse();
			}
		}
	}
	
	public void dpll_Unitaire()
	{
		int resultat = this.avoirUnitaire();

		if (resultat != -1)
		{
			if (this.iemeLitteraliemeClause(0, resultat).a != null)
			{
				this.changerPourFalse(this.iemeLitteraliemeClause(0, resultat).a);
			}
			else
			{
				this.changerPourTrue(this.iemeLitteraliemeClause(0, resultat).e);
			}
		}
	}

	public ArrayList<Integer> clausesPures()
	{
		ArrayList<Integer> T = new ArrayList<>();
		ArrayList<Form> lit = new ArrayList<>();

		for (int i = 0; i < this.listeClauses.size() - 1; i++)
		{
			for (int j = 0; j < this.iemeClause(i).litteraux.size() && i + 1 < this.listeClauses.size() && T.isEmpty(); j++)
			{
				boolean estNegation = false;
				int k = i + 1;
				T.add(i);

				if (!lit.contains(this.iemeLitteraliemeClause(j, i).getVar()))
				{
					lit.add(this.iemeLitteraliemeClause(j, i).getVar());

					while (k < this.listeClauses.size() && !estNegation)
					{
						boolean estEgal = false;
						int l = 0;

						while (l < this.iemeClause(k).litteraux.size() && !estEgal && !estNegation)
						{
							if (this.iemeLitteraliemeClause(j, i).estNegation(this.iemeLitteraliemeClause(l, k)))
							{
								estNegation = true;
							}
							else if (this.iemeLitteraliemeClause(j, i).estEgal(this.iemeLitteraliemeClause(l, k)))
							{
								estEgal = true;
							}

							l++;
						}

						if (estEgal)
						{
							T.add(k);
						}

						k++;
					}
				}

				if (estNegation || T.size() == 1)
				{
					T.clear();
				}
			}
		}

		return T;
	}
	
	public void dpll_clausesPures()
	{
		ArrayList<Integer> T = this.clausesPures();
		int k = 0;
		while (k < T.size())
		{
			this.listeClauses.remove(T.get(k) - k);
			k++;
		}
	}
	
	public void dpll_Splitting()
	{
		int k = 0;
		
		while (k < this.listeClauses.size() && this.iemeClause(k) == null)
		{
			k++;
		}
		
		if (this.iemeLitteraliemeClause(0, k).a != null)
		{
			this.changerPourFalse(this.iemeLitteraliemeClause(0, k).a);
		}
		else
		{
			this.changerPourTrue(this.iemeLitteraliemeClause(0, k).e);
		}
	}
	

	public void dpll()
	{	
		while (!this.listeClauses.isEmpty() && !(this.listeClauses.size() == 1 && this.listeClauses.get(0).litteraux.isEmpty()))
		{
			if (!this.avoirTautologie().isEmpty())
			{
				this.dpll_Tautologie();
				System.out.print("Après Suppression des tautologies : ");
				this.printEnsembleClauses();
			}
			else if (this.avoirUnitaire() != -1)
			{
				this.dpll_Unitaire();
				System.out.print("Après le Principe de Clauses Unitaires : ");
				this.printEnsembleClauses();
			}
			else if (!this.clausesPures().isEmpty())
			{
				this.dpll_clausesPures();
				System.out.print("Après le Principe de Clauses Pures : ");
				this.printEnsembleClauses();
			}
			else
			{
				this.dpll_Splitting();
				System.out.print("Après le Splitting : ");
				this.printEnsembleClauses();
			}
		}
		
		System.out.print("Après la DPLL : ");
		this.printEnsembleClauses();
	}
}
