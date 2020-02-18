package basicClasses;

import java.util.ArrayList;

public class Non extends Form
{

    //Atributs
    Form e;

    //Constructeur
    public Non (Form e)
    {
        this.e = e;
    }

    //Méthodes
    public void print()
    {
        System.out.print(this.toString());
    }
    public ArrayList<Clause> clausifier()
    {
        ArrayList<Clause> listeClause = new ArrayList<Clause>();

        if (this.e instanceof Var)
        {
            Clause c = new Clause(this);
            listeClause.add(c);
        }
        else if ((this.e instanceof Top) || (this.e instanceof Bot))
        {
            Form a = this.e.negation();
            Clause c = new Clause(a);
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
        this.e = this.e.transform().negation();

        return this.e;
    }

    public String toString()
    {
        return "¬" + e.toString();
    }
}
