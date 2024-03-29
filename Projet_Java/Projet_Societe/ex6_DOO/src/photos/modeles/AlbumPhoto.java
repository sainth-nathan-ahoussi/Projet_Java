package photos.modeles;

import java.util.ArrayList;
import java.util.Collections; 

public class AlbumPhoto implements EnsemblePhotos{
	private ArrayList<Photo> photos;
	
	public AlbumPhoto() {
		photos = new ArrayList<Photo>();
	}

	@Override
	public void ajouterPhoto(Photo p) {
		photos.add(p);
		
	}

	@Override
	public void supprimer(Photo p) {
		photos.remove(p);
		
	}

	@Override
	public boolean estVide() {
		return photos.isEmpty();
	}

	@Override
	public ArrayList<Photo> RechercheParMotCle(String MotCle) {
		ArrayList<Photo> result = new ArrayList<Photo>();
		for (Photo p : photos) {
			if(p.getCommentaire().contains(MotCle)) {
				result.add(p);
			}
		}
		return result; 
	}

	@Override
	public int nombrePhotos() {
		return photos.size();
	}

	@Override
	public void trierParTaille() {
		Collections.sort(photos);
		
	}
	
	

}
