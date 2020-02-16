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
	    Form e2 = new Non(e1);
	    Form e3 = new Ou(e1,e2);
	    e3.clausifier();
	    e3.printClausification();
	    Form e4 = new Et(e1,e2);
	    // Form e5 = new Non(e4);
	    // System.out.println(e5 instanceof Et);
	    // System.out.println(e5 instanceof Non);
	    // e4.getE1();
	}
}
