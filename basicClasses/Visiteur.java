package basicClasses;

public class Visiteur implements MonVisiteur {
	
	
	//estEt
	public boolean estEt (Et objet) {
		return true;
	}
	public boolean estEt (Ou objet){
		return false;
	}
	public boolean estEt (Implication objet) {
		return false;
	}
	public boolean estEt (Equivalence objet) {
		return false;
	}
	public boolean estEt (Var objet) {
		return false;
	}
	public boolean estEt (Top objet) {
		return false;
	}
	public boolean estEt (Bot objet) {
		return false;
	}
	public boolean estEt (Non objet) {
		return false;
	}
	
	//estTop
	
	public boolean estTop (Et objet) {
		return false;
	}
	public boolean estTop (Ou objet) {
		return false;
	}
	public boolean estTop (Implication objet) {
		return false;
	}
	public boolean estTop (Equivalence objet) {
		return false;
	}
	public boolean estTop (Var objet) {
		return false;
	}
	public boolean estTop (Top objet) {
		return true;
	}
	public boolean estTop (Bot objet) {
		return false;
	}
	public boolean estTop (Non objet) {
		return false;
	}
	
	//estBot
	
	public boolean estBot (Et objet) {
		return false;
	}
	public boolean estBot (Ou objet) {
		return false;
	}
	public boolean estBot (Implication objet) {
		return false;
	}
	public boolean estBot (Equivalence objet) {
		return false;
	}
	public boolean estBot (Var objet) {
		return false;
	}
	public boolean estBot (Top objet) {
		return false;
	}
	public boolean estBot (Bot objet) {
		return true;
	}
	public boolean estBot (Non objet) {
		return false;
	}
	
	//estVar
	
	public boolean estVar (Et objet) {
		return false;
	}
	public boolean estVar (Ou objet) {
		return false;
	}
	public boolean estVar (Implication objet) {
		return false;
	}
	public boolean estVar (Equivalence objet) {
		return false;
	}
	public boolean estVar (Var objet) {
		return true;
	}
	public boolean estVar (Top objet) {
		return false;
	}
	public boolean estVar (Bot objet) {
		return false;
	}
	public boolean estVar (Non objet) {
		return false;
	}
	
	//estNon 
	
	public boolean estNon (Et objet) {
		return false;
	}
	public boolean estNon (Ou objet) {
		return false;
	}
	public boolean estNon (Implication objet) {
		return false;
	}
	public boolean estNon (Equivalence objet) {
		return false;
	}
	public boolean estNon (Var objet) {
		return false;
	}
	public boolean estNon (Top objet) {
		return false;
	}
	public boolean estNon (Bot objet) {
		return false;
	}
	public boolean estNon (Non objet) {
		return true;
	}

}
