package basicClasses;

import java.util.ArrayList;

public class Implication extends BinaireOP {

	//Constructeur
	public Implication(Form e1, Form e2){
		super(e1,e2);
	}

	//Méthodes
	public void print(){
		System.out.print(this.toString());
	}
	public ArrayList<Clause> clausifier()
	{
		ArrayList<Clause> listeClause = new ArrayList<Clause>();

		listeClause.addAll(this.transform().clausifier());


		return listeClause;
	}
	public Form negation()
	{
		Form e = new Et(this.e1,this.e2.negation());

		return e;
	}
	public Form transform()
	{
		Form e1;

		if (this.e1 instanceof BinaireOP) {
			BinaireOP e2 = (BinaireOP)this.e1.transform().negation();
			// e2 = e2.transformAll();
			e1 = e2.transformAll();
		}
		else
		{
			e1 = this.e1.transform().negation();	
		}
		
		Form e2 = new Ou(e1,this.e2);
		// Form e = e2;

		// e =e2.transformAll();
		// e2.print();
		// System.out.println();

		return e2;
	}

	public String toString()
	{
		return "(" + this.e1.toString() + "→" + this.e2.toString() + ")";
	}
}