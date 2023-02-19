package main;
import karten.*;

public class Dungeon
{
    
    private Kartenstapel gegenerkartenstappel;
    private int level; 
    private int schwierigkeitsgrad;

    /**
     * Konstruktor für Objekte der Klasse Dungeon
     */
    public Dungeon()
    {
        level = 1; 
        schwierigkeitsgrad = 1;
        init_Gegnerkarten();
        
    }
    
    /**
     * Konstruktor für Objekte der Klasse Dungeon
     */
    public Dungeon(int pLevel, int pSchwierigkeitsgrad)
    {
        level = pLevel; 
        schwierigkeitsgrad = pSchwierigkeitsgrad;
        init_Gegnerkarten();
        
    }

    private void init_Gegnerkarten(){
        gegenerkartenstappel = new Kartenstapel();
    }
    
    public void nächsteKarte(){
        //prüfenObNochKartenDaSind wenn ja dann Karte von oben aus dem Gegenerkartestappel aufdecken 
    }
    
   public void RessourcenKarteVergleichen(){
        GegnerKarte.arrayGegner();
    
    public void kartenWeglegen(){
        //besiegte Karte wegglegen und die da zugehörigen Reurcen u. Array und dann prüfen ob noch karten da sind 
    }
    
    public void prüfenObNochKartenDaSind(){
        //wenn nicht dann haben die Spieler gewonnen sonst nächste Karte
    }

    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad) {
        schwierigkeitsgrad = pSchwierigkeitsgrad;
    }

    public void setLevel(int pLevel) {
        level = pLevel;
    }
}
