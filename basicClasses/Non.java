package basicClasses;

import java.util.ArrayList;

public class Non extends Form {

	//Atributs
	Form e;

	//Constructeur
	public Non (Form e){
	    this.e = e;
	}

	//Méthodes
	public void print(){
	    System.out.print(this.toString());
	}
	public ArrayList<Clause> clausifier()
	{
		ArrayList<Clause> listeClause = new ArrayList<Clause>();
		
		if (this.e instanceof Var) {
			Clause c = new Clause(this);
			listeClause.add(c);
		}
		// else if (this.e instanceof Et) {
		// 	Non e1 = new Non((this.e).getE1());
		// 	Non e2 = new Non(this.e.getE2());
		// 	Ou e = new Ou(e1,e2);
		// 	e.clausifier();
		// }
		
		return listeClause;
	}

	public String toString()
	{
		return "¬" + e.toString();
	}
}
