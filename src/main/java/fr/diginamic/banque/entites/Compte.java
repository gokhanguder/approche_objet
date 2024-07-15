package fr.diginamic.banque.entites;

public class Compte {

    private int numeroCompte;
    public double soldeCompte;

    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
    }
}
