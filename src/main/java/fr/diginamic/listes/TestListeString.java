package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        // Rechercher la ville avec le plus grand nombre de lettres
        String ville1 = "";
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).length() > ville1.length()) {
                ville1 = villes.get(i);
            }
        }

        System.out.println("La ville avec le plus grand nombre de lettres est : " + ville1);

        // Mettre tous les noms de villes en majuscules
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste après mise en majuscules : " + villes);

        // Supprimer les villes dont le nom commence par la lettre "N"
        ListIterator<String> iterator = villes.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("N")) {
                iterator.remove();
            }
        }

        System.out.println("Liste après suppression des villes commençant par 'N' : " + villes);
    }
}

