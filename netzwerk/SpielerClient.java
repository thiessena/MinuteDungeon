package netzwerk;
import java.util.Scanner;

import main.Spiel;
import main.Spieler;
import textgame.Textgame;

public class SpielerClient extends Client{
    Scanner eingabe = new Scanner(System.in);
    Spiel spiel = Spiel.getInstance();
    Textgame textgame;

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
                System.out.print("Gib deine UserId ein: ");
                String name = eingabe.nextLine();
                send("LOGIN:"+name);
            break;
            case "LOGIN_ERFOLGREICH":
                Spieler mySpieler = new Spieler(); 
                mySpieler.fromNetString(datenArray[1]);
                textgame = new Textgame(mySpieler);
                textgame.zeigeLevelAuswahl();
            break;
            case "LEVEL_EINGELOGGT": textgame.zeigeHeldenAuswahl(); break;
            case "HELD_EINGELOGGT": textgame.zeigeWarteBildschirm(); break; 


        }
    }

    public static void main(String[] args){
        SpielerClient sClient = new SpielerClient("localhost", 1337);
        System.out.println("Bitte gib deine SpielerId an");
    }
    
}
