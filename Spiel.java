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
    
    /**
     * Hier fehlen noch all die Attribute, die für das Spiel benötigt werden.
     */

    private Spiel(){

    }

    public static Spiel getInstance(){
        return instance;
    }

    /**
     * Zeigt einen Bildschirm zur Auswahl des Charakters. 
     */
    public void charakterAuswahl(){
        spieler = new List<spieler>();
    }

    public void schwierigkeitAuswahl(){
    
        dungeon = new dungeon(1,1);// Level, Schwierigkeitsgrad
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
    
    public void ablauf(){
        while(!dungeon.getGewonnen() && countdown.ende()){
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
