package main;
import karten.Handkarten;
import karten.Kartenstapel;
import helden.*;

public class Spieler{
    private Kartenstapel nachziehstapel;
    private Kartenstapel ablagestapel;
    private Handkarten handkarten;
    private Held held;
    private int spielerID;
    
    public Spieler(int pID){
        spielerID = pID;
    }
    public Spieler(int pID, Kartenstapel pNachziehstapel, Kartenstapel pAblagestapel){
        spielerID = pID;
        nachziehstapel = pNachziehstapel;
        ablagestapel = pAblagestapel;
    }

    public void setHeld(Held pHeld){
        held = pHeld; 
    }

    public Held getHeld(){
        return held; 
    }
    
    public Kartenstapel getNachziestapel(){
        return nachziehstapel;
    }
    
    public Kartenstapel getAblagestapel(){
        return ablagestapel;
    }

    public Handkarten getHandkarten(){
        return handkarten;
    }

    public void setHandkarten(Handkarten pHandkarten){
        handkarten = pHandkarten;
    }
    
    public int getID(){
        return spielerID;
    }

    public String toNetString(){
        
    }

    public static Spieler fromNetString(String pNetString){
        String[] daten = pNetString.split("/");

        Spieler s = new Spieler();

    }
}
