/**
 * V1
 */
public class GegenerKarte
{
    private String gegnerName;
    private Ressourcenkarte benötigteRessourcen;
    private String gegenerTyp;
    /**
     * Konstruktor für Objekte der Klasse GegenerKarte
     */
    public GegenerKarte(String pName,Ressourcenkarte pR,String pTyp)
    {
        gegnerName = pName;
        benötigteRessourcen = pR;
        gegenerTyp = pTyp;
    }
    public void kampf(){
        //irgentwie die Ressourcenkarte lesen und ein Array erstellen 
        //irgentwie Karten von Spieler entfangen und die in das Array eintragen 
        //dann prüfen ob alles da ist 
    }
}
