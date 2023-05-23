package main;

import gegner.*;
import karten.*;
import netzwerk.NetObject;

/**
 * Verwaltet alle Gegnerkarten, und stellt die passende Groesse fuer den Level
 * und Schwierigkeitsgrad zur Verfuegung.
 * 
 * @author Viola, @StinckyMe
 */
public class Dungeon implements NetObject {

    private Kartenstapel gegnerkartenstapel;
    private int level;
    private int schwierigkeitsgrad;

    /**
     * Konstruktor fuer Objekte der Klasse Dungeon
     */
    public Dungeon() {
        level = 1;
        schwierigkeitsgrad = 1;
        init_Gegnerkarten();

    }

    /**
     * Konstruktor fuer Objekte der Klasse Dungeon
     */
    public Dungeon(int pLevel, int pSchwierigkeitsgrad) {
        level = pLevel;
        schwierigkeitsgrad = pSchwierigkeitsgrad;
        init_Gegnerkarten();

    }

    private void init_Gegnerkarten() {
        gegnerkartenstapel = new Kartenstapel();
        gegnerkartenstapel.legeObenDrauf(GegnerFactory.getAlleGegnerkarten(), 12);
    }

    /**
     * Deckt die naechste Gegnerkarte auf.
     */
    public void naechsteGegnerKarte() {
        Gegnerkarte aktGegner = (Gegnerkarte) (gegnerkartenstapel.getObersteKarte());
        if (aktGegner.getAktuelleRessourcen().getAlleRessourcenGleichNull()) {
            System.out.println("Gegner beseitigt!");
            gegnerkartenstapel.entferneObersteKarte();
        } else {

        }
    }

    public boolean nochKartenVorhanden() {
        while (gegnerkartenstapel.getAnzahl() > 0) {
            return false;
        }
        return true;
    }

    /**
     * Gibt die Moeglichkeit eine Karte zum Dungeon zu legen.
     * Die Karte wird auf den Gegner angewendet. Bzw. von seinen Ressourcen
     * abgezogen.
     * Falls die Karte null ist, passiert nichts.
     * 
     * @param pKarte
     */
    public void karteSpielen(Karte pKarte) {
        if (pKarte == null) {
            return;
        }
        if (pKarte instanceof Ressourcenkarte) {
            ((Gegnerkarte) gegnerkartenstapel.getObersteKarte()).karteSpielen((Ressourcenkarte) pKarte);
        }
        if (pKarte instanceof DeckEreigniskarte) {

        }

        naechsteGegnerKarte();
        if (nochKartenVorhanden() == false) {
            System.out.println("Wow du hast gewonnen wow wowowowowow");
            // Spiel beenden
        }
    }

    public void heldenFaehigkeitSpielen(Gegnertyp pTyp) {
        Gegnerkarte gK = (Gegnerkarte) gegnerkartenstapel.getObersteKarte();
        if (pTyp == gK.getTyp()) {
            naechsteGegnerKarte();
        }
    }

    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad) {
        schwierigkeitsgrad = pSchwierigkeitsgrad;
    }

    public int getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    public void setLevel(int pLevel) {
        if (pLevel > 0 && pLevel < 4) {
            level = pLevel;
        } else {
            level = 1;
        }
    }

    public int getLevel() {
        return level;
    }

    public Gegnerkarte getAktuelleGegner() {
        return (Gegnerkarte) gegnerkartenstapel.getObersteKarte();
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
