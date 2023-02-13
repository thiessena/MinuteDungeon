
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
        for(int i=0; i < handkarten.();i++){
            handkarten.toFirst();
            
            return handkarten.(i);
        }
        return null;
    }
    
    public void gibHandkarte(int Stelle){
        for(int i = 0; i <  ; i++){
         if(Stelle == i){
          return handkarten.getContent();   
         }
            handkarten.next();
        }
    }

    public void handkartenAuswaehlen(int auswaehlen){
        ausgewaehlt.append(handkarten.get(auswaehlen));
        handkarten.remove(auswaehlen);
    }
}
