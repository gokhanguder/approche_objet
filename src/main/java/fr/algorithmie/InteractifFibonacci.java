package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb;

        while (true) {
            System.out.print("Entrez un nombre entier comme N (>= 2): ");
            nb = scanner.nextInt();
            if (nb >= 2) {
                break;
            }
            System.out.println("Veuillez entrer un nombre supérieur ou égal à 2.");
        }

        int[] Fibonacci = new int[nb];

        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for (int i = 2; i < nb; i++) {
            Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
        }
        System.out.println("Le nombre de rang N : " + Fibonacci[nb-1]);
        // Close the scanner
        scanner.close();
    }
}