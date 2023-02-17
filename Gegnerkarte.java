/**
 * V1
 */
public class GegnerKarte
{
    private String gegnerName;
    private Ressourcenkarte benötigteRessourcen;
    private Ressourcenkarte gegebeneRessourcen;
    private String gegenerTyp;
    private boolean besiegt;
    /**
     * Konstruktor für Objekte der Klasse GegenerKarte
     */
    public GegenerKarte(String pName,Ressourcenkarte pBR,Ressourcenkarte pGB,String pTyp)
    {
        gegnerName = pName;
        benötigteRessourcen = pBR;
        gegebeneRessourcen = pGB;
        gegenerTyp = pTyp;
        besiegt = false;
    }
    public void kampf(){
        //if(pBR = pGB)
            besiegt = true;
        //irgentwie die Ressourcenkarte lesen und ein Array erstellen 
        //irgentwie Karten von Spieler entfangen und die in das Array eintragen 
        //dann prüfen ob alles da ist 
    }
}
