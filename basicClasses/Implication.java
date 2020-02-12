package basicClasses;

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
}