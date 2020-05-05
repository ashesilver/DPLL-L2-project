package basicClasses;

public class Non extends Form
{

    //Atributs
    private Form e;
    
    MonVisiteur v = new Visiteur();

    //Constructeur
    public Non (Form e)
    {
        this.e = e;
    }

    //Methodes
    
    public boolean accept_EstVar (MonVisiteur v) {
    	return v.EstVar (this);
    }
    
    public void print()
    {
        System.out.print("¬");
        this.e.print();
    }
    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();

        if (this.e.accept_EstVar(v))
        {
            Clause c = new Clause();
            Litteral l = new Litteral(this);
            c.ajouter(l);
            eC.add(c);
        }
        else
        {
            eC.addAll(this.e.negation().clausifier());
        }

        return eC;
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
