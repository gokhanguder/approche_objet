package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        long debut = System.currentTimeMillis();
        String list = "";
        for (int i = 0; i < 100000 ; i++) {
            list+=i;
                    }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        // Crée une instance de StringBuilder
        long debut1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        // Ajoute tous les nombres de 1 à 100 000 dans l'instance de StringBuilder
        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));

    }
}
