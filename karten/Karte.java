package karten;
public class Karte{

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
    
    

}