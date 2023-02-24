package netzwerk;
import helden.Held;
import karten.Karte;
import main.Controller;
import main.Spiel;
import main.Spieler;
import textgame.Textgame;

public class SpielerClient extends Client{
    Spiel spiel = Spiel.getInstance();
    Textgame textgame;

    public SpielerClient(){
        super("localhost",1337);
    }

    public void processMessage(String pMessage){
        String[] datenArray = pMessage.split(":");
        String befehl = datenArray[0];
        switch(befehl){
            case "LOGIN_ERFOLGREICH":
                Spieler mySpieler = Spieler.fromNetString(datenArray[1]);
                textgame = new Textgame(mySpieler); 
                textgame.zeigeLevelAuswahl(); break;
            case "LEVEL_EINGELOGGT": textgame.zeigeHeldenAuswahl(); break; 
            case "HELD_EINGELOGGT": textgame.zeigeWarteBildschirm(); break; 


        }
    }

    
}
