package basicClasses;

import java.util.ArrayList;

public class Non extends Form
{

    //Atributs
    private Form e;

    //Constructeur
    public Non (Form e)
    {
        this.e = e;
    }

    //Methodes
    public void print()
    {
        System.out.print("¬");
        this.e.print();
    }
    public ArrayList<Clause> clausifier()
    {
        ArrayList<Clause> listeClause = new ArrayList<Clause>();

        if (this.e instanceof Var)
        {
            Clause c = new Clause();
            Litteral l = new Litteral(this);
            c.ajouter(l);
            listeClause.add(c);
        }
        else
        {
            listeClause.addAll(this.e.negation().clausifier());
        }

        return listeClause;
    }
    public Form negation()
    {
        return this.e;
    }
    public Form transform()
    {
        this.e = this.e.negation();

        return this.e;
    }

    public String toString()
    {
        return "¬" + e.toString();
    }
}
