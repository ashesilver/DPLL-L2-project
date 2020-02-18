package basicClasses;


class Core
{
    public static void main(String[] args)
    {
        Form e1 = new Var("A");
        Form e2 = new Var("B");
        Form e3 = new Implication(e1, e2);
        Form e4 = new Implication(e3, e1);
        // Form e5 = new Implication(e4,e1);
        // Form e6 = new Implication(e5,e1);

        e4.print();
        System.out.println();
        e4.printClausification();
        System.out.println();

        Form e5 = new Var("C");
        Form e6 = new Implication(e3, e5);
        Form e7 = new Implication(e6, e3);
        Form e8 = new Implication(e7, e1);
        Form e9 = new Implication(e8, e5);

        e9.print();
        System.out.println();
        e9.printClausification();

        // Form e1 = new Var("A");
        // Form e2 = new Var("B");
        // Form e3 = new Implication(e1, e2);
        // Form e4 = new Non(e3);
        // Form e5 = new Non(e3);
        // Form e6 = new Ou(e4, e5);
        // // Form e6 = new Ou(e4,e4);

        // e6.print();
        // System.out.println();
        // e6.printClausification();
        // System.out.println(e4 instanceof Implication);

    }
}

// (A^non(B))v(A^non(B))
// = (Av(A^non(B)))^(non(B)v(A^non(B)))
// = (AvA) ^ (A v non(B)) ^ (non(B)vA) ^ (non(B) v non(B))