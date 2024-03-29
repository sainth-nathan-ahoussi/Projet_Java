package banque;

public class Employe extends Salarie {
	public void verserSalaire(int Salaire) {
		salaire = Salaire;
		System.out.println ("Versement de salaire sur compte externe " + salaire);
	}
}
