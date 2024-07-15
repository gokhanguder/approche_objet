package fr.entites;

import fr.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adresse1 = new AdressePostale(1, "Rue Haute", 30900, "Nimes");
        AdressePostale adresse2 = new AdressePostale(195, "Rue Edmond Carriere", 30900, "Nimes");

        adresse1.numeroRue = 1;
        adresse1.libelleRue = "Rue Haute";
        adresse1.codePostal = 30900;
        adresse1.ville = "Nimes";


        Personne personne1 = new Personne("AHMET", "Ayse", adresse1);
        Personne personne2 = new Personne("FATMA", "Ayse", adresse2);

        System.out.println("Prenom : " + personne1.prenom);
        System.out.println("Nom : " + personne1.nom);
        System.out.println("Adresse : " + personne1.retournerAdresse().numeroRue + " " + personne1.retournerAdresse().libelleRue + ", " + personne1.retournerAdresse().codePostal + " " + personne1.retournerAdresse().ville);


        System.out.println("Prenom : " + personne2.prenom);
        System.out.println("Nom : " + personne2.nom);
        System.out.println("Adresse : " + personne2.retournerAdresse().numeroRue + " " + personne2.retournerAdresse().libelleRue + ", " + personne2.retournerAdresse().codePostal + " " + personne2.retournerAdresse().ville);

        // Créer des instances de Personne en utilisant le constructeur avec arguments
        Personne personne3 = new Personne("Dupont", "Jean");
        personne3.modifierAdresse(adresse1);

        Personne personne4 = new Personne("Martin", "Anne");
        personne4.modifierAdresse(adresse2);

        // Afficher les informations des personnes
        personne3.afficher();
        System.out.println("Adresse : " + personne3.retournerAdresse().numeroRue + " " + personne3.retournerAdresse().libelleRue + ", " + personne3.retournerAdresse().codePostal + " " + personne3.retournerAdresse().ville);

        personne4.afficher();
        System.out.println("Adresse : " + personne4.retournerAdresse().numeroRue + " " + personne4.retournerAdresse().libelleRue + ", " + personne4.retournerAdresse().codePostal + " " + personne4.retournerAdresse().ville);
    }
}
