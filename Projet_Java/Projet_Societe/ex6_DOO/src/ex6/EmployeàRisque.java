package ex6;

public abstract class EmployeàRisque extends Employee {
	protected static final double Bonus_Risque = 250;

	public EmployeàRisque(String nom, String prenom, int age, int anneedebut) {
		super(nom, prenom, age, anneedebut);
		// TODO Auto-generated constructor stub
	}
	
	public double calculSalaire() {
		return super.calculSalaire() + Bonus_Risque;
		
	}

}
