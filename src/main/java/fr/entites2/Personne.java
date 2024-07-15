package fr.entites2;

import fr.entites.AdressePostale;

public class Personne {
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public void afficher() {
        System.out.println("Nom : " + nom.toUpperCase());
        System.out.println("Prenom : " + prenom);
    }

    // Méthode pour modifier le nom
    public void setNom(String nom){
        this.nom = nom;
    }

    // Méthode pour modifier le prénom
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    // Méthode pour modifier l'adresse
    public void setAdresse(AdressePostale adresse){
        this.adresse = adresse;
    }

    // Méthodes pour retourner les attributs
    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public AdressePostale getAdresse(){
        return adresse;
    }

}
