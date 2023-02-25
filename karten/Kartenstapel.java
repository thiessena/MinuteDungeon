package karten;

import netzwerk.NetTrennzeichen;

/**
 * Ein Kartenstapel, der Karten verwaltet und auf und zugedeckt werden kann.
 * 
 */
public class Kartenstapel{
    private List<Karte> karten;
    private boolean aufgedeckt;
    
    
    public Kartenstapel(){
        karten = new List<Karte>();
        aufgedeckt = true;
    }
    
    public Kartenstapel(List<Karte> pKarten, String pTyp, int pID){
        karten = pKarten;
        aufgedeckt = true;
    }

    /**
     * Gibt eine String-Repraesentation des Kartenstapels zurück.
     */
    public String toString(){
        String obersteKarte = aufgedeckt && getObersteKarte()!=null ? getObersteKarte().toString() : "x";
        return "[" + obersteKarte + "(" + getAnzahl() + ")]";
    }
    
    /**
     * Mischt den Kartenstapel
     */
    public void mischen(){
        int p = 0;
        int anzahl = getAnzahl();
        while(p < 1000){
            karten.toFirst();
            Karte temp = karten.getContent();
            int random = (int)(Math.random()*(anzahl + 1));
            for(int i = 0; i < random; i++){
                karten.next();
            }
            karten.insert(temp);
            p++;
        }
    }


    /**
     * Deckt den Kartenstapel auf oder zu.
     * @param pAufgedeckt
     */
    public void setAufgedeckt(boolean pAufgedeckt){
        aufgedeckt = pAufgedeckt;
    }

    /**
     * Gibt zurück, ob der Kartenstapel aufgedeckt ist.
     * @return aufgedeckt
     */
    public boolean getAufgedeckt(){
        return aufgedeckt;
    }
    
    /**
     * Gibt die oberste Karte des Kartenstapels zurÃ¼ck. 
     * Falls es keine Karte im Stapel gibt, wird null zurÃ¼ckgegeben.
     * @return
     */
    public Karte getObersteKarte(){
        karten.toFirst();
        return karten.hasAccess() ? karten.getContent(): null;
    }

    /**
     * Gibt eine Liste mit n Karten vom Stapel, falls der Karten soviele Karten enthÃ¤lt.
     * @param n
     * @return
     */
    public List<Karte> gibObersteKarten(int n){
        List<Karte> temp = new List<Karte>();
        int p = 0;
        karten.toFirst();
        while(karten.hasAccess() && p < n){
            Karte neu = karten.getContent();
            temp.append(neu);
            karten.next();
            p++;
        }
        return temp;
    }

    

    /**
     * Legt eine Karte unter den Kartenstapel
     * @param pKarte
     */
    public void legeUntenDrunter(Karte pKarte){
        karten.append(pKarte);
    }

    /**
     * Legt eine Karte auf den Kartenstapel
     * @param pKarte
     */
    public void legeObenDrauf(Karte pKarte){
        karten.toFirst();
        karten.insert(pKarte);
    }

    /**
     * Legt eine Liste von Karten auf den Kartenstapel. 
     * Die übergebene Liste bleibt unverändert.
     * @param pKarte
     */
    public void legeObenDrauf(List<Karte> pKartenListe){
        karten.toFirst();
        while(pKartenListe.hasAccess()){
            karten.insert(pKartenListe.getContent());
            pKartenListe.next();
        }
    }


    /**
     * Gibt die Anzahl der Karten in diesem Kartenstapel zurück.
     * @return anzahl
     */
    public int getAnzahl(){
        karten.toFirst();
        int anzahl = 0; 
        while(karten.hasAccess()){
            anzahl++;
            karten.next();
        }
        return anzahl;
    }

    /**
     * Füllt diesen Kartenstapel mit den Daten des Netzwerk-Strings.
     * @param pNetString
     * @return Kartenstapel
     */
    public void fromNetString(String pNetString){
        String[] kartenDaten = pNetString.split(NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN);
        aufgedeckt = Boolean.parseBoolean(kartenDaten[0]);
        karten = new List<Karte>();
        for(int i = 1; i < kartenDaten.length;i++){
            Karte k = new Karte();
            k.fromNetString(kartenDaten[i]);
            karten.append(k);
        }
    }

    /**
     * Gibt einen Netzwerk-String dieses Kartenstapels zurück.
     * @return
     */
    public String toNetString(){
        String netString = "" + aufgedeckt + NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN; 
        karten.toFirst();
        while(karten.hasAccess()){
            netString += karten.getContent().toNetString() + NetTrennzeichen.KARTENSTAPEL_TRENNZEICHEN;
            karten.next();
        }
        netString.substring(0, netString.length()-1);
        return netString;
    }

}
