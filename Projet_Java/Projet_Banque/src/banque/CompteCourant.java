package banque;

public class CompteCourant extends Compte {

	private static final int SEUIL_SECURITE  = 1000;
	private int SeuilDécouvert;

	public CompteCourant (int numberCompte, int soldeCompte, int SeuilDécouvert, Client proprietaire ) {
		this.numberCompte = numberCompte;
		this.soldeCompte = soldeCompte;
		this.SeuilDécouvert = SeuilDécouvert;
		this.proprietaire = proprietaire;
	}

	
	public double debiter(double montant) {
		if (soldeCompte - montant > 0)
			soldeCompte = soldeCompte - montant ;
		return soldeCompte; 
	}
	
	public void crediter(double montant) {
		soldeCompte = soldeCompte + montant;
	}
	
	//public int getNumberCompte() {
		//return numberCompte;
	//}
	//public void setNumberCompte(int numberCompte) {
		//this.numberCompte = numberCompte;
	//}
	public double getSolde() {
		return soldeCompte;
	}
	public void setSoldeCompte(int montant) {
	    if (SEUIL_SECURITE >= montant) {
	    	 if (soldeCompte - montant >= SeuilDécouvert ) {
	    		soldeCompte -=  montant;
	    	} else {
	    		System.out.print (" Votre solde est inférieur au seuil de découvert autorisé ") ;
	    	}
		}else {
			 System.out.print (" ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte n° " + this.numberCompte ) ;
		}
	}
	public int getSeuilDécouvert() {
		return SeuilDécouvert;
	}
	public void setSeuilDécouvert(int seuilDécouvert) {
		SeuilDécouvert = seuilDécouvert;
	}

	//public Client getProprietaire() {
		//return proprietaire;
	//}

	//public void setProprietaire(Client proprietaire) {
		//this.proprietaire = proprietaire;
	//}
}