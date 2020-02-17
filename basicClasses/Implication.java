package basicClasses;

import java.util.ArrayList;

public class Implication extends BinaireOP {

	//Constructeur
	public Implication(Form e1, Form e2){
		super(e1,e2);
	}

	//Méthodes
	public void print(){
		System.out.print("(");
		e1.print();
		System.out.print("→");
		e2.print();
		System.out.print(")");
	}
	public ArrayList<Clause> clausifier()
	{
		ArrayList<Clause> listeClause = new ArrayList<Clause>();

		Form e1 = new Non(this.e1);
		Form e2 = new Ou(e1,this.e2);
		listeClause.addAll(e2.clausifier());


		return listeClause;
	}
	public Form negation()
	{
		Form e = new Et(this.e1.negation(),this.e2.negation());

		return e;
	}

	public String toString()
	{
		return "(" + this.e1.toString() + "→" + this.e2.toString() + ")";
	}
}