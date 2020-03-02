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

        if ((this.e1 instanceof Et) || (this.e2 instanceof Et))
        {
            e = this.distribution();
        }
        else
        {
            e = new Ou(this.e1, this.e2);
        }

        return e;
    }
}