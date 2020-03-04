package basicClasses;

import java.util.ArrayList;

public class EnsembleClauses {
	//Attributs
	ArrayList<Clause> listeClauses;
	
	//Constructeur
	public EnsembleClauses()
	{
		this.listeClauses = new ArrayList<>();
	}
	
	public EnsembleClauses(EnsembleClauses listeClauses)
	{
		this.listeClauses = listeClauses.listeClauses;
	}
	
	//Methodes
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
	
	public boolean avoirTautologie()
	{
		boolean val = false;
		int k = 0;
		
		while (k < this.listeClauses.size() && !val)
		{
			val = this.listeClauses.get(k).estTautologie();
			
			k += 1;
		}
		
		return val;
	}
	
	public boolean avoirUnitaire()
	{
		boolean val = false;
		int k = 0;
		
		while (k < this.listeClauses.size() && !val)
		{
			val = this.listeClauses.get(k).estUnitaire();
			
			k += 1;
		}
		
		return val;
	}
	
//	public boolean estDoublon(Clause c)
//	{
//		boolean val = false;
//		int k = 0;
//		
//		while (k < this.listeClauses.size() && !val)
//		{
//			if (this.listeClauses.get(k) == c)
//			{
//				val = true;
//			}
//			
//			k += 1;
//		}
//		
//		return val;
//	}
}
