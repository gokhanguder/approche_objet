package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        System.out.println("Entre un nombre entre 1 et 10, svp! : ");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;

        while (nb < 1 || nb > 10){
            System.out.println("Le nombre n'est pas bon.\nEntre un nombre entre 1 et 10, svp! :  ");
            nb = scanner.nextInt();
        }
        System.out.println("Table de " + nb + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(nb+" * "+ i +" = " + nb*i);
        }
        // Close the scanner
        scanner.close();
    }
}
