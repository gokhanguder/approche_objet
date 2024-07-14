package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalNombreBatons = 21;

       while (true) {
           System.out.println("Choisissez le nombre de bâtons que vous voulez prendre entre 1 et 3 : ");

           int nb = scanner.nextInt();

           while (nb < 1 || nb > 3) {
               System.out.println("Veuillez choisir un nombre entre 1 et 3.");
               nb = scanner.nextInt();
           }
           System.out.println("Vous avez choisi : " + nb + " bâton(s).");

           totalNombreBatons = totalNombreBatons - nb;
           System.out.println("Il reste " + totalNombreBatons + " bâton(s).");

           if (totalNombreBatons <= 0){
               System.out.println("C'est dommage! Vous avez perdu !");
               break;
           }

           int randomNomre = random.nextInt( 3) +1;
           System.out.println("L'ordinateur a choisi " + randomNomre + " bâton(s).");
           totalNombreBatons = totalNombreBatons - randomNomre;
           System.out.println("Il reste " + totalNombreBatons + " bâton(s).");

           if (totalNombreBatons <= 0){
               System.out.println("Bravo ! Vous avez gagné !");
           }
       } // Close the scanner
        scanner.close();
    }
}