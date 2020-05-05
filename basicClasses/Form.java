package basicClasses;

public abstract class Form
{

    //Méthodes

    /*-----------------------------------+
    | Permet d'afficher chaque Objet de  |
    | chaque Classe                      |
    +-----------------------------------*/
    public abstract void print();

    /*------------------------------------+
    | Permet de clausifier chaque Objet   |
    |  de chaque Classe                   |
    +------------------------------------*/
    public abstract EnsembleClauses clausifier();

    /*------------------------------------+
    | Permet d'avoir la négation de chaque|
    | Object                              |
    +------------------------------------*/
    public abstract Form negation();

    /*------------------------------------+
    | Permet de faire une conjonction de  |
    | disjonctions de l'Objet             |
    +------------------------------------*/
    public abstract Form transform();
    
    
    MonVisiteur v = new Visiteur();
    
    
    public boolean accept_EstEt (MonVisiteur v) {
    	return v.Est_Et (this);
    }
    public boolean accept_EstTop (MonVisiteur v) {
    	return v.EstTop (this);
    }
    public boolean accept_EstBot (MonVisiteur v) {
    	return v.EstBot (this);
    }
    public boolean accept_EstVar (MonVisiteur v) {
    	return v.EstVar (this);
    }
    public boolean accept_EstNon (MonVisiteur v) {
    	return v.EstNon (this);
    }
}
