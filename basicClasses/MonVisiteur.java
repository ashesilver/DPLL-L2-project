package basicClasses;

public interface MonVisiteur {
	boolean estEt (Et objet);
	boolean estEt (Ou objet);
	boolean estEt (Implication objet);
	boolean estEt (Equivalence objet);
	boolean estEt (Var objet);
	boolean estEt (Top objet);
	boolean estEt (Bot objet);
	boolean estEt (Non objet);
	
	
	
	
	boolean estTop (Et objet);
	boolean estTop (Ou objet);
	boolean estTop (Implication objet);
	boolean estTop (Equivalence objet);
	boolean estTop (Var objet);
	boolean estTop (Top objet);
	boolean estTop (Bot objet);
	boolean estTop (Non objet);
	
	
	boolean estBot (Et objet);
	boolean estBot (Ou objet);
	boolean estBot (Implication objet);
	boolean estBot (Equivalence objet);
	boolean estBot (Var objet);
	boolean estBot (Top objet);
	boolean estBot (Bot objet);
	boolean estBot (Non objet);
	
	
	boolean estVar (Et objet);
	boolean estVar (Ou objet);
	boolean estVar (Implication objet);
	boolean estVar (Equivalence objet);
	boolean estVar (Var objet);
	boolean estVar (Top objet);
	boolean estVar (Bot objet);
	boolean estVar (Non objet);
	
	
	boolean estNon (Et objet);
	boolean estNon (Ou objet);
	boolean estNon (Implication objet);
	boolean estNon (Equivalence objet);
	boolean estNon (Var objet);
	boolean estNon (Top objet);
	boolean estNon (Bot objet);
	boolean estNon (Non objet);

}
