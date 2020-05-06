package basicClasses;

import java.util.ArrayList;

public class Clause
{
	//Atributs
	ArrayList<Litteral> litteraux;
	
	//Constructeur
	public Clause()
	{
		this.litteraux = new ArrayList<>();
	}

	//Getters
	public ArrayList<Litteral> getLiteraux()
	{
		return litteraux;
	}
	//Methodes
	
	public void ajouter(Litteral l)
	{
		litteraux.add(l);
	}
	
	public void ajouter(EnsembleClauses c1, EnsembleClauses c2)
	{
		for (int i = 0; i < c1.listeClauses.size(); i++)
		{
			this.litteraux.addAll(c1.iemeClause(i).litteraux);
		}
		for (int i1 = 0; i1 < c2.listeClauses.size(); i1++)
		{
			this.litteraux.addAll(c2.iemeClause(i1).litteraux);
		}
	}

	public Litteral iemeLitteral(int i)
	{
		return i < this.litteraux.size() ? this.litteraux.get(i) : null;
	}

	public boolean estTautologie()
	{
		boolean val = false;
		int i = 0;
		int j;
		MonVisiteur v = new Visiteur();	
		
		while ((i < litteraux.size() - 1) && !val)
		{
			j = i + 1;
			
			while (j < litteraux.size() && !val)
			{
				if (this.iemeLitteral(i).e.accept_estNon(v))
				{
					if (this.iemeLitteral(i).e.negation() == this.iemeLitteral(j).e)
					{
						val = true;
					}
				}
				else
				{
					if (this.iemeLitteral(i).e == this.iemeLitteral(j).e.negation())
					{
						val = true;
					}
				}
				
				j += 1;
			}
			
			i += 1;
		}
		
		return val;
	}
	
	public boolean estUnitaire()
	{
		return this.litteraux.size() == 1;
	}

	
	public boolean possedeTrue()
	{
		int k = 0;
		boolean val = false;
		MonVisiteur v = new Visiteur();	
		
		while (k < this.litteraux.size() && !val)
		{
			if (this.iemeLitteral(k).e.accept_estTop(v))
			{
				val = true;
			}
			
			k++;
		}
		
		return val;
	}
	
	public boolean possedeFalse()
	{
		int k = 0;
		boolean val = false;
		MonVisiteur v = new Visiteur();

		while (k < this.litteraux.size() && !val)
		{
			if (this.iemeLitteral(k).e.accept_estBot(v))
			{
				val = true;
				this.litteraux.remove(k);
			}
			
			k++;
		}
		
		return val;
	}
	
	void changerPourTrue(Form e)
	{
		for (int i = 0; i < this.litteraux.size(); i++)
		{
			if (this.iemeLitteral(i).a != null)
			{
				if (e == this.iemeLitteral(i).a)
				{
					this.iemeLitteral(i).changerPourTrue();
				}
			}
			else if (e == this.iemeLitteral(i).e)
			{
				this.iemeLitteral(i).changerPourTrue();
			}
		}
	}
	
	void changerPourFalse(Form e)
	{
		for (int i = 0; i < this.litteraux.size(); i++)
		{
			if (this.iemeLitteral(i).a != null)
			{
				if (e == this.iemeLitteral(i).a)
				{
					this.iemeLitteral(i).changerPourFalse();
				}
			}
			else if (e == this.iemeLitteral(i).e)
			{
				this.iemeLitteral(i).changerPourFalse();
			}
		}
	}
	
	public String toString()
	{
		return litteraux.toString();
	}
}
