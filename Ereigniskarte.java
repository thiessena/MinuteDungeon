
public class Ereigniskarte
{
   
    protected String beschreibung;
    protected String name;
    protected String farbe;
    protected int anzahl;

    /**
     * Konstruktor für Objekte der Klasse Ereigniskarte
     */
    public Ereigniskarte(String pName, String pBeschreibung)
    {
       name = pName; 
       beschreibung = pBeschreibung;
       farbe = "";
       anzahl = 0;
    }
   

}
