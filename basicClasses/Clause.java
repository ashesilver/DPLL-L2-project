package basicClasses;

import java.util.ArrayList;

public class Clause
{
	//Atributs
	ArrayList<Literal> literaux;

	//Constructeur
	public Clause()
	{
		this.literaux = new ArrayList<>();
	}

	//Getters
	public ArrayList<Literal> getLiteraux()
	{
		return literaux;
	}
	//Methodes
	public void ajouter(Literal l)
	{
		literaux.add(l);
	}
	
	public void ajouter(ArrayList<Clause> c1, ArrayList<Clause> c2)
	{
		for (int i = 0; i < c1.size(); i++)
		{
			this.literaux.addAll(c1.get(i).literaux);
		}
		for (int i1 = 0; i1 < c2.size(); i1++)
		{
			this.literaux.addAll(c2.get(i1).literaux);
		}
	}

	//TODO faire une methode tautologie qui rend true si il y a une tautologie dans la clause

	
	public String toString()
	{
		return literaux.toString();
	}
}