package fr.diginamic.chaines;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {

    public static void main(String[] args) {

        Ville v1 = new Ville(343000, "Nice");
        Ville v2 = new Ville(47800, "Carcassonne");
        Ville v3 = new Ville(53400, "Narbonne");
        Ville v4 = new Ville(484000, "Lyon");
        Ville v5 = new Ville(9700, "Foix");
        Ville v6 = new Ville(77200, "Pau");
        Ville v7 = new Ville(850700, "Marseille");
        Ville v8 = new Ville(40600, "Tarbes");

        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(v1);
        villes.add(v2);
        villes.add(v3);
        villes.add(v4);
        villes.add(v5);
        villes.add(v6);
        villes.add(v7);
        villes.add(v8);

        // Trouver la ville avec le plus grand nombre d'habitants
        Ville villePlusGrande = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbrHabitants() > villePlusGrande.getNbrHabitants()) {
                villePlusGrande = ville;
            }
        }

        System.out.println("\nLa plus grande ville : " + villePlusGrande.getNom() + " avec " + villePlusGrande.getNbrHabitants() + " habitants");

        // Trouver la ville avec le plus petit nombre d'habitants
        Ville villePlusPetite = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbrHabitants() < villePlusPetite.getNbrHabitants()) {
                villePlusPetite = ville;
            }
        }

        System.out.println("\nLa plus petite ville : " + villePlusPetite.getNom() + " avec " + villePlusPetite.getNbrHabitants() + " habitants");

        // Supprimer la ville avec le plus petit nombre d'habitants en utilisant un Iterator
        Iterator<Ville> iterator = villes.iterator();
        while (iterator.hasNext()) {
            Ville ville = iterator.next();
            if (ville.equals(villePlusPetite)) {
                iterator.remove();
            }
        }

        // Afficher la liste des villes restantes
        System.out.println("\nListe des villes restantes :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " avec " + ville.getNbrHabitants() + " habitants");
        }

        // Modifier les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville ville : villes) {
            if (ville.getNbrHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        // Afficher la liste des villes restantes avec les noms en majuscules pour celles de plus de 100,000 habitants
        System.out.println("\nListe des villes - les noms en majuscules pour celles de plus de 100,000 habitants :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " avec " + ville.getNbrHabitants() + " habitants");
        }
    }
}