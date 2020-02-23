package basicClasses;

import java.util.ArrayList;

public class Ou extends BinaireOP
{

    //Constructeur
    public Ou (Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    public void print ()
    {
        System.out.print("(");
        this.e1.print();
        System.out.print("∨");
        // System.out.print("v");
        this.e2.print();
        System.out.print(")");
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
        Form e = new Et(this.e1.negation(), this.e2.negation());

        return e;
    }
    public Form transform()
    {
        this.e1 = this.e1.transform();
        this.e2 = this.e2.transform();

        return this;
    }

    public String toString()
    {
        return e1.toString() + "∨" + e2.toString();
        // return e1.toString() + "v" + e2.toString();
    }
}
