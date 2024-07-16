package fr.diginamic.banque.entites;

public class Compte {

    private String numeroCompte;
    public double soldeCompte;

    public Compte(String numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    void setNumeroCompte(String  numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    @Override
    public String toString() {
        return "numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte ;
    }
}
