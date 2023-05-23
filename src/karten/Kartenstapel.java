package karten;

import netzwerk.NetTrennzeichen;

/**
 * Ein Kartenstapel, der Karten verwaltet und auf und zugedeckt werden kann.
 * 
 * @author @2Heinz4Guenther6
 */
public class Kartenstapel {
    private List<Karte> karten;
    private boolean aufgedeckt;

    public Kartenstapel() {
        karten = new List<Karte>();
        aufgedeckt = true;
    }

    public Kartenstapel(List<Karte> pKarten) {
        karten = pKarten;
        aufgedeckt = true;
    }

    /**
     * Gibt eine String-Repraesentation des Kartenstapels zurück.
     */
    public String toString() {
        String obersteKarte = aufgedeckt && getObersteKarte() != null ? getObersteKarte().toString() : "x";
        return "[" + obersteKarte + "(" + getAnzahl() + ")]";
    }

    /**
     * Mischt den Kartenstapel
     */
    public void mischen() {
        int anzahl = getAnzahl();
        for (int p = 0; p < anzahl / 3; p++) {
            karten.toFirst();
            Karte temp = karten.getContent();
            karten.remove();
            int r = (int) (Math.random() * anzahl);
            for (int i = 0; i < r; i++) {
                karten.next();
            }
            karten.insert(temp);
        }
    }

    /**
     * Deckt den Kartenstapel auf oder zu.
     * 
     * @param pAufgedeckt
     */
    public void setAufgedeckt(boolean pAufgedeckt) {
        aufgedeckt = pAufgedeckt;
    }

    /**
     * Gibt zurück, ob der Kartenstapel aufgedeckt ist.
     * 
     * @return aufgedeckt
     */
    public boolean getAufgedeckt() {
        return aufgedeckt;
    }

    /**
     * Gibt die oberste Karte des Kartenstapels zurück.
     * Falls es keine Karte im Stapel gibt, wird null zurückgegeben.
     * Die oberste Karte wird nicht entfernt.
     * 
     * @return
     */
    public Karte getObersteKarte() {
        karten.toFirst();
        return karten.getContent();
    }

    /**
     * Gibt die oberste Karte des Kartenstapels zurÃ¼ck.
     * Falls es keine Karte im Stapel gibt, wird null zurÃ¼ckgegeben.
     * Die oberste Karte wird aus dem Stapel entfernt.
     * 
     * @return
     */
    public Karte gibObersteKarte() {
        karten.toFirst();
        Karte k = karten.hasAccess() ? karten.getContent() : null;
        karten.remove();
        return k;
    }

    /**
     * Gibt eine Liste mit n Karten vom Stapel, falls der Karten soviele Karten
     * enthaelt.
     * Die Karten werden aus dem Kartenstapel entfernt.
     * 
     * @param n
     * @return
     */
    public List<Karte> gibObersteKarten(int n) {
        List<Karte> temp = new List<Karte>();
        int p = 0;
        karten.toFirst();
        while (karten.hasAccess() && p < n) {
            Karte neu = karten.getContent();
            temp.append(neu);
            karten.remove();
            p++;
        }
        return temp;
    }

    /**
     * Legt eine Karte unter den Kartenstapel
     * 
     * @param pKarte
     */
    public void legeUntenDrunter(Karte pKarte) {
        karten.append(pKarte);
    }

    /**
     * Legt eine Karte auf den Kartenstapel
     * 
     * @param pKarte
     */
    public void legeObenDrauf(Karte pKarte) {
        karten.toFirst();
        if (karten.hasAccess()) {
            karten.insert(pKarte);
        } else {
            karten.append(pKarte);
        }
    }

    /**
     * Legt eine Liste von Karten auf den Kartenstapel.
     * Die übergebene Liste bleibt unverändert.
     * 
     * @param pKarte
     */
    public void legeObenDrauf(List<Karte> pKartenListe) {
        List<Karte> copy = pKartenListe.copyList();
        copy.concat(karten);
        karten = copy;
    }

    /**
     * Legt anzahl viele Elemente der pKartenListe auf den Kartenstapel.
     * 
     * 
     * den Kartenstapel gelegt,
     * die in der pKartenListe vorhanden sind.
     * 
     * @param pKartenListe
     * @param anzahl
     */
    public void legeObenDrauf(List<Karte> pKartenListe, int anzahl) {
        karten.toFirst();
        pKartenListe.toFirst();
        for (int i = 0; i < anzahl && pKartenListe.hasAccess(); i++) {
            if (karten.hasAccess()) {
                karten.insert(pKartenListe.getContent());
            } else {
                karten.append(pKartenListe.getContent());
            }
            pKartenListe.next();
        }
    }

    /**
     * Entfernt die oberste Karte auf dem Kartenstapel.
     */
    public void entferneObersteKarte() {
        karten.toFirst();
        karten.remove();
    }

    /**
     * Gibt die Anzahl der Karten in diesem Kartenstapel zurück.
     * 
     * @return anzahl
     */
    public int getAnzahl() {
        karten.toFirst();
        int anzahl = 0;
        while (karten.hasAccess()) {
            anzahl++;
            karten.next();
        }
        return anzahl;
    }

    /**
     * Füllt diesen Kartenstapel mit den Daten des Netzwerk-Strings.
     * 
     * @param pNetString
     * @return Kartenstapel
     */
    public void fromNetString(String pNetString) {
        String[] kartenDaten = pNetString.split(NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN);
        aufgedeckt = Boolean.parseBoolean(kartenDaten[0]);
        karten = new List<Karte>();
        for (int i = 1; i < kartenDaten.length; i++) {
            Karte k = new Karte();
            k.fromNetString(kartenDaten[i]);
            karten.append(k);
        }
    }

    /**
     * Gibt einen Netzwerk-String dieses Kartenstapels zurück.
     * 
     * @return
     */
    public String toNetString() {
        String netString = "" + aufgedeckt + NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN;
        karten.toFirst();
        while (karten.hasAccess()) {
            netString += karten.getContent().toNetString() + NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN;
            karten.next();
        }
        netString.substring(0, netString.length() - 1);
        return netString;
    }

}
