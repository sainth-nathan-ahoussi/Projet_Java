package ex6;

public class Employee {

	private String Nom;
    private String Prenom;
    private int age;
    private int AnneeDebut;

    public Employee(String nom, String prenom, int age, int anneedebut) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.age = age;
        this.AnneeDebut = anneedebut;
    }
    
    public double calculSalaire() {
		return 0;
	}

    public String getNom() {
        return "L'employé " + "" +  Nom ;
    }

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAnneeDebut() {
		return AnneeDebut;
	}

	public void setAnneeDebut(int anneeDebut) {
		AnneeDebut = anneeDebut;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
    
    
}
