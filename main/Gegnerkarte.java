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
    private String typ;
    private boolean besiegt;

    public Gegnerkarte(String pName,Ressourcenkarte pBenoetigteRessourcen,String pTyp)
    {
        benoetigteRessourcen = pBenoetigteRessourcen;
        gegebeneRessourcen = new Ressourcenkarte(0, 0, 0, 0, 0);
        besiegt = false;
        typ = pTyp;
    }
    public void setTyp(String pTyp){
        typ = pTyp;
    }

    public String getTyp(){
        return typ;
    }

    public void setName(String pName){
        name = pName;
    }
    public void arrayGegner(Ressourcenkarte pBR){
        pBR.getArray();
    }
}
