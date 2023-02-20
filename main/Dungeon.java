package main;
import karten.*;

public class Dungeon
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
    public void naechsteKarte(){
        
    }
    public boolean pruefenObNochKartenDaSind(){
        while hasacces und so 
    }
    public void kartenWeglegen(){
        
    }
    

    public void RessourcenKarteVergleichen(){
        Gegnerkarte.arrayGegner();
        //hier die beiden arrays vergleichen
        kartenWeglegen();

        if(pruefenObNochKartenDaSind() = false){
              System.out.println("Wow du hast gewonnen wow wowowowowow");
              //Spiel beenden
        }else{
            naechsteKarte();
        }
    }

    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad) {
        schwierigkeitsgrad = pSchwierigkeitsgrad;
    }

    public void setLevel(int pLevel) {
        level = pLevel;
    }
}
