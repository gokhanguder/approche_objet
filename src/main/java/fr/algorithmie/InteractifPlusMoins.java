package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        //choisit un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int randomNombre = random.nextInt(100) + 1;
        System.out.println(randomNombre);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entre 1 et 100 :");
        int nb = scanner.nextInt();

        int compte = 0;

        while (nb != randomNombre) {
            if (nb < 1 || nb > 100) {
                System.out.print("Entrez un nombre entre 1 et 100 : ");
                nb = scanner.nextInt();
                continue;
            }

            if (nb < randomNombre) {
                System.out.println("Il est au-dessous de mon nombre. Deviner encore :");
            } else {
                System.out.println("Il est au-dessus de mon nombre. Deviner encore :");
            }

            nb = scanner.nextInt();
            compte++;

        } compte++;
        System.out.println("Bravo! Vous avez trouve mon nombre, apres " + compte + "tentative. Il est :" + randomNombre);

        // Close the scanner
        scanner.close();
    }
}
