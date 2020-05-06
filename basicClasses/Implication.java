package basicClasses;

public class Implication extends BinaireOP
{

    //Constructeur
    public Implication(Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    
    public void print()
    {
        System.out.print("(");
        this.e1.print();
        System.out.print("→");
        this.e2.print();
        System.out.print(")");
    }
    public Form negation()
    {
        Form e = new Et(this.e1.transform(), this.e2.negation());

        return e;
    }
    public Form transform()
    {
        this.e1 = this.e1.negation();
        this.e2 = this.e2.transform();
        Form e;
	MonVisiteur v = new Visiteur();	

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
