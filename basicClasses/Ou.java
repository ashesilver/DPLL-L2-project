package basicClasses;

import java.util.ArrayList;

public class Ou extends BinaireOP {

	//Constructeur
    public Ou (Form e1, Form e2) {
    	super(e1,e2);
	}

	//Méthodes
    public void print () {
	System.out.print(this.toString());
    }

    public ArrayList<Clause> clausifier()
	{
		ArrayList<Clause> listeClause = new ArrayList<Clause>();

		Clause c = new Clause(this);
		listeClause.add(c);

		return listeClause;
	}

	public String toString()
	{
		return "(" + e1.toString() + "∨" + e2.toString() + ")";
	}    
}
