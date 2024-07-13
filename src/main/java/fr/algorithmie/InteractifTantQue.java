package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        System.out.println("Entre un nombre entre 1 et 10, svp! : ");
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt() ;

        while (nb < 1 || nb > 10){
            System.out.println("Le nombre n'est pas bon.\nEntre un nombre entre 1 et 10, svp! :  ");
            nb = scanner.nextInt();
        } System.out.println(nb);

        // Close the scanner
        scanner.close();
    }
}
