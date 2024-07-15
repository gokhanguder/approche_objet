package fr.entites;

import fr.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // Créer deux instances d'AdressePostale
        Personne personne1 = new Personne();
        Personne personne2 = new Personne();

        personne1.nom = "Doe";
        personne1.prenom = "John";

        personne2.nom = "Dupont";
        personne2.prenom = "Joe";


        // Créer deux instances d'AdressePostale
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 123;
        adresse1.libelleRue = "Rue de la Paix";
        adresse1.codePostal = 75002;
        adresse1.ville = "Paris";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 456;
        adresse2.libelleRue = "Avenue des Champs-Élysées";
        adresse2.codePostal = 75008;
        adresse2.ville = "Paris";

    }
}
