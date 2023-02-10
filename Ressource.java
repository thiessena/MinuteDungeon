public class Ressource
{
    private String farbe;
    private int anzahl;
    
    public Ressource(int pFarbe, String pAnzahl)
    {
            farbe = pFarbe;
            anzahl = pAnzahl;
    }
    
    public int getAnzahl(int pAnzahl)
    {
        return pAnzahl;
    }
    
    public int setAnzahl(int pAnzahl)
    {
        anzahl = pAnzahl;
        return anzahl;
    }
    
    public String getFarbe(String pFarbe)
    {
        return pFarbe;
    }
    
    public String setFarbe(String pFarbe)
    {
        farbe = pFarbe;
        return farbe;
    }
}
