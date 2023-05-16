package textgame;

import karten.*;
import main.*;
import helden.*;

import java.util.Scanner;

import gegner.Gegnerkarte;
import helden.HeldenFactory;

public class Textgame implements View {
    Spieler spieler;
    Scanner eingabeZeile;
    Controller controller;

    public Textgame(Controller pController) {
        controller = pController;
        pController.setView(this);
        eingabeZeile = new Scanner(System.in);
        spieler = new Spieler();
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public static void main(String[] args) {
        // System.out.println("\f");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Spiel spiel = Spiel.getInstance();
        Textgame tGame = new Textgame(spiel);
        System.out.println(spiel.addSpieler(tGame.getSpieler()));
        tGame.zeigeHeldenAuswahl();

        tGame.zeigeSpieler(tGame.getSpieler());
        tGame.zeigeDungeon(spiel.getDungeon());
        // tGame.zeigeWarteBildschirm();
    }

    /**
     * 
     */
    @Override
    public void zeigeHeldenAuswahl() {
        System.out.print(
                "Wähle einen Helden aus: ");
        String tempString = HeldenFactory.getHeldennamen();
        String[] heldennamen = tempString.substring(1, tempString.length() - 1).split(",");
        for (int i = 0; i < heldennamen.length; i++) {
            System.out.print((i + 1) + ")" + heldennamen[i] + " ");
        }
        System.out.println();
        System.out.println("Gib eine Zahl zwischen 1 - 8 an.");
        int heldenNummer = eingabeZeile.nextInt();
        System.out.println(controller.setHeld(spieler, HeldenFactory.gibHeld(heldenNummer - 1)));
    }

    @Override
    public void zeigeLevelAuswahl() {
        int level = 0;
        System.out.println("Welches Level möchtest du spielen? (1-5)");
        level = eingabeZeile.nextInt();
        controller.setLevel(level);

    }

    @Override
    public void zeigeDungeon(Dungeon pDungen) {
        Gegnerkarte gK = pDungen.getAktuelleGegner();
        String gKString = gK != null ? gK.toString() : "[--]";
        String dungenText = "##############################\n" +
                "# Dungeon                    #\n" +
                "# Akt-Gegner:" + gKString + "#\n" +
                "##############################";
        System.out.println(dungenText);
    }

    @Override
    public void zeigeTimer(Countdown pCountdown) {
        System.out.println(pCountdown.toNetString());

    }

    @Override
    public void zeigeSpieler(Spieler pSpieler) {
        System.out.println(pSpieler.toString());

    }

    @Override
    public void zeigeSpiel(Spiel pSpiel) {
        System.out.println("===============================[Minute - Dungen]==============================");
        zeigeDungeon(pSpiel.getDungeon());
        List<Spieler> spieler = pSpiel.getSpieler();
        spieler.toFirst();
        while (spieler.hasAccess()) {
            zeigeSpieler(spieler.getContent());
            spieler.next();
        }
        System.out.println("==================================================================================");
    }

    @Override
    public void zeigeWarteBildschirm() {
        System.out.println("Bitte warte bis das Spiel startet.");
        eingabeZeile.nextLine();
    }

    /**
     * Zeigt einen Bildschirm zum Erfolg an, und gibt eine Zusammenfassung aus.
     * Wieviele Karten wurden von jedem gelegt?
     * Wer hat die meisten "final-blows" - also die letzte Karte damit ein Monster
     * wegkommt.
     */
    @Override
    public void siegesBildschirm() {

    }

    @Override
    public void zeigeKartenAuswahl(Spieler pSpieler) {
        System.out.println("Welche Karten möchtest du auswaehlen?");
        System.out.println("Gib sie durch Komma getrennt an: 1,4,6");
        String zeile = eingabeZeile.nextLine();
        try {
            int[] zahlen = integerValues(zeile, ",");
            controller.kartenAuswaehlen(pSpieler, zahlen);
        } catch (NumberFormatException nFE) {
            System.out.println("Die Zahlen wurden falsch eingegeben.");
        }
    }

    private int[] integerValues(String pText, String pSplitter) throws NumberFormatException {
        String[] zahlenText = pText.split(pSplitter);
        int[] zahlen = new int[zahlenText.length];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = Integer.parseInt(zahlenText[i]);
        }
        return zahlen;
    }

    @Override
    public void zeigeKarteSpielenAuswahl(Spieler pSpieler) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'zeigeKarteSpielenAuswahl'");
    }
}