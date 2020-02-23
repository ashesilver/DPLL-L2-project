package basicClasses;

import java.util.ArrayList;

public abstract class BinaireOP extends Form
{

    //Atributs
    public Form e1, e2;

    //Constructeurs
    public BinaireOP(Form e1, Form e2)
    {
        this.e1 = e1;
        this.e2 = e2;
    }

    //Méthodes
    public ArrayList<Clause> clausifier()
    {
        ArrayList<Clause> listeClause = new ArrayList<Clause>();

        listeClause.addAll(this.transform().clausifier());

        return listeClause;
    }
    public BinaireOP distribution()
    {
    	BinaireOP e3, e4, e5;

        if (this.e1 instanceof Et)
        {
            Et e1 = (Et)this.e1;
            e3 = new Ou(e1.e1, this.e2);
            e4 = new Ou(e1.e2, this.e2);
            e5 = new Et(e3.distribution(), e4.distribution());
        }
        else if (this.e2 instanceof Et)
        {
            Et e2 = (Et)this.e2;
            e3 = new Ou(this.e1, e2.e1);
            e4 = new Ou(this.e1, e2.e2);
            e5 = new Et(e3.distribution(), e4.distribution());
        }
        else
        {
        	e5 = this;
        }

        return e5;
    }
}
