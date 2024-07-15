package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {

        // Créez une instance de la classe Compte avec un numéro et un solde
        Compte compte = new Compte("FR&12337889", 785.2);

        compte.setSoldeCompte(768);

        // Affichez l'instance créée
        System.out.println(compte);

    }
}
