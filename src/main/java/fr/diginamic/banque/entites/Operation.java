package fr.diginamic.banque.entites;

public abstract class Operation {

    public String dateOperation;
    public double montantOperation;

    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

}
