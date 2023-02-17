public class Kartenstapel{
    private List<Karte> karten;
    private String typ;
    private int spielerID;
    private int anzahl;
    
    public Kartenstapel(List<Karte> pKarten, String pTyp, int pID){
        karten = pKarten;
        typ = pTyp;
        spielerID = pID;
        zaehlen();
    }
    
    public void mischen(){
        int p = 0;
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
     * Gibt die oberste Karte des Kartenstapels zurÃ¼ck. 
     * Falls es keine Karte im Stapel gibt, wird null zurÃ¼ckgegeben.
     * @return
     */
    public Karte getObersteKarte(){
        karten.toFirst();
        return karten.getContent();
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
        while(p < n){
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

    public void zaehlen(){
        karten.toFirst();
        while(karten.hasAccess()){
            anzahl++;
            karten.next();
        }
    }
}
