package main;

public class Ressource {
    private String farbe;
    private int anzahl;

    public Ressource(String pFarbe, int pAnzahl) {
        farbe = pFarbe;
        anzahl = pAnzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int pAnzahl) {
        anzahl = pAnzahl;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String pFarbe) {
        farbe = pFarbe;
    }
}
