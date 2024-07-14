package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        System.out.println("Entre un nombre, svp! : ");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        System.out.print("Les 10 nombres suivants sont : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(nb + i + ", ");
        }

        // Close the scanner
        scanner.close();
    }
}
