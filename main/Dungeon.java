package main;
import karten.*;
import netzwerk.NetObject;

/**
 * Verwaltet alle Gegnerkarten, und stellt die passende GrÃ¶ÃŸe fÃ¼r den Level und Schwierigkeitsgrad zur VerfÃ¼gung.
 * 
 * @author Viola, @StinckyMe
 */
public class Dungeon implements NetObject
{

    private Kartenstapel<Gegnerkarte> gegnerkartenstappel;
    private int level; 
    private int schwierigkeitsgrad;

    /**
     * Konstruktor fÃƒÂ¼r Objekte der Klasse Dungeon
     */
    public Dungeon()
    {
        level = 1; 
        schwierigkeitsgrad = 1;
        init_Gegnerkarten();

    }

    /**
     * Konstruktor fÃƒÂ¼r Objekte der Klasse Dungeon
     */
    public Dungeon(int pLevel, int pSchwierigkeitsgrad)
    {
        level = pLevel; 
        schwierigkeitsgrad = pSchwierigkeitsgrad;
        init_Gegnerkarten();

    }

    private void init_Gegnerkarten(){
        gegnerkartenstappel = new Kartenstapel<Gegnerkarte>();
    }
    /**
     * Deckt die nÃ¤chste Gegnerkarte auf.
     */
    public void naechsteGegnerKarte(){
        gegnerkartenstappel.getObersteKarte();  
    }
    
    public boolean nochKartenVorhanden(){
        while(gegnerkartenstappel.hasAccess()){
            return false;
        }
    }

    /**
     * Gibt die MÃ¶glichkeit eine Karte zum Dungeon zu legen.
     * Die Karte wird auf den Gegner angewendet. Bzw. von seinen REssourcen abgezogen.
     * @param pKarte
     */
    public void karteSpielen(Karte pKarte) {
        if( pKarte instanceof Ressourcenkarte ){
           ressourcenKarteSpielen((Ressourcenkarte) pKarte); 
        }
        if( pKarte instanceof DeckEreigniskarte){
            
        }
            

    }
    

    public void ressourcenKarteSpielen(Ressourcenkarte pRessourcenkarte){
        gegnerkartenstappel
        .getObersteKarte()
        .getAktuelleRessourcen()
        .subtrahiere(pRessourcenkarte);
        naechsteGegnerKarte();
        if(nochKartenVorhanden() == false){
              System.out.println("Wow du hast gewonnen wow wowowowowow");
              //Spiel beenden
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
