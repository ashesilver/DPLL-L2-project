package basicClasses;

public class Equivalence extends BinaireOP {

	//Constructeur
	public Equivalence(Form e1, Form e2){
		super(e1,e2);
	}

	public void print(){
		System.out.print("(");
		e1.print();
		System.out.print("↔");
		e2.print();
		System.out.print(")");
	}
}