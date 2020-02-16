package basicClasses;

import java.util.ArrayList;

public abstract class BinaireOP extends Form {

	//Atributs
    public Form e1, e2;

    //Constructeurs
 	public BinaireOP(Form e1, Form e2) {
 		this.e1 = e1;
 		this.e2 = e2;
 	}

 	//Méthodes
 	public ArrayList<Clause> clausifier()
	{
		return null;
	}
}
