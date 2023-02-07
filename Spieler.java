
public class Spieler{
    private Kartenstapel nachziehstapel;
    private Kartenstapel ablagestapel;
    private Kartenstapel handkarten;
    private int spielerID;
    
    public Spieler(int pID, Kartenstapel pNachziehstapel, Kartenstapel pAblagestapel){
        spielerID = pID;
        nachziehstapel = pNachziehstapel;
        ablagestapel = pAblagestapel;
    }
    
    public Kartenstapel getNachziestapel(){
        return nachziehstapel;
    }
    
    public Kartenstapel getAblagestapel(){
        return ablagestapel;
    }

    public Kartenstapel getHandkarten(){
        return handkarten;
    }

    public void setHandkarten(Kartenstapel pHandkarten){
        handkarten = pHandkarten;
    }
    
    public int getID(){
        return spielerID;
    }
}
