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
		ArrayList<Clause> listeClause = new ArrayList<Clause>();
		
		Clause c = new Clause(this);
		listeClause.add(c);
		
		return listeClause;
	}
	public Form negation()
	{
		Form e = new Non(this);
		
		return e;
	}
	public Form transform()
	{
		return this;
	}

	public String toString()
	{
		return nom;
	}
}
