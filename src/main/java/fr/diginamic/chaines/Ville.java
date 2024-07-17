package fr.diginamic.chaines;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville>{

    private String nom;
    private int population;
    private Continent continent;

    // Constructeur
    public Ville(int population, String nom, Continent continent) {
        this.population = population;
        this.nom = nom;
        this.continent = continent;
    }

    // Constructeur
    public Ville(int population, String nom) {
        this.population = population;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Continent getContinent() {
        return continent;
    }
    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ville ville = (Ville) obj;
        return population == ville.population && nom.equals(ville.nom);
    }

    // Méthode compareTo pour trier par nombre d'habitants
    @Override
    public int compareTo(Ville autreVille) {
        return Integer.compare(this.population, autreVille.population);
    }

    // Méthode toString pour afficher les informations de la ville
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", population=" + population +
                ", continent=" + continent.getLibelle() +
                '}';
    }
}
