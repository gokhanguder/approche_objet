package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        // Tüm sezonları döngü ile yazdır
        for (Saison saison : Saison.values()) {
            System.out.println(saison.getLibelle() + " (" + saison.getOrdre() + ")");
        }

        // "ETE" adlı sezonu bulun ve yazdır
        String nom = "ETE";
        Saison saisonEte = Saison.valueOf(nom);
        System.out.println("\nNom: " + nom + " -> Libelle: " + saisonEte.getLibelle());

        // "Hiver" adlı sezonu libellé ile bulun ve yazdır
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getByLibelle(libelle);
        System.out.println("\nLibelle: " + libelle + " -> Saison: " + saisonHiver.getLibelle());
    }
}