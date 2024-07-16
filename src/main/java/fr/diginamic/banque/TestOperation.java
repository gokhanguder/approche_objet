package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

import java.text.DecimalFormat;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] ops = new Operation[8];

        ops[0] = new Credit("16.07.2024", 50);
        ops[1] = new Credit("17.07.2024", 100);
        ops[2] = new Credit("18.07.2024", 200);
        ops[3] = new Credit("19.07.2024", 11.8);
        ops[4] = new Debit("20.07.2024", 25.96);
        ops[5] = new Debit("21.07.2024", 22.9);
        ops[6] = new Debit("22.07.2024", 100);
        ops[7] = new Debit("23.07.2024", 250.2);


        for (int i = 0; i < ops.length; i++) {
            System.out.println("Operation " + i + " - Type : " + ops[i].getType() + ", Date : " + ops[i].dateOperation + ", Montant : " + ops[i].montantOperation + " Euros");
        }

        double montantGlobal = 0;
        DecimalFormat df = new DecimalFormat("#.##"); // 2 ondalık basamak formatı
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].getType().equals("CREDIT")) {
                montantGlobal += ops[i].montantOperation;
            } else {
                montantGlobal -= ops[i].montantOperation;
            }
        }

        System.out.println("Montant Global : " + df.format(montantGlobal) + " Euros");
    }
}