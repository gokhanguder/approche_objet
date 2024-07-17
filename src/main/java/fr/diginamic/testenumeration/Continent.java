package fr.diginamic.testenumeration;

public enum Continent {
    ASIE("Asie"),
    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie"),
    AMERIQUE("Amérique");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
