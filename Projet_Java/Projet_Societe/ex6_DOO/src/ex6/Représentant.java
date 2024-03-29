package ex6;

public abstract class Représentant  extends Employee {
	private int  VenteMensuel;

	public Représentant(String nom, String prenom, int age, int anneedebut, int venteMensuel) {
		super(nom, prenom, age, anneedebut);
		this.VenteMensuel = venteMensuel ; 
		// TODO Auto-generated constructor stub
	}

	public int getVenteMensuel() {
		return VenteMensuel;
	}

	public void setVenteMensuel(int venteMensuel) {
		VenteMensuel = venteMensuel;
	}

	
}
