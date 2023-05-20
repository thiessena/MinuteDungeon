package karten;

public class Ereigniskarte extends Karte {

    protected String beschreibung;
    protected String name;
    protected int anzahl;

    /**
     * Konstruktor für Objekte der Klasse Ereigniskarte
     */
    public Ereigniskarte(String pName, String pBeschreibung) {
        super();
        name = pName;
        beschreibung = pBeschreibung;
        anzahl = 0;
    }

}
