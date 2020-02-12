package basicClasses;

public class Non extends Form {

	//Atributs
	Form e;

	//Constructeur
	public Non (Form e){
	    this.e = e;
	}

	//Méthodes
	public void print(){
	    System.out.print("¬");
	    e.print();
	}
}
