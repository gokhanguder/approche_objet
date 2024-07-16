package fr.diginamic.listes;

import java.util.ArrayList;

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

        String ville1 = "";
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).length() > ville1.length()) {
                ville1 = villes.get(i);
            }
        }

        System.out.println("La ville avec le plus grand nombre de lettres est : " + ville1);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste après mise en majuscules : " + villes);

        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).startsWith("N")) {
                villes.remove(villes.get(i));
            }
        }

        System.out.println("Liste après suppression des villes commençant par 'N' : " + villes);
    }
}

