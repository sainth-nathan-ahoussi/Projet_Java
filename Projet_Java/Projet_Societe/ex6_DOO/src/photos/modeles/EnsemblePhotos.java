package photos.modeles;

import java.util.ArrayList;

public interface EnsemblePhotos {
     void ajouterPhoto(Photo photo);
     void supprimer(Photo photo);
     boolean estVide();
     ArrayList<Photo> RechercheParMotCle(String MotCle);
     int nombrePhotos();
     void trierParTaille();
     
}
