package basicClasses;

public class Litteral
{
	//Attributs
	Form e;
	Form a;

	//Constructeur
	public Litteral(Form e)
	{
		this.e = e;
		
		if (this.e instanceof Non)
		{
			this.a = e.negation();
		}
	}
	
	//Methodes
	public Form getVar()
	{
		if (this.a != null)
		{
			return this.a;
		}
		else
		{
			return this.e;
		}
	}
	public String toString()
	{
		return e.toString();
	}
	
	void changerPourTrue()
	{
		if (!(this.getVar() instanceof Top) && !(this.getVar() instanceof Bot))
		{
			if (this.a != null)
			{
				this.e = new Bot();
				this.a = null;
			}
			else
			{
				this.e = new Top();
			}
		}
		else if (this.getVar() instanceof Top)
		{
			if (this.a != null)
			{
				this.e = this.a.negation();
				this.a = null;
			}
		}
		else if (this.getVar() instanceof Bot)
		{
			if (this.a != null)
			{
				this.e = this.a.negation();
				this.a = null;
			}
		}
	}
	
	void changerPourFalse()
	{
		if (this.a != null)
		{
			this.e = new Top();
			this.a = null;
		}
		else
		{
			this.e = new Bot();
		}
	}
}