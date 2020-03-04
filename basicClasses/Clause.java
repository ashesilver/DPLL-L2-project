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
	
	public void ajouter(ArrayList<Clause> c1, ArrayList<Clause> c2)
	{
		for (int i = 0; i < c1.size(); i++)
		{
			this.litteraux.addAll(c1.get(i).litteraux);
		}
		for (int i1 = 0; i1 < c2.size(); i1++)
		{
			this.litteraux.addAll(c2.get(i1).litteraux);
		}
	}

	//TODO faire une methode tautologie qui rend true si il y a une tautologie dans la clause
	public boolean estTautologie()
	{
		boolean val = false;
		int k = 0;
		
		while (k < litteraux.size() && !val)
		{
			
		}
	}

	
	public String toString()
	{
		return litteraux.toString();
	}
}