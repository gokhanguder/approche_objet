package fr.diginamic.chaines;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // Initialisation de la troisième liste
        List<String> liste3 = new ArrayList<String>();

        // Ajout des éléments de liste1 à liste3
        for (int i = 0; i < liste1.size(); i++) {
            liste3.add(liste1.get(i));
        }

        // Ajout des éléments de liste2 à liste3
        for (int i = 0; i < liste2.size(); i++) {
            liste3.add(liste2.get(i));
        }

        // Affichage de la liste fusionnée
        System.out.println("Liste fusionnée : " + liste3);


    }
}
