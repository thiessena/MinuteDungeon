
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
    
    public Karte getKarte(){
        karten.toFirst();
        return karten.getContent();
    }
}
