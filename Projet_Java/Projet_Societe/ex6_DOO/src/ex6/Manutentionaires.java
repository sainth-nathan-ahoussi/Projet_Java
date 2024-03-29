package ex6;

public abstract class Manutentionaires extends Employee{
	private int NbHeureTravail ;
	
	public Manutentionaires(String nom, String prenom, int age, int anneedebut, int nbHeureTravail ) {
		super(nom, prenom, age, anneedebut);
		this.NbHeureTravail = nbHeureTravail ; 
		// TODO Auto-generated constructor stub
	}
	
	public double calculSalaire() {
        return NbHeureTravail * 15;
    }
	

	public int getNbHeureTravail() {
		return NbHeureTravail;
	}

	public void setNbHeureTravail(int nbHeureTravail) {
		NbHeureTravail = nbHeureTravail;
	}
	
	

}
