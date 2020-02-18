package basicClasses;

public class Clause
{
	//Atributs
	Form e;

	//Constructeur
	public Clause(Form e)
	{
		this.e = e;
	}

	//Méthodes
	public String toString()
	{
		String clause = new String(e.toString());
		return "(" + clause + ")";
	}
}