package basicClasses;

public class Et extends BinaireOP
{

    //Constructeur
    public Et(Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    public void print()
    {
        System.out.print("(");
        this.e1.print();
        System.out.print("∧");
        this.e2.print();
        System.out.print(")");
    }
    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();

        eC.addAll(this.e1.clausifier());
        eC.addAll(this.e2.clausifier());

        return eC;
    }
    public Form negation()
    {
        Form e = new Ou(this.e1.negation(), this.e2.negation());

        return e;
    }
    public Form transform()
    {
        this.e1 = this.e1.transform();
        this.e2 = this.e2.transform();

        return this;
    }

    public String toString()
    {
        return "(" + this.e1.toString() + "∧" + this.e2.toString() + ")";
    }
}