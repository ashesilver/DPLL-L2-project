package basicClasses;


class Core {
	public static void main(String[] args){
	    // Form e1 = new Var("A");
	    // Form e2 = new Var("B");
	    // Form e3 = new Implication(e2,e1);
	    // Form e4 = new Implication(e1,e3);
	    // e4.print();
	    // System.out.print("\n");
	    Form e1 = new Var("A");
	    Form e2 = new Var("B");
	    // Form e3 = new Var("C");
	    // Form e4 = new Var("D");
	    // Form e2 = new Bot();
	    Form e3 = new Implication(e1,e2);
	    Form e5 = new Implication(e3,e1);
	    // Form e6 = new Ou(e5,e1);
	    // Form e7 = new Ou(e5,e6);
	    // Form e5 = new Et(e3,e4);
	    // e3.clausifier();
	    e5.printClausification();
	    // System.out.println(e5 instanceof Et);
	    // System.out.println(e5 instanceof Non);
	    // e4.getE1();
	}
}
