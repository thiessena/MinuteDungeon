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
        karten.toFirst();
        int anzahl = 0;
        while(!karten.isEmpty()){
            karten.toFirst();
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
        return null; //toDo muss noch geschrieben werden.
    }

    /**
     * Legt eine Karte unter den Kartenstapel
     * @param pKarte
     */
    public void legeUntenDrunter(Karte pKarte){

    }

    /**
     * Legt eine Karte auf den Kartenstapel
     * @param pKarte
     */
    public void legeObenDrauf(Karte pKarte){

    }


}
