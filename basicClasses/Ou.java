package basicClasses;

import java.util.ArrayList;

public class Ou extends BinaireOP
{

    //Constructeur
    public Ou (Form e1, Form e2)
    {
        super(e1, e2);
    }

    //Méthodes
    public void print ()
    {
        System.out.print("(");
        this.e1.print();
        System.out.print("∨");
        this.e2.print();
        System.out.print(")");
    }

    public ArrayList<Clause> clausifier()
    {
        ArrayList<Clause> listeClause = new ArrayList<Clause>();

        if ((this.e1 instanceof Et) || (this.e2 instanceof Et))
        {
            Form e = this.distribution();

            e.print();
            System.out.println();

            listeClause.addAll(e.clausifier());
        }
        else if ((this.e1 instanceof Equivalence) && (this.e2 instanceof Equivalence))
        {
            Equivalence e1 = (Equivalence)this.e1;
            Equivalence e2 = (Equivalence)this.e2;
            this.e1 = e1.transform();
            this.e2 = e2.transform();
            listeClause.addAll(this.clausifier());
        }
        else if (this.e1 instanceof Equivalence)
        {
            Equivalence e1 = (Equivalence)this.e1;
            this.e1 = e1.transform();
            listeClause.addAll(this.clausifier());
        }
        else if (this.e2 instanceof Equivalence)
        {
            Equivalence e2 = (Equivalence)this.e2;
            this.e2 = e2.transform();
            listeClause.addAll(this.clausifier());
        }
        else if ((this.e1 instanceof Implication) && (this.e2 instanceof Implication))
        {
            Implication e1 = (Implication)this.e1;
            Implication e2 = (Implication)this.e2;
            this.e1 = e1.transform();
            this.e1.print();
            System.out.println();
            this.e2 = e2.transform();
            this.e2.print();
            System.out.println();
            listeClause.addAll(this.clausifier());
        }
        else if (this.e1 instanceof Implication)
        {
            Implication e1 = (Implication)this.e1;
            this.e1 = e1.transform();


            this.e1.print();
            System.out.println();

            listeClause.addAll(this.clausifier());
        }
        else if (this.e2 instanceof Implication)
        {
            Implication e2 = (Implication)this.e2;
            this.e2 = e2.transform();
            this.e2.print();
            System.out.println();
            listeClause.addAll(this.clausifier());
        }
        else if ((this.e1 instanceof Non) && (this.e2 instanceof Non))
        {
            Non e1 = (Non)this.e1;
            Non e2 = (Non)this.e2;
            if (!(e1.e instanceof Var) || !(e2.e instanceof Var))
            {
                if (!(e1.e instanceof Var))
                {
                    this.e1 = e1.transform();
                    this.e1.print();
                    System.out.println();
                }
                if (!(e2.e instanceof Var))
                {
                    this.e2 = e2.transform();
                    this.e2.print();
                    System.out.println();
                }
                listeClause.addAll(this.clausifier());
            }
            else
            {
                Clause c = new Clause(this);
                listeClause.add(c);
            }

        }
        else if (this.e1 instanceof Non)
        {
            Non e1 = (Non)this.e1;
            if (!(e1.e instanceof Var))
            {
                this.e1 = e1.transform();
                this.e1.print();
                System.out.println();
                listeClause.addAll(this.clausifier());
            }
            else
            {
                Clause c = new Clause(this);
                listeClause.add(c);
            }

        }
        else if (this.e2 instanceof Non)
        {
            Non e2 = (Non)this.e2;
            if (!(e2.e instanceof Var))
            {
                this.e2 = e2.transform();
                this.e2.print();
                System.out.println();
                listeClause.addAll(this.clausifier());
            }
            else
            {
                Clause c = new Clause(this);
                listeClause.add(c);
            }
        }
        else
        {
            Clause c = new Clause(this);
            listeClause.add(c);
        }

        return listeClause;
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
    public Form negation()
    {
        Form e = new Et(this.e1.negation(), this.e2.negation());

        return e;
    }
    public Form transform()
    {
        return this;
    }

    public String toString()
    {
        return e1.toString() + "∨" + e2.toString();
    }
}
