package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {

        //On calcule une valeur booléenne qui contrôle le tableau de la sorte :
        // o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et
        // que le premier et le dernier élément du tableau ont la même valeur
        // o elle vaut false dans les autres cas

    int[] array = {1,1,2};

    boolean b = array.length >= 1 && array[0] == array[array.length-1];

        System.out.println(b);
    }
}
