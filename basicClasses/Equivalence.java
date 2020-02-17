package basicClasses;

import java.util.ArrayList;

public class Equivalence extends BinaireOP
{

    //Constructeur
    public Equivalence(Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    public void print()
    {
        System.out.print(this.toString());
    }
    public ArrayList<Clause> clausifier()
    {
        ArrayList<Clause> listeClause = new ArrayList<Clause>();

        Form e1 = new Implication(this.e1, this.e2);
        Form e2 = new Implication(this.e2, this.e1);
        Form e3 = new Et(e1, e2);

        listeClause.addAll(e3.clausifier());



        return listeClause;
    }
    public Form negation()
    {
    	Form e = new Ou(this.e1.negation(),this.e2.negation());

    	return e;
    }

    public String toString()
    {
        return "(" + this.e1.toString() + "↔" + this.e2.toString() + ")";
    }

}