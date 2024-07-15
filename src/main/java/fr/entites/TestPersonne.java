package fr.entites;

import fr.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale();
        AdressePostale adresse2 = new AdressePostale();

        adresse1.numeroRue = 1;
        adresse1.libelleRue = "Rue Haute";
        adresse1.codePostal = 30900;
        adresse1.ville = "Nimes";

        adresse2.numeroRue = 195;
        adresse2.libelleRue = "Rue Edmond Carriere";
        adresse2.codePostal = 30900;
        adresse2.ville = "Nimes";

        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Doe";
        personne1.prenom = "John";
        personne1.adresse = adresse1;

        personne2.nom = "Dupont";
        personne2.prenom = "Joe";
        personne2.adresse = adresse2;


        System.out.println("Prenom : " + personne1.prenom);
        System.out.println("Nom : " + personne1.nom);
        System.out.println("Adresse Postal : " + personne1.adresse);

        System.out.println("Prenom : " + personne2.prenom);
        System.out.println("Nom : " + personne2.nom);
        System.out.println("Adresse Postal : " + personne2.adresse);

    }
}
