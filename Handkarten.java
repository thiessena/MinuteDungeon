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
    private List<Karte> handkarten;
    private Kartenstapel KS;
    private List<Karte> ausgewaehlt;

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

    public void karteRauslegen(Karte pKarte){
        handkarten.remove(pKarte);
    }

    public void karteHinzufuegen(){
        handkarten.add(KS.getObersteKarte());
    }

    public Karte aktuelleKarte(){
        handkarten.toFirst();
        return handkarten.getContent();
    }

    public Karte handkartenAusgeben(){
        for(int i=0; i < handkarten.size();i++){
            return handkarten.get(i);
        }
        return null;
    }

    public void handkartenAuswaehlen(int auswaehlen){
        ausgewaehlt.add(handkarten.get(auswaehlen));
        handkarten.remove(auswaehlen);
    }
}
