package basicClasses;

public class Et extends BinaireOP {

	//Constructeur
	public Et(Form e1, Form e2){
		super(e1, e2);
	}

	//Méthodes
	public void print(){
		System.out.print("(");
		e1.print();
		System.out.print("∧");
		e2.print();
		System.out.print(")");
	}
}