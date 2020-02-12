package basicClasses;


class Core {
	public static void main(String[] args){
	    Form e1 = new Var("A");
	    Form e2 = new Ou(e1,new Non(e1));
	    e2.print();
	    System.out.print("\n");
	}
}
