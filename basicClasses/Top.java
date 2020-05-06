package basicClasses;

public class Top extends Form 
{

    //Methodes
    public void print()
    {
        System.out.print(this.toString());
    }
    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();
        Clause c = new Clause();
        
        Litteral l = new Litteral(this);
        c.ajouter(l);
        eC.add(c);

        return eC;
    }
    public Form negation()
    {
    	Form e = new Bot();

    	return e;
    }
    public Form transform()
    {
        return this;
    }

    public String toString()
    {
        return "⊤";
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
