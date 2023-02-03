public class Ressource
{
    public String Farbe;
    public int Anzahl;
    
    public Ressource()
    {
            
    }
    
    public int getAnzahl(int pAnzahl)
    {
        return pAnzahl;
    }
    
    public int setAnzahl(int pAnzahl)
    {
        Anzahl = pAnzahl;
        return Anzahl;
    }
    
    public String getFarbe(String pFarbe)
    {
        return pFarbe;
    }
    
    public String setFarbe(String pFarbe)
    {
        Farbe = pFarbe;
        return Farbe;
    }
}
