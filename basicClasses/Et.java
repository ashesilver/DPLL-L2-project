package basicClasses;

import java.util.ArrayList;

public class Et extends BinaireOP
{

    //Constructeur
    public Et(Form e1, Form e2)
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

        listeClause.addAll(this.e1.clausifier());
        listeClause.addAll(this.e2.clausifier());

        return listeClause;
    }
    public Form negation()
    {
    	Form e = new Ou(this.e1.negation(),this.e2.negation());

    	return e;
    }

    public String toString()
    {
        return "(" + this.e1.toString() + "∧" + this.e2.toString() + ")";
    }
}