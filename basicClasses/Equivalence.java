package basicClasses;

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
        System.out.print("(");
        this.e1.print();
        System.out.print("↔");
        this.e2.print();
        System.out.print(")");
    }
    public Form negation()
    {
        this.e1 = this.e1.negation();
        this.e2 = this.e2.negation();
	MonVisiteur v = new Visiteur();	
        Form e;

        if ((this.e1.accept_estEt(v)) || (this.e2.accept_estEt(v)))
        {
            e = this.distribution();
        }
        else
        {
            e = new Ou(this.e1, this.e2);
        }

        return e;
    }
    public Form transform()
    {
        Implication e1 = new Implication(this.e1, this.e2);
        Implication e2 = new Implication(this.e2, this.e1);
        Form e3 = new Et(e1.transform(), e2.transform());

        return e3;
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
