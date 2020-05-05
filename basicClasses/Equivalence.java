package basicClasses;

public class Equivalence extends BinaireOP
{
    
    MonVisiteur v = new Visiteur();

    //Constructeur
    public Equivalence(Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    
    public boolean accept_EstEt (MonVisiteur v) {
    	return v.Est_Et (this);
    }
    
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
        Form e;

        if ((this.e1.accept_EstEt(v)) || (this.e2.accept_EstEt(v)))
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
}
