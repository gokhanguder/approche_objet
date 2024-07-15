package fr.entites;

import fr.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale(1, "Rue Haute", 30900, "Nimes");
        AdressePostale adresse2 = new AdressePostale(195, "Rue Edmond Carriere", 30900, "Nimes");

        Personne personne1 = new Personne("AHMET", "Ayse", adresse1);
        Personne personne2 = new Personne("FATMA", "Ayse", adresse2);

        // Créer des instances de Personne en utilisant le constructeur avec arguments
        Personne personne3 = new Personne("Dupont", "Jean");
        personne3.setAdresse(adresse1);

        Personne personne4 = new Personne("Martin", "Anne");
        personne4.setAdresse(adresse2);

        // Afficher les informations des personnes
        personne3.afficher();
        System.out.println("Adresse : " + personne3.getAdresse().numeroRue + " " + personne3.getAdresse().libelleRue + ", " + personne3.getAdresse().codePostal + " " + personne3.getAdresse().ville);

        personne4.afficher();
        System.out.println("Adresse : " + personne4.getAdresse().numeroRue + " " + personne4.getAdresse().libelleRue + ", " + personne4.getAdresse().codePostal + " " + personne4.getAdresse().ville);
    }
}
