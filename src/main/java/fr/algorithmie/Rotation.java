package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {


        //  Effectuez une rotation à droite des éléments.
        // • Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}


        int[] a = {0, 1, 2, 3,5,8};

        int[] b = new int[a.length];

        b[0] = a[a.length - 1];
        for (int i = 1; i < b.length; i++) {
            b[i] = a[i-1];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
