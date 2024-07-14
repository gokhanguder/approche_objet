package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        System.out.println("Entre un nombre positif, svp! : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        while (nb <= 0) {
            System.out.println("Le nombre doit etre positif.\nEntre un nombre positif, svp! : ");
            nb = scanner.nextInt();
        }

        int som = 0;
        for (int i = 0; i < nb; i++) {
            som = som + i;
        }
        System.out.print("La somme de tous les entiers compris entre 1 et ce nombre : " + som);
        //System.out.println(Arrays.stream(array).sum());

        // Close the scanner
        scanner.close();
    }
}