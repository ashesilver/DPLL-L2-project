package basicClasses;

import java.util.ArrayList;

public class Var extends Form {

	//Attributs
	String nom;

	//Constructeur
	public Var(String nom){
		this.nom = nom;
	}

	//Methodes
	public void print(){
	    System.out.print(this.toString());
	}
	public ArrayList<Clause> clausifier()
	{
		ArrayList<Clause> listeClause = new ArrayList<Clause>();
		Clause c = new Clause();
		Literal l = new Literal(this);
		c.ajouter(l);
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
