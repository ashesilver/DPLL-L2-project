package basicClasses;

import java.util.ArrayList;

public class Clause
{
	//Atributs
	private ArrayList<Litteral> litteraux;

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

	//TODO Faire possèdeTrue qui retourne un bool si la clause contient "T"
	public boolean possedeTrue()
	{
		return false;
	}
	
	//TODO Faire possèdeFalse qui retourne un bool et supprime en même temps "⊥" de la clause et sinon si la clause ne contient que "⊥" alors on change "⊥" en "□"
	public boolean possedeFalse()
	{
		return false;
	}
	
	public String toString()
	{
		return litteraux.toString();
	}
}
