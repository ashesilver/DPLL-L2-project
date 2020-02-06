package basiccclasses;


class core {
	public static void main(String[] args){
		System.out.println("Hello World !");
	}
}

public abstract class Form{

	public Form(){}

	public abstract void print();
}

public abstract class BinaireOP{
	public BinaireOP(){}
}

public class Var extends Form{
	String nom;

	public Var(){
		nom="Unknown";
	}

	public void print(){}

}

public class Non extends Form{
	Form e;

	public Non(){}

	public print(){}
}

private class Top{
	boolean binaryValue = true;

	private Top(){}
}

private class Bot{
	boolean binaryValue = false;

	private Bot(){}
}

public class Et extends BinaireOP{
	int priorityLevel = 0;

	public Et(){}
}

public class Ou extends BinaireOP{
	int priorityLevel = 1;

	public Ou(){}
}

public class Implication extends BinaireOP{
	int priorityLevel = 2;

	public Implication(){}
}

public class Equivalence extends BinaireOP{
	int priorityLevel = 3;

	public Equivalence(){}
}