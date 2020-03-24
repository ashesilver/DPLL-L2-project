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
	
	public void printEnsembleClauses()
    {
        System.out.println(this.listeClauses.toString());
    }
	
	public ArrayList<Integer> avoirTautologie()
	{
		ArrayList<Integer> T = new ArrayList<Integer>();
		
		for (int i = 0; i < this.listeClauses.size(); i++)
		{
			if (this.listeClauses.get(i).estTautologie())
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
			if (this.listeClauses.get(k).estUnitaire())
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
			this.listeClauses.get(i).changerPourTrue(e);
			
			if (this.listeClauses.get(i).possedeTrue())
			{
				this.listeClauses.remove(i);
				i--;
			}
			else
			{
				this.listeClauses.get(i).possedeFalse();
			}
		}
	}
	
	private void changerPourFalse(Form e)
	{
		for (int i = 0; i < this.listeClauses.size(); i++)
		{
			this.listeClauses.get(i).changerPourFalse(e);
			
			if (this.listeClauses.get(i).possedeTrue())
			{
				this.listeClauses.remove(i);
				i--;
			}
			else
			{
				this.listeClauses.get(i).possedeFalse();
			}
		}
	}
	
	public void dpll_Unitaire()
	{
		int resultat = this.avoirUnitaire();
		int k = 0;

		while (k < this.listeClauses.size() && resultat != -1)
		{
			if (this.listeClauses.get(resultat).litteraux.get(0).a != null)
			{
				this.changerPourFalse(this.listeClauses.get(resultat).litteraux.get(0).a);
			}
			else
			{
				this.changerPourTrue(this.listeClauses.get(resultat).litteraux.get(0).e);
			}

			resultat = this.avoirUnitaire();
			k++;
		}

	}
	
	//TODO faire clausesPures qui retourne un tableau des indices des clauses pures de l'ensemble
	public int[] clausesPures()
	{
		return null;
	}
	
	public void dpll_Splitting()
	{
		int k = 0;
		
		while (k < this.listeClauses.size() && this.listeClauses.get(k) == null)
		{
			k++;
		}
		
		if (this.listeClauses.get(k).litteraux.get(0).a != null)
		{
			this.changerPourFalse(this.listeClauses.get(k).litteraux.get(0).a);
		}
		else
		{
			this.changerPourTrue(this.listeClauses.get(k).litteraux.get(0).e);
		}
	}
	

	public void dpll()
	{	
		while (!this.listeClauses.isEmpty() && !(this.listeClauses.size() == 1 && this.listeClauses.get(0).litteraux.isEmpty()))
		{
			if (!this.avoirTautologie().isEmpty())
			{
				this.dpll_Tautologie();
			}
			else if (this.avoirUnitaire() != -1)
			{
				this.dpll_Unitaire();
			}
			else
			{
				this.dpll_Splitting();
			}
		}
	}
}
