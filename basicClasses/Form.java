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
}
