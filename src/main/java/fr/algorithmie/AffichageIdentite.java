package fr.algorithmie;

public class AffichageIdentite {
    public static void main(String[] args) {

        //Utiliser une boucle for pour afficher 10 fois votre identité

        String identite = new String();
        identite = "Gokhan";

        for (int i = 0; i < 10; i++) {
            System.out.println( (i+1) + " : " + identite);
        }
    }
}