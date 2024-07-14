package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int[] array = new int[10];

        while (true) {
            System.out.println("Sélectionnez une de ces options! Entre 1 ou 2, svp  \n" +
                    "1. Ajouter un nombre\n" +
                    "2. Afficher les nombres existants.");
            int nb = scanner.nextInt();

            if (nb == 1) {

                if (size >= array.length) {
                    int newSize = array.length * 2;
                    int[] newArray = new int[newSize];
                    for (int i = 0; i < array.length; i++) {
                        newArray[i] = array[i];
                    }
                    array = newArray;
                }

                System.out.println("Entrez un nombre pour ajouter à la tableau : ");
                int nombre = scanner.nextInt();
                array[size] = nombre;
                size++;
            } else if (nb == 2) {
                System.out.print("Les nombres existants sont : ");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Il faut entrer un nombre entre 1 et 2 :");
            }
        }
    }
}