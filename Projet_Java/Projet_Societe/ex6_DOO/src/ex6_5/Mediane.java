package ex6_5;

public class Mediane {
	// Polymorphisme au niveau du paramètre qui est de type "interface"
	int mediane(MinMax mm) {
		return((mm.minimum()+mm.maximum())/2) ;
	}
	public static void main (String args []) {
		Mediane med = new Mediane ();
		MinMaxPaire mmPaire = new MinMaxPaire (); 
		mmPaire.setV1 (10); 
		mmPaire.setV2 (20); 

		System.out.println ("Valeur mediane pour une paire : " + med.mediane (mmPaire)); 

		MinMaxTriplet mmTriplet = new MinMaxTriplet();
		mmTriplet.setV1 (10); 
		mmTriplet.setV2 (20); 	   
		mmTriplet.setV3 (30); 	   
		System.out.println ("Valeur mediane pour un triplet : " + med.mediane (mmTriplet)); 
	}
}
