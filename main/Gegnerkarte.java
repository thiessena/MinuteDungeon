package main;
import karten.Karte;
/**
 * V1
 * @author 
 */
public class Gegnerkarte extends Karte
{
    private String gegnerName;
    private Ressourcenkarte benoetigteRessourcen;
    private Ressourcenkarte gegebeneRessourcen;
    private String gegnerTyp;
    private boolean besiegt;

    public Gegnerkarte(String pName,Ressourcenkarte pBR,Ressourcenkarte pGB,String pTyp)
    {
        benoetigteRessourcen = pBR;
        gegebeneRessourcen = pGB;
        besiegt = false;
    }
    public void setTyp(String pTyp){
        gegnerTyp = pTyp;
    }

    public void setName(String pName){
        gegnerName = pName;
    }
    public void arrayGegner(Ressourcenkarte pBR){
        pBR.getArray();
    }
}
