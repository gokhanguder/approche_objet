package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        //Créer un tableau qui contient la somme des 2 précédents tableaux
        int length = 0;
        if (array1.length > array2.length) {
            length = array1.length;
        } else length = array2.length;

        int[] array3 = new int[length];

        for (int i = 0; i < array3.length; i++) {
            if (i < array2.length) {
                array3[i] = array1[i] + array2[i];
            } else
                array3[i] = array1[i];
        }
        System.out.println("Le tableau qui contient la somme des 2 précédents tableaux :");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}