package banque;

public class ClientInterne extends Salarie {
	private Compte compte ; 
	
	ClientInterne(Compte Compte){
		this.compte = Compte;
	}
	
	public Compte getCompte() {
		return this.compte;
	}

	public void verserSalaire(int Salaire) {
		salaire = Salaire;
	}
}
