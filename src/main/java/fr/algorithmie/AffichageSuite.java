package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {


        // Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus

        for (int i = 1; i <= 10; i++) {
            System.out.print(i +" ");
        }

        System.out.println();

        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        int i = 1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        int j = 0;
        while (j<=10){
            if(j%2==0){
            System.out.print(j+" ");}
            j++;
        }
        System.out.println();

        // Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        int k = 0;
        while (k<=9){
            if(k%2!=0){
                System.out.print(k+" ");}
            k++;
        }
        System.out.println();
    }
}
