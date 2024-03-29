package banque;

public class CompteCourant extends Compte {

	private static final int SEUIL_SECURITE  = 1000;
	private int SeuilD�couvert;

	public CompteCourant (int numberCompte, int soldeCompte, int SeuilD�couvert, Client proprietaire ) {
		this.numberCompte = numberCompte;
		this.soldeCompte = soldeCompte;
		this.SeuilD�couvert = SeuilD�couvert;
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
	    	 if (soldeCompte - montant >= SeuilD�couvert ) {
	    		soldeCompte -=  montant;
	    	} else {
	    		System.out.print (" Votre solde est inf�rieur au seuil de d�couvert autoris� ") ;
	    	}
		}else {
			 System.out.print (" ATTENTION tentative d�affectation suspecte d�un nouveau solde : compte n� " + this.numberCompte ) ;
		}
	}
	public int getSeuilD�couvert() {
		return SeuilD�couvert;
	}
	public void setSeuilD�couvert(int seuilD�couvert) {
		SeuilD�couvert = seuilD�couvert;
	}

	//public Client getProprietaire() {
		//return proprietaire;
	//}

	//public void setProprietaire(Client proprietaire) {
		//this.proprietaire = proprietaire;
	//}
}