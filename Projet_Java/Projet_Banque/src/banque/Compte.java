package banque;

public abstract class Compte implements Comptable{
	protected Banque saBanque;
	protected  int numberCompte;
	protected  Client proprietaire;
	protected  double soldeCompte;

	public Banque getSaBanque() {

		return saBanque;
	}
	public void setSaBanque(Banque saBanque) {
		this.saBanque = saBanque;
	} 
	
	public void setNumberCompte(int numberCompte) {
		this.numberCompte = numberCompte;
	}
	public int getNumberCompte() {
		return numberCompte;
	}
	
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public Client getProprietaire() {
		return proprietaire;
	}
	
	public double getSoldeCompte() {
		return soldeCompte;
	}
}