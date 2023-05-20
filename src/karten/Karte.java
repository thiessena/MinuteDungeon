package karten;

import netzwerk.NetObject;
import netzwerk.NetTrennzeichen;

/**
 * Eine allgemeine Karte, die verdeckt und ausgewaehlt werden kann.
 * Die Karte hat eine Farbe, die sich auf die Rückseite der Karte bezieht.
 * 
 * @author @hammhamm1, @HerrInfo
 */
public class Karte implements NetObject {

    private boolean verdeckt;
    private boolean ausgewaehlt;
    private String farbe;

    public Karte() {
        verdeckt = false;
        farbe = "";
        ausgewaehlt = false;
    }

    public Karte(String pFarbe) {
        farbe = pFarbe;
        verdeckt = false;
        ausgewaehlt = false;
    }

    public Karte(String pFarbe, boolean pVerdeckt) {
        farbe = pFarbe;
        verdeckt = pVerdeckt;
        ausgewaehlt = false;
    }

    public Karte(String pFarbe, boolean pVerdeckt, boolean pAusgewaehlt) {
        farbe = pFarbe;
        verdeckt = pVerdeckt;
        ausgewaehlt = pAusgewaehlt;
    }

    /**
     * Gibt einen String mit den Informationen der Karte zurueck.
     * Beispiele:
     * - Die verdeckte Karte: [gelb]
     * - Offene Karte: []
     * - ausgewaehlte und verdeckte Karte: {[rot]}
     * - ausgewaehlte und offene Karte: {[]}
     */
    public String toString() {
        String output = verdeckt ? "[" + farbe + "]" : "[]";
        output = ausgewaehlt ? "{" + output + "}" : output;
        return output;
    }

    public boolean getVerdeckt() {
        return verdeckt;
    }

    public void setVerdeckt(boolean pVerdeckt) {
        verdeckt = pVerdeckt;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String pFarbe) {
        farbe = pFarbe;
    }

    public boolean getAusgewaehlt() {
        return ausgewaehlt;
    }

    public void setAusgewaehlt(boolean pAusgewaehlt) {
        ausgewaehlt = pAusgewaehlt;
    }

    /**
     * Gibt eine String-Representation der Karte zurueck, fuer den Versand
     * uebers Netzwerk
     * 
     * @return String verdeckt%farbe
     */
    public String toNetString() {
        return verdeckt + NetTrennzeichen.KARTEN_TRENNZEICHEN +
                ausgewaehlt + NetTrennzeichen.KARTEN_TRENNZEICHEN +
                farbe;
    }

    /**
     * Gibt eine Karte zurÃ¼ck, die die Eigenschaften des NetStrings beeinhaltet.
     * 
     * @param pNetString
     * @return Karte
     */
    public void fromNetString(String pNetString) {
        String[] daten = pNetString.split(NetTrennzeichen.KARTEN_TRENNZEICHEN);
        verdeckt = Boolean.parseBoolean(daten[0]);
        ausgewaehlt = Boolean.parseBoolean(daten[1]);
        farbe = daten[2];
    }
}
