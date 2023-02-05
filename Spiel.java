/**
 * Die Klasse Spiel verwaltet das gesamte Spiel. 
 * Hier werden Spieler, Decks, Charaktere, Gegner
 * und das Spielgeschehen erstellt und gesteuert.
 */
public class Spiel {
    private static final Spiel instance = new Spiel();
    List<Spieler> spieler; 
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

    }

    /**
     * Initialisiert das Spiel mit dem ersten Level. 
     * //toDo: Später weitere Level ergänzen
     */
    public void init(){
        //toDo: Alle Ereignisse für den Start des Spiels
    }

    /**
     * Öffnet die nächste Gegnerkarte und erlaubt das Legen von Karten
     */
    public void naechsteGegner(){

    }

    /**
     * Startet den Boss-Fight. 
     * toDo:
     * - Musik ändern
     * - Hintergrund ändern
     */
    public void boss(){

    }

    /**
     * Zeigt einen Bildschirm zum Erfolg an, und gibt eine Zusammenfassung aus. 
     * Wieviele Karten wurden von jedem gelegt?
     * Wer hat die meisten "final-blows" - also die letzte Karte damit ein Monster wegkommt. 
     */
    public void siegesBildschirm(){

    }
}
