package basicClasses;

import java.util.ArrayList;

public class EnsembleClauses {
	//Attributs
	private ArrayList<Clause> listeClauses;
	
	//Constructeur
	public EnsembleClauses()
	{
		this.listeClauses = new ArrayList<>();
	}
	
	public EnsembleClauses(ArrayList<Clause> listeClauses)
	{
		this.listeClauses = listeClauses;
	}
	
	//Methodes
	public void printEnsembleClauses()
    {
        System.out.println(this.listeClauses.toString());
    }
	
	
}
