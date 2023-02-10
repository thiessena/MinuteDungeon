public class Kartenstapel{
    private List<Karte> karten;
    private String typ;
    private int spielerID;
    
    public Kartenstapel(List<Karte> pKarten, String pTyp, int pID){
        karten = pKarten;
        typ = pTyp;
        spielerID = pID;
    }
    
    public void mischen(){
        int p = 0;
        while(p < 1000){
            karten.toFirst();
            Karte temp = karten.getContent()
            int random = (int)(Math.random()*(karten.size() + 1))
            for(int i = 0; i < random; i++){
                karten.next();
            }
            insert(temp);
            p++;
        }
    }
    
    /**
     * Gibt die oberste Karte des Kartenstapels zurück. 
     * Falls es keine Karte im Stapel gibt, wird null zurückgegeben.
     * @return
     */
    public Karte getObersteKarte(){
        karten.toFirst();
        return karten.getContent();
    }

    /**
     * Gibt eine Liste mit n Karten vom Stapel, falls der Karten soviele Karten enthält.
     * @param n
     * @return
     */
    public List<Karte> gibObersteKarten(int n){
        List<Karte> temp = new List<Karte>();
        int p = 0;
        karten.toFirst();
        while(p < n){
            Karte neu = karten.getObject();
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


}
