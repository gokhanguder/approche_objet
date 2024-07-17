package fr.diginamic.chaines;

public class Ville implements Comparable<Ville>{

    public String nom;
    public int nbrHabitants;

    public Ville(int nbrHabitants, String nom) {
        this.nbrHabitants = nbrHabitants;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
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
        return nbrHabitants == ville.nbrHabitants && nom.equals(ville.nom);
    }

    // Méthode compareTo pour trier par nombre d'habitants
    @Override
    public int compareTo(Ville autreVille) {
        return Integer.compare(this.nbrHabitants, autreVille.nbrHabitants);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", population=" + nbrHabitants +
                '}';
    }
}
