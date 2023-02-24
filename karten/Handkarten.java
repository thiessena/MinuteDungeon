package karten;

/**
 * Eine Klasse für die Verwaltung von Handkarten.
 * Es können Handkarten ausgewählt werden.
 * 
 * @author (L, Thiessen) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Handkarten{
    private List<Karte> handkarten;
    private List<Karte> ausgewaehlt;

    public Handkarten(){
        handkarten = new List<Karte>();
        ausgewaehlt = new List<Karte>();
    }

    public String toString(){
        String ausgabe = "[[KartenStapel: "; 
        handkarten.toFirst();
        while(handkarten.hasAccess()){
            ausgabe += handkarten.getContent().toString(); 
            handkarten.next();
        }
        ausgabe += " | ";
        ausgewaehlt.toFirst();
        while(ausgewaehlt.hasAccess()){
            ausgabe += ausgewaehlt.getContent().toString();
            ausgewaehlt.next();
        }
        return ausgabe;
    }

    /**
     * Entfernt die Karte pKarte aus den Handkarten.
     * Falls die Karte nicht vorhanden ist, passiert nichts.
     * @param pKarte
     */
    public void karteRauslegen(Karte pKarte){
        handkarten.toFirst();
        boolean gefunden = false;
        while(handkarten.hasAccess() && !gefunden){
            if(handkarten.getContent().equals(pKarte)){
                handkarten.remove();
                gefunden = true;
            }
            handkarten.next();
        }
    }

    /**
     * Eine Karte wird an der Stelle positionVonLinks eingefügt, sonst hinten angehängt.
     * @param pKarte
     * @param positionVonLinks
     */
    public void karteHinzufuegen(Karte pKarte, int positionVonLinks){
        handkarten.toFirst();
        for(int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++){
            handkarten.next();
        }
        if(handkarten.hasAccess()){
            handkarten.insert(pKarte);
        }else{
            handkarten.append(pKarte);
        }
    }

    public Karte aktuelleKarte(){
        handkarten.toFirst();
        return handkarten.getContent();
    }

    /**
     * Gibt die Handkarte an der Position positionVonLinks zurück.
     * Falls es diese Position nicht gibt, wird null zurückgegeben.
     * @param positionVonLinks
     * @return Karte
     */
    public Karte gibHandkarte(int positionVonLinks){
        handkarten.toFirst();
        for(int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++){
            handkarten.next();
        }
        if(handkarten.hasAccess()){
            return handkarten.getContent();   
        }else{
            return null;
        }
    }

    /**
     * Gibt die Liste mit den Handkarten 
     * @return eine Liste der gesamten Handkarten.
     */
    public List<Karte> gibAlleHandkarten(){
        return handkarten;
    }

    /**
     * Entfernt alle Handkarten.
     */
    public void entferneAlle(){
        handkarten = new List<Karte>();
    }

    /**
     * Wählt die Handkarte an der Position positionVonLinks aus. 
     * @param auswaehlen
     */
    public void handkarteAuswaehlen(int positionVonLinks){
        handkarten.toFirst();
        for(int i = 0; handkarten.hasAccess() && i < positionVonLinks; i++ ){
            handkarten.next();
        }
        if(handkarten.hasAccess()){
            ausgewaehlt.append(handkarten.getContent()); 
        }
        
    }

    /**
     * Gibt die Anzahl der Handkarten zurück.
     * @return Anzahl der Handkarten.
     */
    public int getAnzahl(){
        int anzahl = 0;
        handkarten.toFirst();
        while(handkarten.hasAccess()){
            anzahl++;
            handkarten.next();
        }
        return anzahl;
    }
}
