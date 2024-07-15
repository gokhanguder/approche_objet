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
    public void modifierNom(String nomModifie){
        this.nom = nomModifie;
    }

    // Méthode pour modifier le prénom
    public void modifierPrenom(String prenomModifie){
        this.prenom = prenomModifie;
    }

    // Méthode pour modifier l'adresse
    public void modifierAdresse(AdressePostale adresseModifiee){
        this.adresse = adresseModifiee;
    }

    // Méthodes pour retourner les attributs
    public String retournerNom(){
        return nom;
    }

    public String retournerPrenom(){
        return prenom;
    }

    public AdressePostale retournerAdresse(){
        return adresse;
    }

}
