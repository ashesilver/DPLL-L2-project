package basicClasses;

public class Bot extends Form
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
        Form e = new Top();

        return e;
    }
    public Form transform()
    {
        return this;
    }

    public String toString()
    {
        return "⊥";
    }
}