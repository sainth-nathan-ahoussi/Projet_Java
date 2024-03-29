package ex6;

public abstract class Venduer extends Employee {
	private int VenteMensuel;

	public Venduer(String nom, String prenom, int age, int anneedebut, int venteMensuel) {
		super(nom, prenom, age, anneedebut);
		this.VenteMensuel = venteMensuel ; 
		// TODO Auto-generated constructor stub
	}
	public double calculSalaire() {
        return VenteMensuel * 0.2 + 200;
    }

	public int getVenteMensuel() {
		return VenteMensuel;
	}

	public void setVenteMensuel(int venteMensuel) {
		VenteMensuel = venteMensuel;
	}
	
	
	

}
