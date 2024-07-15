package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {

        Compte compte = new Compte(123, 785.2);

        System.out.println("Numero de Compte : " + compte.getNumeroCompte());
        System.out.println("Solde de Compte : " + compte.soldeCompte);

    }
}
