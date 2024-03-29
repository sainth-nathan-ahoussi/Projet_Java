package banque;

public abstract class Salarie {
	protected int salaire = 0;

	public int getSalaire() {
		return this.salaire;
	}
	
	public abstract void verserSalaire(int Salaire);

}
