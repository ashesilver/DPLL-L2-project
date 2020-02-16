package basicClasses;

import java.util.ArrayList;

public abstract class Form {

    //Méthodes
    public abstract void print();

    public abstract ArrayList<Clause> clausifier();

    public void printClausification()
    {
    	System.out.println(clausifier().toString());
    }
    
    
}
