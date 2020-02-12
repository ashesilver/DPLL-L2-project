package basicClasses;


class Core {
	public static void main(String[] args){
	    Form e1 = new Var("A");
	    Form e2 = new Var("B");
	    Form e3 = new Implication(e2,e1);
	    Form e4 = new Implication(e1,e3);
	    e4.print();
	    System.out.print("\n");
	}
}
