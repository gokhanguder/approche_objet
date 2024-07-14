package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.print("Entrez le nombre #" + i + " : ");
            array[i-1] = scanner.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Le plus grand nombre : " + max);

        // Close the scanner
        scanner.close();
    }
}
