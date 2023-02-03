import java.util.List;
/**
 * Beschreiben Sie hier die Klasse Handkarten.
 * 
 * @author (L) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Handkarten{

    private int anzahlKarten;
    private int anzahlSpieler;
    private Karte karte;
    private List<Karte> Handkarten;
    private Kartenstapel KS;

    /** Methoden der Liste
    add(element)
    remove(index)
    get(index)
    indexOf(element)
    contains(element)
    size() */

    public Handkarten(int pAnzahlKarten, int pAnzahlSpieler){
        anzahlKarten = pAnzahlKarten;
        anzahlSpieler = pAnzahlSpieler;
    }

    public void karteRauslegen(){
        Handkarten.remove(karte);
    }

    public Karte handkartenAusgeben(){
        for(int i=0; i < Handkarten.size();i++){
            return Handkarten.get(i);
        }
        return null;
    }

    public void HandkartenAuswaehlen(){
        
    }
}
