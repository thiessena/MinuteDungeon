package karten;

import java.util.Arrays;

import netzwerk.NetObject;

/**
 * Eine Klasse für die Verwaltung von Handkarten.
 * Es können Handkarten ausgewählt werden.
 * 
 * @author (L, Thiessen)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Handkarten implements NetObject {
    private List<Karte> handkarten;

    public Handkarten() {
        handkarten = new List<Karte>();
    }

    public Handkarten(List<Karte> pKartenListe) {
        handkarten = pKartenListe;
    }

    public String toString() {
        String ausgabe = "[[🫱: ";
        handkarten.toFirst();
        while (handkarten.hasAccess()) {
            ausgabe += handkarten.getContent().toString();
            handkarten.next();
        }
        return ausgabe;
    }

    /**
     * Entfernt die Karte pKarte aus den Handkarten.
     * Falls die Karte nicht vorhanden ist, passiert nichts.
     * 
     * @param pKarte
     */
    public void karteRauslegen(Karte pKarte) {
        handkarten.toFirst();
        boolean gefunden = false;
        while (handkarten.hasAccess() && !gefunden) {
            if (handkarten.getContent().equals(pKarte)) {
                handkarten.remove();
                gefunden = true;
            }
            handkarten.next();
        }
    }

    /**
     * Eine Karte wird an der Stelle positionVonLinks eingefügt, sonst hinten
     * angehängt.
     * 
     * @param pKarte
     * @param positionVonLinks
     */
    public void karteHinzufuegen(Karte pKarte, int positionVonLinks) {
        handkarten.toFirst();
        for (int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++) {
            handkarten.next();
        }
        if (handkarten.hasAccess()) {
            handkarten.insert(pKarte);
        } else {
            handkarten.append(pKarte);
        }
    }

    /**
     * Hängt eine Liste von Karten an die Handkarten an.
     * 
     * @param pKartenListe
     */
    public void kartenHinzufuegen(List<Karte> pKartenListe) {
        handkarten.concat(pKartenListe);
    }

    public Karte aktuelleKarte() {
        handkarten.toFirst();
        return handkarten.getContent();
    }

    /**
     * Gibt die Handkarte an der Position positionVonLinks zurück.
     * Falls es diese Position nicht gibt, wird null zurückgegeben.
     * Die Karte wird aus den Handkarten entfernt.
     * 
     * @param positionVonLinks
     * @return Karte
     */
    public Karte gibHandkarte(int positionVonLinks) {
        handkarten.toFirst();
        for (int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++) {
            handkarten.next();
        }
        if (handkarten.hasAccess()) {
            Karte k = handkarten.getContent();
            handkarten.remove();
            return k;
        } else {
            return null;
        }
    }

    /**
     * Gibt die Liste mit den Handkarten
     * 
     * @return eine Liste der gesamten Handkarten.
     */
    public List<Karte> getHandkarten() {
        return handkarten;
    }

    /**
     * Gibt alle Handkarten zurück, und entfernt sie aus dem Stapel.
     * 
     * @return List<Karte> mit allen Handkarten
     */
    public List<Karte> gibHandkarten() {
        List<Karte> karten = handkarten;
        entferneAlle();
        return karten;
    }

    /**
     * Entfernt alle Handkarten.
     */
    public void entferneAlle() {
        handkarten = new List<Karte>();
    }

    /**
     * Wählt die Handkarte an der Position positionVonLinks aus.
     * 
     * @param auswaehlen
     */
    public void handkarteAuswaehlen(int positionVonLinks) {
        handkarten.toFirst();
        for (int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++) {
            handkarten.next();
        }
        if (handkarten.hasAccess()) {
            handkarten.getContent().setAusgewaehlt(true);
        }
    }

    public List<Karte> handkartenAuswaehlen(int[] positionenVonLinks) {
        if (positionenVonLinks.length != 3) {
            return null;
        }
        Arrays.sort(positionenVonLinks);
        int k = 0;
        handkarten.toFirst();
        List<Karte> ausgewaehlteKarten = new List<Karte>();
        for (int i = 0; handkarten.hasAccess() && i <= positionenVonLinks[positionenVonLinks.length - 1]; i++) {
            if (i == positionenVonLinks[k]) {
                Karte ausgewaehlt = handkarten.getContent();
                ausgewaehlt.setAusgewaehlt(true);
                ausgewaehlteKarten.append(ausgewaehlt);
                handkarten.remove();
            }
            handkarten.next();
        }
        return ausgewaehlteKarten;
    }

    /**
     * Gibt die Anzahl der ausgewaehlten Karten zurueck.
     * 
     * @return anzahl:int
     */
    public int anzahlAusgewaehlterKarten() {
        handkarten.toFirst();
        int n = 0;
        while (handkarten.hasAccess()) {
            if (handkarten.getContent().getAusgewaehlt()) {
                n++;
            }
            handkarten.next();

        }
        return n;
    }

    /**
     * Gibt eine Liste mit den Verweisen auf die ausgewaehlten Karten zurueck.
     * 
     * @return List<Karte> ausgewaehlte Karten
     */
    public List<Karte> getAusgewaehlteKarten() {
        List<Karte> kListe = new List<Karte>();
        handkarten.toFirst();
        while (handkarten.hasAccess()) {
            if (handkarten.getContent().getAusgewaehlt()) {
                kListe.append(handkarten.getContent());
            }
            handkarten.next();
        }
        return kListe;
    }

    /**
     * Entfernt alle ausgewaehlten Karten aus den Handkarten.
     */
    public void entferneAusgewaehlteKarten() {
        handkarten.toFirst();
        while (handkarten.hasAccess()) {
            if (handkarten.getContent().getAusgewaehlt()) {
                handkarten.remove();
            }
            handkarten.next();
        }
    }

    /**
     * Gibt die Ausgewaehlten karten zurueck, wenn genau drei Karten ausgewaehlt
     * sind.
     * Die Karten werden aus den Handkarten entfernt.
     * Falls nicht drei Handkarten ausgewaehlt sind, passiert nichts und es wird
     * null zurückgegeben.
     */
    public List<Karte> gibDreiAusgewaehlteKarten() {
        if (anzahlAusgewaehlterKarten() == 3) {
            List<Karte> kListe = getAusgewaehlteKarten();
            return kListe;
        }
        return null;
    }

    /**
     * Gibt die Anzahl der Handkarten zurück.
     * 
     * @return Anzahl der Handkarten.
     */
    public int getAnzahl() {
        int anzahl = 0;
        handkarten.toFirst();
        while (handkarten.hasAccess()) {
            anzahl++;
            handkarten.next();
        }
        return anzahl;
    }

    @Override
    public void fromNetString(String pNetString) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toNetString() {
        // TODO Auto-generated method stub
        return null;
    }
}
