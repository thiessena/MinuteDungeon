package main;
import karten.*;
import helden.*;

/**
 * Die Klasse Spiel verwaltet das gesamte Spiel. 
 * Hier werden Spieler, Decks, Charaktere, Gegner
 * und das Spielgeschehen erstellt und gesteuert.
 */
public class Spiel {
    private static final Spiel instance = new Spiel();
    List<Spieler> spieler; 
    Dungeon dungeon;
    Countdown countdown;

    View spielAusgabe;

    /**
     * Phasen des Spiels
     */
    public static final int SCHWIERIGKEITS_AUSWAHL = 1; 
    public static final int CHARACTER_AUSWAHL = 2;

    private Spiel(){
        countdown = new Countdown();
        dungeon = new Dungeon();
        spieler = new List<Spieler>();
    }

    public static Spiel getInstance(){
        return instance;
    }

    public void setView(View pView){
        spielAusgabe = pView;
    }

    /**
     * Zeigt einen Bildschirm zur Auswahl des Charakters. 
     */
    public void setHeld(Spieler pSpieler, Held pHeld){
        boolean fertig = false;
        spieler.toFirst();
        while(spieler.hasAccess() && !fertig){

        }
    }

    /**
     * Setzt die schwierigkeit und das Level des Dungeons und ermöglicht das Spielen.
     * @param pLevel
     * @param pSchwierigkeitsgrad
     */
    public void setDungeonEigenschaft(int pLevel, int pSchwierigkeitsgrad){
        dungeon.setLevel(pLevel);
        dungeon.setSchwierigkeitsgrad(pSchwierigkeitsgrad);
    }
    
    /**
     * Initialisiert das Spiel mit dem ersten Level. 
     * //toDo: Später weitere Level ergänzen
     */
    public void init(){
        //toDo: Alle Ereignisse für den Start des Spiels
        //Für jeden Spieler
        //  Nachziehstapel mischen
        
        //Timer starten
    }
    
    /**
     * Führt die aktuelle Situation
     */
    public void rundenAblauf(){
        if(!dungeon.getGewonnen() && countdown.ende()){
            //dungeon anzeigen
            //countdown anzeigen
            //spieler anzeigen
        }
        
    }

    /**
     * Zeigt einen Bildschirm zum Erfolg an, und gibt eine Zusammenfassung aus. 
     * Wieviele Karten wurden von jedem gelegt?
     * Wer hat die meisten "final-blows" - also die letzte Karte damit ein Monster wegkommt. 
     */
    public void siegesBildschirm(){

    }

    public List<Spieler> getSpieler(){
        return spieler;
    }
    public Dungeon getDungeon(){
        return dungeon;
    }
    public Countdown getCountdown(){
        return countdown;
    }
}
