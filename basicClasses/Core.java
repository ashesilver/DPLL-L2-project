package basicClasses;

import java.util.Scanner;

class Core
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Entrez le numero de l'exemple entre 1 et 7 : ");
        do
        {
            i = sc.nextInt();

            if ((i < 1) || (i > 7))
            {
                System.out.print("Entrez bien un numero compris entre 1 et 7 : ");
            }
        }
        while ((i < 1) || (i > 7));
        
        sc.close();
        
        switch(i)
        {
        case 1 :
            Form e1 = new Var("A");
            Form e2 = new Var("B");
            Form e3 = new Implication(e2, e1);
            Form e4 = new Implication(e1, e3);
            Form e5 = new Non(e4);
            EnsembleClauses c1 = new EnsembleClauses(e5.clausifier());
            e5.print();
            System.out.println();
            c1.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c1.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c1.avoirUnitaire());
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
            EnsembleClauses c2 = new EnsembleClauses(e15.clausifier());

            e15.print();
            System.out.println();
            c2.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c2.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c2.avoirUnitaire());
            System.out.println();
            break;
        case 3 :
            Form e16 = new Var("A");
            Form e17 = new Var("B");
            Form e18 = new Et(e16, e17);
            Form e19 = new Implication(e18, e17);
            Form e20 = new Non(e19);
            EnsembleClauses c3 = new EnsembleClauses(e20.clausifier());

            e20.print();
            System.out.println();
            c3.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c3.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c3.avoirUnitaire());
            System.out.println();
            break;
        case 4 :
            Form e21 = new Var("A");
            Form e22 = new Var("B");
            Form e23 = new Ou (e21, e22);
            Form e24 = new Implication(e22, e23);
            Form e25 = new Non(e24);
            EnsembleClauses c4 = new EnsembleClauses(e25.clausifier());

            e25.print();
            System.out.println();
            c4.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c4.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c4.avoirUnitaire());
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
            EnsembleClauses c5 = new EnsembleClauses(e35.clausifier());

            e35.print();
            System.out.println();
            c5.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c5.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c5.avoirUnitaire());
            System.out.println();
            break;
        case 6 :
            Form e36 = new Var("A");
            Form e37 = new Bot();
            Form e38 = new Non(e36);
            Form e39 = new Implication(e37, e38);
            Form e40 = new Implication(e36, e39);
            Form e41 = new Non(e40);
            EnsembleClauses c6 = new EnsembleClauses(e41.clausifier());

            e41.print();
            System.out.println();
            c6.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c6.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c6.avoirUnitaire());
            System.out.println();
            break;
        case 7 :
            Form e42 = new Bot();
            Form e43 = new Var("A");
            Form e44 = new Implication(e42, e43);
            Form e45 = new Non(e44);
            EnsembleClauses c7 = new EnsembleClauses(e45.clausifier());

            e45.print();
            System.out.println();
            c7.printEnsembleClauses();
            System.out.println("estTautologie sur l'ensemble : " + c7.avoirTautologie());
            System.out.println("estUnitaire sur l'ensemble : " + c7.avoirUnitaire());
            System.out.println();
            break;
        }
    	
    	
    	
    	//Test Tautologie
//    	Form e1 = new Var("A");
//    	Form e2 = new Non(e1);
//    	Form e3 = new Ou(e2, e1);
//    	EnsembleClauses c = new EnsembleClauses(e3.clausifier());
//    	
//    	e3.print();
//    	System.out.println();
//    	c.printEnsembleClauses();
//    	System.out.println(c.avoirTautologie());
        
        //Test estDoublon
//    	Form e1 = new Var("A");
//    	Form e2 = new Non(e1);
//    	Form e3 = new Ou(e1, e2);
//    	EnsembleClauses c1 = new EnsembleClauses(e3.clausifier());
//    	
//    	Form e4 = new Var("A");
//    	Form e5 = new Non(e4);
//    	Form e6 = new Ou(e4, e5);
//    	EnsembleClauses c2 = new EnsembleClauses(e6.clausifier());
//    	
//    	e3.print();
//    	System.out.println();
//    	c1.printEnsembleClauses();
//    	c2.printEnsembleClauses();
//    	System.out.println(c1.estDoublon(c2.listeClauses.get(0)));
    	
    	
    }
}