package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {

    public static void main(String[] args) {

        String[] villes = {"Paris", "Nimes", "Nice", "Lille", "Lyon"};

        //  Affichez les 5 éléments du tableau
        System.out.println(Arrays.toString(villes));
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);

        // Affichez la longueur du tableau
        System.out.println(villes.length);

        // Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
        villes[3] = "Reims";

        //Affichez les 5 éléments du tableau
        System.out.println(Arrays.toString(villes));
        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);
    }
}
