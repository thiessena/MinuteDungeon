package textgame;

import karten.*;
import main.*;
import helden.*;

import java.util.Scanner;
import helden.HeldenFactory;

public class Textgame implements View {
    Spieler spieler;
    Scanner eingabeZeile;
    Controller controller;

    public Textgame(Spieler pSpieler, Controller pController) {
        controller = pController;
        pController.setView(this);
        eingabeZeile = new Scanner(System.in);
        spieler = pSpieler;
    }

    public static void main(String[] args) {
        Spieler ich = new Spieler();
        Spiel spiel = Spiel.getInstance();
        spiel.addSpieler(ich);
        Textgame tGame = new Textgame(ich, spiel);
        tGame.zeigeLevelAuswahl();
        tGame.zeigeHeldenAuswahl();
        spiel.setHeld(ich, HeldenFactory.gibHeld(1));
        tGame.zeigeSpieler(ich);
        tGame.zeigeDungeon(spiel.getDungeon());
        // tGame.zeigeWarteBildschirm();
    }

    /**
     * 
     */
    @Override
    public void zeigeHeldenAuswahl() {
        System.out.println(
                "Wähle einen Helden aus: 1)Paladin 2)Walkuere 3)Ninja 4)Dieb 5)Waldlaeufer 6)Jaegerin 7)Magier 8)Zauberin");
        System.out.println("Gib eine Zahl zwischen 1 - 8 an.");
        int heldenNummer = eingabeZeile.nextInt();
        Held h = HeldenFactory.gibHeld(heldenNummer);
        controller.setHeld(spieler, h);
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
        // TODO Auto-generated method stub

    }

    @Override
    public void zeigeSpieler(Spieler pSpieler) {
        System.out.println(pSpieler.toString());

    }

    @Override
    public void zeigeKartenAuswahl(Spieler pSpieler){
        
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

    @Override
    public void zeigeAusgewaehlteKarten(List<Karte> pKarten) {
        // TODO Auto-generated method stub

    }
}