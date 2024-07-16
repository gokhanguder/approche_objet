package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    public String toString(){
        return super.toString() + ", tauxRemuneration=" + tauxRemuneration;
    }
}