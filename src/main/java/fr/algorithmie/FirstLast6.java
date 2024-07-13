package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        //On calcule une valeur booléenne qui contrôle le tableau de la sorte :
        // - elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
        // - elle vaut false dans les autres cas • écrire l’algo de valorisation de cette variable avec le minimum de ligne

        case1();
        case2();
        case3();
        case4();

        //écrire l’algo de valorisation de cette variable avec le minimum de ligne
        int[] array = {};

        // Calculer la valeur booléenne en une seule ligne
        boolean b = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);

        // Afficher la valeur de b
        System.out.println(b);
    }

    public static void case1() {
        int[] array = {};


        boolean b = false;
        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            b = true;
        }
        System.out.println("Le tableau a zero elements : " + b);
    }

    public static void case2() {

        int[] array = {1};

        boolean b = false;
        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            b = true;
        }
        System.out.println("Le tableau a au moin un element mais pas 6 au debut ou a la fin : " + b);
    }

    public static void case3() {

        int[] array = {6, 1};

        boolean b = false;
        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            b = true;
        }
        System.out.println("Le tableau commence par 6 :" + b);
    }

    public static void case4() {
        int[] array = {1,6};

        boolean b = false;
        if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
            b = true;
        }
        System.out.println("Le tableau finit par 6 : " + b);
    }

}