package basicClasses;

public class Ou extends BinaireOP {

	//Constructeur
    public Ou (Form e1, Form e2) {
	this.e1 = e1;
	this.e2 = e2;
	}

    public void print () {
	System.out.print("(");
	e1.print ();
	System.out.print("∨");
	e2.print ();
	System.out.print(")");
    }
    
}
