package basicClasses;

import java.util.ArrayList;

public abstract class Form {

    //Méthodes

	/*-----------------------------------+
	| Permet d'afficher chaque Objet de  |
	| chaque Classe    				 	 |
	+-----------------------------------*/
    public abstract void print();

    /*------------------------------------+
	| Permet de clausifier chaque Objet   | 
	|  de chaque Classe 				  |
	+------------------------------------*/
    public abstract ArrayList<Clause> clausifier();

    /*------------------------------------+
	| Permet d'afficher la forme clausale | 
	|  dans le terminal 				  |
	+------------------------------------*/
    public void printClausification()
    {
    	System.out.println(clausifier().toString());
    }

    /*------------------------------------+
	| Permet d'avoir la négation de chaque| 
	| Object        					  |
	+------------------------------------*/
    public abstract Form negation();
    
    public abstract Form transform();
}
