package main;

import karten.*;
import netzwerk.NetObject;
import netzwerk.NetTrennzeichen;
import helden.*;

/**
 * Die Klasse Spiel verwaltet das gesamte Spiel.
 * Hier werden Spieler, Decks, Charaktere, Gegner
 * und das Spielgeschehen erstellt und gesteuert.
 * 
 * @author @thiessena
 */
public class Spiel implements Controller, NetObject {
    private static final Spiel instance = new Spiel();

    List<Spieler> spieler;
    int maxSpielerAnzahl = 6;
    int spielerAnzahl = 0;
    Dungeon dungeon;
    Countdown countdown;

    View spielAusgabe;

    private Spiel() {
        countdown = new Countdown();
        dungeon = new Dungeon();
        spieler = new List<Spieler>();

    }

    public static Spiel getInstance() {
        return instance;
    }

    public void setView(View pView) {
        spielAusgabe = pView;
    }

    public boolean addSpieler(Spieler pSpieler) {
        if (spielerAnzahl < maxSpielerAnzahl) {
            spieler.append(pSpieler);
            spielerAnzahl++;
            return true;
        }
        return false;
    }

    /**
     * Setzt für einen bestimmten Spieler den entsprechenden Helden und erstellt das
     * passende Deck.
     */
    public boolean setHeld(Spieler pSpieler, Held pHeld) {
        boolean fertig = false;
        spieler.toFirst();
        while (spieler.hasAccess() && !fertig) {
            if (pSpieler.equals(spieler.getContent())) {
                pSpieler.setHeld(pHeld);
                pSpieler.getNachziestapel().legeObenDrauf(HeldenDeckFactory.create(pHeld.getFarbe()));
                pSpieler.getNachziestapel().mischen();
                pSpieler.fuelleHandkartenAuf();
                fertig = true;
            }
        }
        return fertig;
    }

    /**
     * Initialisiert das Spiel mit dem ersten Level.
     * //toDo: Später weitere Level ergänzen
     */
    public void init() {
        // toDo: Alle Ereignisse für den Start des Spiels
        // Für jeden Spieler
        // Nachziehstapel mischen

        // Timer starten
    }

    /**
     * Führt die aktuelle Situation
     */
    public void rundenAblauf() {
        while (!dungeon.nochKartenVorhanden() && !countdown.ende()) {
            // dungeon anzeigen
            // countdown anzeigen
            // spieler anzeigen
        }

    }

    public List<Spieler> getSpieler() {
        return spieler;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public Countdown getCountdown() {
        return countdown;
    }

    /**
     * Setzt den Schwierigkeitsgrad für den Dungeon.
     * 
     * @param pSchwierigkeitsgrad
     * @Override
     */

    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad) {
        dungeon.setSchwierigkeitsgrad(pSchwierigkeitsgrad);

    }

    /**
     * Setzt das Level für den Dungeon.
     * 
     * @param pLevel
     * @Override
     */
    public void setLevel(int pLevel) {
        dungeon.setLevel(pLevel);

    }

    @Override
    public void karteSpielen(Karte pKarte) {
        if (pKarte != null) {
            dungeon.karteSpielen(pKarte);
        }
    }

    @Override
    public void karteSpielen(Spieler pSpieler, int position) {
        Karte k = pSpieler.getHandkarten().gibHandkarte(position);
        if (k != null) {
            dungeon.karteSpielen(k);
        }
    }

    @Override
    public void fromNetString(String pNetString) {
        String[] data = pNetString.split(NetTrennzeichen.SPIELER_TRENNZEICHEN);
        dungeon.fromNetString(data[0]);
        countdown.fromNetString(data[1]);
        spieler = new List<Spieler>();
        for (int i = 2; i < data.length; i++) {
            Spieler sp = new Spieler();
            sp.fromNetString(data[i]);
            spieler.append(sp);
        }

    }

    @Override
    public String toNetString() {
        String netString = dungeon.toNetString() + NetTrennzeichen.SPIEL_TRENNZEICHEN +
                countdown.toNetString() + NetTrennzeichen.SPIELER_TRENNZEICHEN;
        spieler.toFirst();
        while (spieler.hasAccess()) {
            netString += spieler.getContent().toNetString() + NetTrennzeichen.SPIELER_TRENNZEICHEN;
            spieler.next();
        }
        return netString;
    }

    @Override
    public void spezialFaehigkeitNutzen(Spieler pSpieler) {
        if (pSpieler.faehigkeitEinsetzen()) {

        }
    }

    @Override
    public void karteAuswaehlen(Spieler pSpieler, Karte pKarte) {
        // TODO Auto-generated method stub

    }

    @Override
    public void kartenAuswaehlen(Spieler pSpieler, List<Karte> pKarten) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kartenAuswaehlen'");
    }

    @Override
    public void kartenAuswaehlen(Spieler pSpieler, int[] positionen) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kartenAuswaehlen'");
    }

}
