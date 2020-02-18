package basicClasses;

import java.util.ArrayList;

public abstract class BinaireOP extends Form
{

    //Atributs
    public Form e1, e2;

    //Constructeurs
    public BinaireOP(Form e1, Form e2)
    {
        this.e1 = e1;
        this.e2 = e2;
    }

    //Méthodes
    public Form transformAll()
    {
    	if ((this.e1 instanceof Et) || (this.e2 instanceof Et))
        {
            return this.distribution();

            // e.print();
            // System.out.println();
        }
        else if ((this.e1 instanceof Equivalence) && (this.e2 instanceof Equivalence)) {
        	Equivalence e1 = (Equivalence)this.e1;
        	Equivalence e2 = (Equivalence)this.e2;
        	this.e1 = e1.transform();
            this.e2 = e2.transform();
        }
        else if (this.e1 instanceof Equivalence) {
        	Equivalence e1 = (Equivalence)this.e1;
            this.e1 = e1.transform();
        }
        else if (this.e2 instanceof Equivalence) {
        	Equivalence e2 = (Equivalence)this.e2;
            this.e2 = e2.transform();
        }
        else if ((this.e1 instanceof Implication) && (this.e2 instanceof Implication)) {
        	Implication e1 = (Implication)this.e1;
        	Implication e2 = (Implication)this.e2;
            this.e1 = e1.transform();
            this.e2 = e2.transform();
        }
        else if (this.e1 instanceof Implication) {
        	Implication e1 = (Implication)this.e1;
            this.e1 = e1.transform();

            // this.e1.print();
            // System.out.println();

        }
        else if (this.e2 instanceof Implication) {
        	Implication e2 = (Implication)this.e2;
            this.e2 = e2.transform();
        }

        return this;
    }
    public Form distribution()
    {
        Form e3, e4, e5;

        if (this.e1 instanceof Et)
        {
            Et e1 = (Et)this.e1;
            e3 = new Ou(e1.e1, this.e2);
            e4 = new Ou(e1.e2, this.e2);
        }
        else
        {
            Et e2 = (Et)this.e2;
            e3 = new Ou(this.e1, e2.e1);
            e4 = new Ou(this.e1, e2.e2);
        }

        e5 = new Et(e3, e4);

        return e5;
    }
}
