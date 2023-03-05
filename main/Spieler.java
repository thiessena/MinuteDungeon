package main;

import karten.Handkarten;
import karten.Kartenstapel;
import netzwerk.NetObject;
import netzwerk.NetTrennzeichen;
import helden.*;

/**
 * Ein Spieler hat drei Stapel und verwaltet einen Helden.
 */
public class Spieler implements NetObject {
    private int userId;
    private Held held;
    private Kartenstapel nachziehstapel;
    private Kartenstapel ablagestapel;
    private Handkarten handkarten;

    public Spieler() {
        nachziehstapel = new Kartenstapel();
        ablagestapel = new Kartenstapel();
        handkarten = new Handkarten();
        held = null;

    }

    public Spieler(int pUserId, Kartenstapel pNachziehstapel, Kartenstapel pAblagestapel) {
        userId = pUserId;
        nachziehstapel = pNachziehstapel;
        ablagestapel = pAblagestapel;
    }

    public void setHeld(Held pHeld) {
        held = pHeld;
        held.setSpieler(this);
    }

    public Held getHeld() {
        return held;
    }

    public Kartenstapel getNachziestapel() {
        return nachziehstapel;
    }

    public Kartenstapel getAblagestapel() {
        return ablagestapel;
    }

    public Handkarten getHandkarten() {
        return handkarten;
    }

    public void setHandkarten(Handkarten pHandkarten) {
        handkarten = pHandkarten;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int pUserId) {
        userId = pUserId;
    }

    /**
     * Setzt die Faehigkeit des Helden ein.
     * Dafuer muessen drei Karten ausgewaehlt sein.
     */
    public boolean faehigkeitEinsetzen() {
        if (handkarten.anzahlAusgewaehlterKarten() == 3) {
            ablagestapel.legeObenDrauf(handkarten.gibDreiAusgewaehlteKarten());
            held.nutzefaehigkeit();
            return true;
        }
        return false;
    }

    public String toString() {
        return "==[" + held.getHeldenname() + "]==[" +
                nachziehstapel.toString() + "|" +
                handkarten.toString() + "|" +
                ablagestapel.toString() + "]==";
    }

    /**
     * Erzeugt einen NetString von diesem Spieler, der über das Netz verschickt
     * werden kann.
     * 
     * @return NetString
     * 
     */
    public String toNetString() {
        return null;
    }

    public void fromNetString(String pNetString) {
        String[] daten = pNetString.split(NetTrennzeichen.SPIELER_TRENNZEICHEN);
        userId = Integer.parseInt(daten[0]);
        held = new Held();
        held.fromNetString(daten[1]);
        nachziehstapel = new Kartenstapel();
        nachziehstapel.fromNetString(daten[2]);
        ablagestapel = new Kartenstapel();
        ablagestapel.fromNetString(daten[3]);
        handkarten = new Handkarten();
        handkarten.fromNetString(daten[4]);
    }
}
