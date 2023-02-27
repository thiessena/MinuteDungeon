package netzwerk;
import java.util.Scanner;

import helden.Held;
import karten.Karte;
import karten.List;
import main.Controller;

import main.Spiel;
import main.Spieler;
import main.View;
import textgame.Textgame;

public class SpielerClient extends Client implements Controller{
    Scanner eingabe = new Scanner(System.in);
    View view;

    public SpielerClient(){
        super("localhost",1337);
    }

    public SpielerClient(String pIp, int pPort){
        super(pIp,pPort);
    }

    public void processMessage(String pMessage){
        String[] datenArray = pMessage.split(NetTrennzeichen.BEFEHL_TRENNZEICHEN);
        String befehl = datenArray[0];
        switch(befehl){
            case "VERBINDUNG_ERFOLGREICH": 
                System.out.print("Gib deine UserId ein (Enter, falls keine vorhanden ist): ");
                String id = eingabe.nextLine();
                send("LOGIN:" + id);
            break;
            case "LOGIN_ERFOLGREICH":
                int userId = Integer.parseInt(datenArray[1]);
                Spieler mySpieler = new Spieler(userId, null, null); 
                view = new Textgame(mySpieler, this);
                send("LEVEL:");
            break;
            case "LEVEL_FEHLT": view.zeigeLevelAuswahl(); break;
            case "LEVEL_EINGELOGGT": view.zeigeHeldenAuswahl(); break;
            case "HELD_EINGELOGGT": view.zeigeWarteBildschirm(); break; 
        }
    }

    public static void main(String[] args){
        SpielerClient sClient = new SpielerClient("localhost", 1337);
        System.out.println("Bitte gib deine SpielerId an");
    }

    @Override
    public void setView(View pView) {
        view = pView;
    }

    @Override
    public void setHeld(Spieler pSpieler, Held pHeld) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setLevel(int pLevel) {
        send("LEVEL_AUSWAHL:"+pLevel);
    }

    @Override
    public void karteSpielen(Karte pKarte) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void karteAuswaehlen(Spieler pSpieler, Karte pKarte) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kartenAuswahlen(Spieler pSpieler, List<Karte> pKarten) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void spezialFaehigkeitNutzen(Spieler pSpieler) {
        // TODO Auto-generated method stub
        
    }



    
}
