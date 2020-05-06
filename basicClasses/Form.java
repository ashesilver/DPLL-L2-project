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
    
    //MonVisiteur v = new Visiteur();
    
    public abstract boolean accept_estEt (MonVisiteur v);

    public abstract boolean accept_estTop (MonVisiteur v);

    public abstract boolean accept_estBot (MonVisiteur v);

    public abstract boolean accept_estVar (MonVisiteur v);

    public abstract boolean accept_estNon (MonVisiteur v);

}
