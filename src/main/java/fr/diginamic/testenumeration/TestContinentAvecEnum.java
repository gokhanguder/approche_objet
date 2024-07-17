package fr.diginamic.testenumeration;

import fr.diginamic.chaines.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville(8419600, "New York", Continent.AMERIQUE));
        villes.add(new Ville(2140526, "Paris", Continent.EUROPE));
        villes.add(new Ville(21516000, "Pékin", Continent.ASIE));
        villes.add(new Ville(11920000, "Moscou", Continent.EUROPE));
        villes.add(new Ville(3644826, "Berlin", Continent.EUROPE));
        villes.add(new Ville(5312163, "Sydney", Continent.OCEANIE));
        villes.add(new Ville(12300000, "Sao Paulo", Continent.AMERIQUE));
        villes.add(new Ville(1146053, "Dakar", Continent.AFRIQUE));

        // Afficher les informations de chaque ville
        System.out.println("\nLa liste des villes avec ses continents :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
