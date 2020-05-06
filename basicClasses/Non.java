package basicClasses;

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
    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();
	MonVisiteur v = new Visiteur();	
	
        if (this.e.accept_estVar(v))
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

    // Visiteurs
    
    public boolean accept_estEt (MonVisiteur v) {
    	return v.estEt (this);
    }

    public boolean accept_estTop (MonVisiteur v) {
    	return v.estTop (this);
    }

    public boolean accept_estBot (MonVisiteur v) {
    	return v.estBot (this);
    }

    public boolean accept_estVar (MonVisiteur v) {
    	return v.estVar (this);
    }

    public boolean accept_estNon (MonVisiteur v) {
    	return v.estNon (this);
    }

}
