package photos.modeles;

import java.io.File; 
import java.util.*;

public class Photo implements Comparable {
	private String nomPays;
	private int AnneePriseVue;
	private String Commentaire;
	private String nomFichier;
	private long tailleFichier;

	public Photo(String nompays, int anneepriseVue, String commentaire, String nomfichier ) {
		this.nomPays = nompays ;
		this.AnneePriseVue =anneepriseVue ;
		this.Commentaire = commentaire ;
		this.nomFichier = nomfichier ;


		File file = new File(nomFichier);
		if(file.exists()){ 
			this.tailleFichier = file.length() ;
		}else {
			this.tailleFichier = 0 ;
		}
	}
	
	public int compareTo (Object o) {
		Photo f1 = (Photo) o;
		if (this.tailleFichier > f1.tailleFichier) {
			return +1;
		}else if (this.tailleFichier < f1.tailleFichier) {
			return -1;
		}
		return 0;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getAnneePriseVue() {
		return AnneePriseVue;
	}

	public void setAnneePriseVue(int anneePriseVue) {
		AnneePriseVue = anneePriseVue;
	}

	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public long getTailleFichier() {
		return tailleFichier;
	}

	public void setTailleFichier(int tailleFichier) {
		this.tailleFichier = tailleFichier;
	}
	
	
	public static void main(String[] args){
		Photo photo1 = new Photo("Côte d'Ivoire", 2004, "Le Roi","Lion_d'Afrique.jpg" );
		Photo photo2 = new Photo("Mali", 2000, "Tigre", "lyon.jpg");
		
		int comparaison = photo1.compareTo(photo2);
		if (comparaison < 0) {
			System.out.println("Lion_d'Afrique.jpg est plus petite que lyon.jpg ");
		}else if ( comparaison > 0) {
			System.out.println("Lion_d'Afrique.jpg est plus grande que lyon.jpg ");
		}else {
			System.out.println("Les deux photos ont la même taille ");
		}
	}
}
	
	
	


