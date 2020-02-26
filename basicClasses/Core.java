package basicClasses;

import java.util.Scanner;

class Core
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Entrez le numéro de l'exemple entre 1 et 7 : ");
        do
        {
            i = sc.nextInt();

            if ((i < 1) || (i > 7))
            {
                System.out.print("Entrez bien un numéro compris entre 1 et 7 : ");
            }
        }
        while ((i < 1) || (i > 7));

        switch(i)
        {
        case 1 :
            Form e1 = new Var("A");
            Form e2 = new Var("B");
            Form e3 = new Implication(e2, e1);
            Form e4 = new Implication(e1, e3);
            Form e5 = new Non(e4);

            e5.print();
            System.out.println();
            e5.printClausification();
            System.out.println();
            break;
        case 2 :
            Form e6 = new Var("A");
            Form e7 = new Var("B");
            Form e8 = new Var("C");
            Form e9 = new Implication(e6, e8);
            Form e10 = new Implication(e6, e7);
            Form e11 = new Implication(e10, e9);
            Form e12 = new Implication(e7, e8);
            Form e13 = new Implication(e6, e12);
            Form e14 = new Implication(e13, e11);
            Form e15 = new Non(e14);

            e15.print();
            System.out.println();
            e15.printClausification();
            System.out.println();
            break;
        case 3 :
            Form e16 = new Var("A");
            Form e17 = new Var("B");
            Form e18 = new Et(e16, e17);
            Form e19 = new Implication(e18, e17);
            Form e20 = new Non(e19);

            e20.print();
            System.out.println();
            e20.printClausification();
            System.out.println();
            break;
        case 4 :
            Form e21 = new Var("A");
            Form e22 = new Var("B");
            Form e23 = new Ou (e21, e22);
            Form e24 = new Implication(e22, e23);
            Form e25 = new Non(e24);

            e25.print();
            System.out.println();
            e25.printClausification();
            System.out.println();
            break;
        case 5 :
            Form e26 = new Var("A");
            Form e27 = new Var("B");
            Form e28 = new Var("C");
            Form e29 = new Implication(e27, e28);
            Form e30 = new Implication(e29, e28);
            Form e31 = new Implication(e26, e27);
            Form e32 = new Implication(e31, e30);
            Form e33 = new Ou(e26, e27);
            Form e34 = new Implication(e33, e32);
            Form e35 = new Non(e34);

            e35.print();
            System.out.println();
            e35.printClausification();
            System.out.println();
            break;
        case 6 :
            Form e36 = new Var("A");
            Form e37 = new Bot();
            Form e38 = new Non(e36);
            Form e39 = new Implication(e37, e38);
            Form e40 = new Implication(e36, e39);
            Form e41 = new Non(e40);

            e41.print();
            System.out.println();
            e41.printClausification();
            System.out.println();
            break;
        case 7 :
            Form e42 = new Bot();
            Form e43 = new Var("A");
            Form e44 = new Implication(e42, e43);
            Form e45 = new Non(e44);

            e45.print();
            System.out.println();
            e45.printClausification();
            System.out.println();
            break;
        }
    }
}