package basicClasses;

public class Ou extends BinaireOP
{

    //Constructeur
    public Ou (Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Methodes
    public void print ()
    {
        System.out.print("(");
        this.e1.print();
        System.out.print("∨");
        this.e2.print();
        System.out.print(")");
    }

    public EnsembleClauses clausifier()
    {
    	EnsembleClauses eC = new EnsembleClauses();
        
        Clause c = new Clause();
        c.ajouter(this.e1.clausifier(), this.e2.clausifier());
        eC.add(c);

        return eC;
    }
    public Form negation()
    {
        Form e = new Et(this.e1.negation(), this.e2.negation());

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
        return e1.toString() + "∨" + e2.toString();
    }
}
