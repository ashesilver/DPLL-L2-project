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
    | Permet d'afficher la forme clausale |
    |  dans le terminal                   |
    +------------------------------------*/
    

    // public Form Clausifier2caca()
    // {
    //     if (this instanceof Var)
    //     {
    //         return new Var (this.nom);
    //     }
    //     if (this instanceof Top)
    //     {
    //         return this;
    //     }
    //     if (this instanceof Bot)
    //     {
    //         return this;
    //     }
    //     if (this instanceof Non)
    //     {
    //         if (this.e instanceof Non)
    //         {
    //             return this.Clausifier2caca();
    //         }
    //         else if (this.e instanceof Et)
    //         {
    //             return new Et(new Non(this.e.e1.Clausifier2caca()), new Non(this.e.e2.Clausifier2caca()));
    //         }
    //         else if (this.e instanceof Ou)
    //         {
    //             return new Ou(new Non(this.e.e1.Clausifier2caca()), new Non(this.e.e2.Clausifier2caca()));
    //         }
    //         else
    //         {
    //             return new Non(this.e.Clausifier2caca());
    //         }
    //     }

    //     if (this instanceof Equivalence)
    //     {
    //         return new Et(new Implication(this.e1.Clausifier2caca(), this.e2.Clausifier2caca()), new Implication(this.e2.Clausifier2caca(), this.e1.Clausifier2caca()));
    //     }
    //     if (this instanceof Implication)
    //     {
    //         return new Ou(new Non(this.e1.Clausifier2caca()), this.e2.Clausifier2caca());
    //     }
    //     if (this instanceof Ou)
    //     {
    //         if (this.e1.possedeEt() && this.e2.possedeEt())
    //         {
    //             return new Et(new Ou(this.e1.Clausifier2caca(), this.e2.e1.Clausifier2caca()), new Ou(this.e1.Clausifier2caca(), this.e2.e2.Clausifier2caca()));
    //         }
    //     }
    // }

    // public bool possedeEt()
    // {
    //     if (this instanceof Var || this instanceof Top || this instanceof Bot)
    //     {
    //         return false;
    //     }
    //     else if (this instanceof Non)
    //     {
    //         return this.e.possedeEt();
    //     }
    //     else
    //     {
    //         if (this.e1.possedeEt() || this.e2.possedeEt())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }
    //     }
    // }

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
