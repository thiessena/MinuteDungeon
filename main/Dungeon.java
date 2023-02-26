package main;
import karten.*;
import netzwerk.NetObject;

/**
 * Verwaltet alle Gegnerkarten, und stellt die passende Größe für den Level und Schwierigkeitsgrad zur Verfügung.
 * 
 * @author Viola, @StinckyMe
 */
public class Dungeon implements NetObject
{

    private Kartenstapel gegnerkartenstappel;
    private int level; 
    private int schwierigkeitsgrad;

    /**
     * Konstruktor fÃ¼r Objekte der Klasse Dungeon
     */
    public Dungeon()
    {
        level = 1; 
        schwierigkeitsgrad = 1;
        init_Gegnerkarten();

    }

    /**
     * Konstruktor fÃ¼r Objekte der Klasse Dungeon
     */
    public Dungeon(int pLevel, int pSchwierigkeitsgrad)
    {
        level = pLevel; 
        schwierigkeitsgrad = pSchwierigkeitsgrad;
        init_Gegnerkarten();

    }

    private void init_Gegnerkarten(){
        gegnerkartenstappel = new Kartenstapel();
    }

    /**
     * Deckt die nächste Gegnerkarte auf.
     */
    public void naechsteGegnerKarte(){
        
    }
    public boolean nochKartenVorhanden(){
        //while hasacces und so 
        return false;
    }

    public void kartenWeglegen(){
        
    }

    /**
     * Gibt die Möglichkeit eine Karte zum Dungeon zu legen.
     * Die Karte wird auf den Gegner angewendet. Bzw. von seinen REssourcen abgezogen.
     * @param pKarte
     */
    public void karteSpielen(Karte pKarte) {
        
        
    }
    

    public void RessourcenKarteVergleichen(){
        Gegnerkarte.arrayGegner();
        //hier die beiden arrays vergleichen
        kartenWeglegen();

        if(nochKartenVorhanden() == false){
              System.out.println("Wow du hast gewonnen wow wowowowowow");
              //Spiel beenden
        }else{
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
        if(pLevel > 0 && pLevel < 4){
            level = pLevel;
        }else{
            level = 1;
        }
    }

    public int getLevel() {
        return level;
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
