package karten;
import netzwerk.NetObject;
import netzwerk.NetTrennzeichen;
public class Karte implements NetObject{

    private boolean verdeckt;
    private String farbe;
 
    public Karte(){
        verdeckt = false;
        farbe = "";
    }

    public Karte(String pFarbe){
        farbe = pFarbe; 
        verdeckt = false;
    }

    public Karte(String pFarbe, boolean pVerdeckt){
        farbe= pFarbe; 
        verdeckt = pVerdeckt;
    }

    public String toString(){
        return verdeckt? "["+ farbe +"]" : "[]";
    }

    public boolean getVerdeckt(){
        return verdeckt;
    }
    
    public void setVerdeckt(boolean pVerdeckt){
       verdeckt = pVerdeckt; 
    }
    
    public String getFarbe(){
        return farbe;
    }
    
    public void setVerdeckt(String pFarbe){
       farbe = pFarbe; 
    }
    
    /**
     * Gibt eine String-Representation der Karte zurück für den Versand übers Netzwerk
     * @return String verdeckt%farbe
     */
    public String toNetString(){
        return verdeckt + NetTrennzeichen.KARTEN_TRENNZEICHEN + farbe; 
    }

    /**
     * Gibt eine Karte zurück, die die Eigenschaften des NetStrings beeinhaltet.
     * @param pNetString
     * @return Karte
     */
    public void fromNetString(String pNetString){
        String[] daten = pNetString.split(NetTrennzeichen.KARTEN_TRENNZEICHEN);
        verdeckt = Boolean.parseBoolean(daten[0]);
        farbe = daten[1];
    }
}
