package fr.diginamic.chaines;

public class TestEquals {
    public static void main(String[] args) {

        Ville ville1 = new Ville(30000, "Nimes");
        Ville ville2 = new Ville(30000, "Nimes");

        if (ville1 == ville2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (ville1.equals(ville2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Modifier un attribut et retester equals
        ville2.setNbrHabitants(40000);

        if (ville1.equals(ville2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Réinitialiser ville2 et retester avec ==
        if (ville1 == ville2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        ville2 = ville1;
        if (ville1 == ville2) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}
