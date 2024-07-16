package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        // Créez une instance de la classe Compte avec un numéro et un solde
        Compte compte = new Compte("FR12337889", 785.2);
        CompteTaux compteTaux = new CompteTaux("TR128906", 9000, 0.1);

        compte.setSoldeCompte(768);

        // Affichez l'instance créée
        System.out.println(compte);

        Compte[] comptes = new Compte[2];
        comptes[0] = compte;
        comptes[1] = compteTaux;


        for (int i = 0; i < comptes.length; i++) {
            System.out.println("Compte " + i + " : " + comptes[i]);
        }
        for (Compte cpt : comptes) {
            System.out.println("Compte " + cpt);
        }
    }
}