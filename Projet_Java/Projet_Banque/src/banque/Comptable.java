package banque;

public interface Comptable {
		double debiter(double montant);
		void crediter(double montant);
		double getSolde();
		
}
