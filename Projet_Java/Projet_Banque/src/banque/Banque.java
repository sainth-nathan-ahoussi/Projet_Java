package banque;

public class Banque {

	private static double tauxRemuneration = 0.01;
	private String NameBanque;
	private CompteCourant[] comptes;
	private int nombreComptes;
	
	Banque(String NameBanque){
		this.NameBanque = NameBanque;
		this.nombreComptes = 0;
		comptes = new CompteCourant[100] ;
	}
	

	public String getNameBanque() {
		return NameBanque;
	}


	public void setNameBanque(String nameBanque) {
		NameBanque = nameBanque;
	}


	public CompteCourant[] getComptes() {
		return comptes;
	}



	public void setComptes(CompteCourant compte) {
		comptes[nombreComptes] = compte;
		nombreComptes++;
	}


	public int getNombreComptes() {
		return nombreComptes;
	}

	public void parcourtCompte() {
		for(int i = 0; i < this.nombreComptes; i++ ) {
			System.out.println(comptes[i]);
		}
	}
	
	public void getComptes(Client nameClient)  {
		
	}
	
	public static double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public static void setTauxRemuneration(double tauxRemuneration) {
		Banque.tauxRemuneration = tauxRemuneration;
	}
	
	

	public static void main(String[] args){
		Client monClient = new Client(007, "Albert", "20 rue du Michelon 77800 ");
		Client monClient2 = new Client(101, "Christophe", "7 avenue du Generale de Gaule 17001 ");
		
		CompteCourant CompteCourant1 = new CompteCourant(007, 2000, 100, monClient ) ;
		CompteCourant CompteCourant2 = new CompteCourant(101, 12, 5 ,  monClient2 ) ;
				
		System.out.println(CompteCourant1.getProprietaire().getNameClient());

		System.out.println(CompteCourant2.getProprietaire().getNameClient());
		
		Banque Boursorama = new Banque("Boursorama");
		Banque Bred = new Banque("Bred");
		
		Boursorama.setComptes(CompteCourant1);
		Bred.setComptes(CompteCourant2);
		
		Compte compte = (Compte) CompteCourant1;
		Comptable comptable = (Comptable) CompteCourant1;
		
		//Boursorama.afficheCompte();
		//Bred.afficheCompte();
		
	}
}