package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        // Créer deux instances d'AdressePostale
        AdressePostale adresse1 = new AdressePostale(1, "Rue Haute",30900, "Nimes");
        AdressePostale adresse2 = new AdressePostale(195,"Rue Edmond Carriere", 30900,"Nimes");

        adresse1.numeroRue = 1;
        adresse1.libelleRue = "Rue Haute";
        adresse1.codePostal = 30900;
        adresse1.ville = "Nimes";

        adresse2.numeroRue = 195;
        adresse2.libelleRue = "Rue Edmond Carriere";
        adresse2.codePostal = 30900;
        adresse2.ville = "Nimes";

    }
}
