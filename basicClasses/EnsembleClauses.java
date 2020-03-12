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
	
	//TODO faire dpll_Tautologie qui retourne void et enlève les tautologies de l'ensemble
	public void dpll_Tautologie()
	{
		
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
	
	//TODO faire dpll_Unitaire qui retourne void et qui met le litteral de la clause unitaire à true ou false en fonction de son signe et applique ceci sur les autres clauses
	public void dpll_Unitaire()
	{
		
	}
	
	//TODO faire clausesPures qui retourne un tableau des indices des clauses pures de l'ensemble
	public int[] clausesPures()
	{
		return null;
	}
	
	//TODO faire dpll_Splitting qui retourne void et qui prend un litteral d'une clause et le met à true ou false en fonction de son signe et applique ceci sur les autres clauses
	public void dpll_Splitting()
	{
		
	}
	
	//TODO faire dpll qui appelle toutes les autres methodes pour appliquer la DPLL
	public void dpll()
	{
		
	}
}
