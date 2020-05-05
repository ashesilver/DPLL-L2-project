package basicClasses;

public class Litteral
{
	//Attributs
	Form e;
	Form a;
	
	MonVisiteur v = new Visiteur();

	//Constructeur
	public Litteral(Form e)
	{
		this.e = e;
		
		if (this.e.accept_EstNon(v))
		{
			this.a = e.negation();
		}
	}
	
	//Methodes
	
	public boolean accept_EstTop (MonVisiteur v) {
    		return v.EstTop (this);
	}
	public boolean accept_EstBot (MonVisiteur v) {
    		return v.EstBot (this);
    	}
	public boolean accept_EstNon (MonVisiteur v) {
    		return v.EstNon (this);
    	}
	
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
	
	public boolean estEgal(Litteral l)
	{	
		return (this.getVar() == l.getVar()) && ((this.a != null && l.a != null) || (this.a == null && l.a == null));
	}
	
	public boolean estNegation(Litteral l)
	{
		return (this.getVar() == l.getVar()) && ((this.a == null && l.a != null) || (this.a != null && l.a == null));
	}
	
	void changerPourTrue()
	{
		if (!(this.getVar().accept_EstTop(v)) && !(this.getVar().accept_EstBot(v)))
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
		else if (this.getVar().accept_EstTop(v))
		{
			if (this.a != null)
			{
				this.e = this.a.negation();
				this.a = null;
			}
		}
		else if (this.getVar().accept_EstBot(v))
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
	
	public String toString()
	{
		return e.toString();
	}
}
