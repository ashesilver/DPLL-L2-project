package basicClasses;

public class Visiteur implements MonVisiteur {
	
	
	//estEt
	boolean estEt (Et objet) {
		return true;
	}
	boolean estEt (Ou objet){
		return false;
	}
	bool1ean estEt (Implication objet) {
		return false;
	}
	boolean estEt (Equivalence objet) {
		return false;
	}
	boolean estEt (Var objet) {
		return false;
	}
	boolean estEt (Top objet) {
		return false;
	}
	boolean estEt (Bot objet) {
		return false;
	}
	boolean estEt (Non objet) {
		return false;
	}
	
	//estTop
	
	boolean estTop (Et objet) {
		return false;
	}
	boolean estTop (Ou objet) {
		return false;
	}
	boolean estTop (Implication objet) {
		return false;
	}
	boolean estTop (Equivalence objet) {
		return false;
	}
	boolean estTop (Var objet) {
		return false;
	}
	boolean estTop (Top objet) {
		return true;
	}
	boolean estTop (Bot objet) {
		return false;
	}
	boolean estTop (Non objet) {
		return false;
	}
	
	
	//estBot
	
	boolean estBot (Et objet) {
		return false;
	}
	boolean estBot (Ou objet) {
		return false;
	}
	boolean estBot (Implication objet) {
		return false;
	}
	boolean estBot (Equivalence objet) {
		return false;
	}
	boolean estBot (Var objet) {
		return false;
	}
	boolean estBot (Top objet) {
		return false;
	}
	boolean estBot (Bot objet) {
		return true;
	}
	boolean estBot (Non objet) {
		return false;
	}
	
	//estVar
	
	boolean estVar (Et objet) {
		return false;
	}
	boolean estVar (Ou objet) {
		return false;
	}
	boolean estVar (Implication objet) {
		return false;
	}
	boolean estVar (Equivalence objet) {
		return false;
	}
	boolean estVar (Var objet) {
		return true;
	}
	boolean estVar (Top objet) {
		return false;
	}
	boolean estVar (Bot objet) {
		return false;
	}
	boolean estVar (Non objet) {
		return false;
	}
	
	//estNon 
	
	boolean estNon (Et objet) {
		return false;
	}
	boolean estNon (Ou objet) {
		return false;
	}
	boolean estNon (Implication objet) {
		return false;
	}
	boolean estNon (Equivalence objet) {
		return false;
	}
	boolean estNon (Var objet) {
		return false;
	}
	boolean estNon (Top objet) {
		return false;
	}
	boolean estNon (Bot objet) {
		return false;
	}
	boolean estNon (Non objet) {
		return true;
	}

}
