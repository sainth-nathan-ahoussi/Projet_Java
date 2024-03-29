package ex6;

public abstract class Technicien extends Employee{
     private int NbProduit; 
	
	
	public Technicien(String nom, String prenom, int age, int anneedebut, int nbProduit) {
		super(nom, prenom, age, anneedebut);
		this.NbProduit = nbProduit ; 
		// TODO Auto-generated constructor stub
	}
	
	 public double calculSalaire() {
	        return NbProduit * 10;
	    }

	public int getNbProduit() {
		return NbProduit;
	}

	public void setNbProduit(int nbProduit) {
		NbProduit = nbProduit;
	}

}
