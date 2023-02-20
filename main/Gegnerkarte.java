package main;
import karten.Karte;
/**
 * V1
 * @author 
 */
public class Gegnerkarte extends Karte
{
    private String name;
    private Ressourcenkarte benoetigteRessourcen;
    private Ressourcenkarte gegebeneRessourcen;
    private String gegnerTyp;
    private boolean besiegt;

    public Gegnerkarte(String pName,Ressourcenkarte pBenoetigteRessourcen,String pTyp)
    {
        benoetigteRessourcen = pBenoetigteRessourcen;
        gegebeneRessourcen = new Ressourcenkarte(0, 0, 0, 0, 0);
        besiegt = false;
    }
    public void setTyp(String pTyp){
        gegnerTyp = pTyp;
    }

    public void setName(String pName){
        name = pName;
    }
    public void arrayGegner(Ressourcenkarte pBR){
        pBR.getArray();
    }
}
