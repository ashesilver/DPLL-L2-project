package basicClasses;

public class Var extends Form {

	//Attributs
	private String nom;

	//Constructeur
	public Var(String nom){
		this.nom = nom;
	}

	//Methodes
	public void print(){
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
		Form e = new Non(this);
		
		return e;
	}
	public Form transform()
	{
		return this;
	}

	public String toString()
	{
		return nom;
	}
}
