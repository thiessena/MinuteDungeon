package textgame;
import karten.*;
import main.*;

import java.util.Scanner;

import helden.HeldenFactory;

public class Textgame implements View{
    Spiel spiel = Spiel.getInstance();
    Spieler spieler;
    Scanner eingabeZeile; 
    Controller controller;

    public Textgame(Spieler pSpieler){
        spiel.setView(this);
        controller = spiel;
        eingabeZeile = new Scanner(System.in);
        spieler = pSpieler;
    }
    
    /**
     * 
     */
    @Override
    public void zeigeHeldenAuswahl() {
        System.out.println("Wähle einen Helden aus: 1)Paladin 2)Walkuere 3)Ninja 4)Dieb 5)Waldlaeufer 6)Jaegerin 7)Magier 8)Zauberin");
        int heldenNummer = eingabeZeile.nextInt();
        HeldenFactory.gibHeld(heldenNummer);
        controller.setHeld(spieler, null);
    }


    @Override
    public void zeigeLevelAuswahl() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeDungeon(Dungeon pDungen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeTimer(Countdown pCountdown) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeSpieler(Spieler pSpieler) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeSpiel(Spiel pSpiel) {
        System.out.println("===============================[Minute - Dungen]==============================");
        zeigeDungeon(pSpiel.getDungeon());
        List<Spieler> spieler = pSpiel.getSpieler();
        spieler.toFirst();
        while(spieler.hasAccess()){
            zeigeSpieler(spieler.getContent());
            spieler.next();
        }
        System.out.println("==================================================================================");
    }

    @Override
    public void zeigeWarteBildschirm() {
        System.out.println("Bitte warte bis das Spiel startet.");
    }
}