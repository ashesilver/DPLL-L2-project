package basicClasses;

import java.util.ArrayList;

public class Var extends Form {

	//Attributs
	String nom;

	//Constructeur
	public Var(String nom){
		this.nom = nom;
	}

	//Méthodes
	public void print(){
	    System.out.print(this.toString());
	}
	public ArrayList<Clause> clausifier()
	{
		Clause c = new Clause(this);
		ArrayList<Clause> listeClause = new ArrayList<Clause>();
		listeClause.add(c);
		
		return listeClause;
	}

	public String toString()
	{
		return nom;
	}
}
