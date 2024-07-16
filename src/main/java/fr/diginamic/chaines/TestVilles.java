package fr.diginamic.chaines;

import java.util.ArrayList;

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
        Ville ville1 = new Ville(0, "");
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).nbrHabitants > ville1.nbrHabitants) {
                ville1.nbrHabitants = villes.get(i).nbrHabitants;
                ville1.nom = villes.get(i).nom;
            }
        }

        System.out.println("\nLa plus grande ville : " + ville1.getNom() + " avec " + ville1.getNbrHabitants() + " habitants");

        // Trouver et supprimer la ville avec le plus petit nombre d'habitants
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).nbrHabitants < ville1.nbrHabitants) {
                ville1.nbrHabitants = villes.get(i).nbrHabitants;
                ville1.nom = villes.get(i).nom;

            }
        }
        System.out.println("\nLa plus petite ville : " + ville1.getNom() + " avec " + ville1.getNbrHabitants() + " habitants");

        villes.remove(ville1);

        // Afficher la liste des villes restantes
        System.out.println("\nListe des villes restantes :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " avec " + ville.getNbrHabitants() + " habitants");
        }

        //Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbrHabitants() > 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }

        // Afficher la liste des villes restantes
        System.out.println("\nListe des villes - les nom en majuscule pour celui de plus de 100,000 habitants :");
        for (Ville ville : villes) {
            System.out.println(ville.getNom() + " avec " + ville.getNbrHabitants() + " habitants");
        }
    }
}