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
			this.litteraux.addAll(c1.listeClauses.get(i).litteraux);
		}
		for (int i1 = 0; i1 < c2.listeClauses.size(); i1++)
		{
			this.litteraux.addAll(c2.listeClauses.get(i1).litteraux);
		}
	}


	public boolean estTautologie()
	{
		boolean val = false;
		int i = 0;
		int j;
		
		while ((i < litteraux.size() - 1) && !val)
		{
			j = i + 1;
			
			while (j < litteraux.size() && !val)
			{
				if (this.litteraux.get(i).e instanceof Non)
				{
					if (this.litteraux.get(i).e.negation() == this.litteraux.get(j).e)
					{
						val = true;
					}
				}
				else
				{
					if (this.litteraux.get(i).e == this.litteraux.get(j).e.negation())
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
		
		while (k < this.litteraux.size() && !val)
		{
			if (this.litteraux.get(k).e instanceof Top)
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
		
		while (k < this.litteraux.size() && !val)
		{
			if (this.litteraux.get(k).e instanceof Bot)
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
			if (this.litteraux.get(i).a != null)
			{
				if (e == this.litteraux.get(i).a)
				{
					this.litteraux.get(i).changerPourTrue();
				}
			}
			else if (e == this.litteraux.get(i).e)
			{
				this.litteraux.get(i).changerPourTrue();
			}
		}
	}
	
	void changerPourFalse(Form e)
	{
		for (int i = 0; i < this.litteraux.size(); i++)
		{
			if (this.litteraux.get(i).a != null)
			{
				if (e == this.litteraux.get(i).a)
				{
					this.litteraux.get(i).changerPourFalse();
				}
			}
			else if (e == this.litteraux.get(i).e)
			{
				this.litteraux.get(i).changerPourFalse();
			}
		}
	}
	
	public String toString()
	{
		return litteraux.toString();
	}
}
