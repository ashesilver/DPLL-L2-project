package basicClasses;

import java.util.ArrayList;

public class Bot extends Form {

	//Méthodes
	public void print(){
		System.out.print("⊥");
	}
	public ArrayList<Clause> clausifier()
	{
		Clause c = new Clause(this);
		ArrayList<Clause> listeClause = new ArrayList<Clause>();
		listeClause.add(c);

		return listeClause;
	}
	public Form negation()
	{
		Form e = new Top();

		return e;
	}

	public String toString()
	{
		return "⊥";
	}
}