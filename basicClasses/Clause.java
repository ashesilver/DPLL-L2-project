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

	//Méthodes

	//TODO faire une méthode ajouter qui ajoute un element literal dans la liste de literaux

	//TODO faire une méthode tautologie qui rend true si il y a une tautologie dans la clause

	
	public String toString()
	{
		String clause = new String(e.toString());
		return "(" + clause + ")";
	}
}