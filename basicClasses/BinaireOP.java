package basicClasses;

public abstract class BinaireOP extends Form
{

    //Atributs
    Form e1, e2;

    //Constructeurs
    public BinaireOP(Form e1, Form e2)
    {
        this.e1 = e1;
        this.e2 = e2;
    }

    //Méthodes
    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();

        eC.addAll(this.transform().clausifier());

        return eC;
    }
    public BinaireOP distribution()
    {
    	BinaireOP e3, e4, e5;

        if (this.e1.accept_EstEt(v))
        {
            Et e1 = (Et)this.e1;
            e3 = new Ou(e1.e1, this.e2);
            e4 = new Ou(e1.e2, this.e2);
            e5 = new Et(e3.distribution(), e4.distribution());
        }
        else if (this.e2.accept_EstEt(v))
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
