package fr.diginamic.chaines;

import java.util.*;

public class TestVilles {

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(
                new Ville(343000, "Nice"),
                new Ville(47800, "Carcassonne"),
                new Ville(53400, "Narbonne"),
                new Ville(484000, "Lyon"),
                new Ville(9700, "Foix"),
                new Ville(77200, "Pau"),
                new Ville(850700, "Marseille"),
                new Ville(40600, "Tarbes")
        ));

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

        // Trier la liste des villes par nom
        Collections.sort(villes, Comparator.comparing(Ville::getNom));
        System.out.println("\nVilles triées par nom:");
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        // Trier la liste des villes par population
        Collections.sort(villes);

        // Afficher les résultats
        System.out.println("\nLa liste des villes en ordre par population :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}