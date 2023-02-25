package main;

import karten.Karte;
import karten.List;
/**
 * V1
 * @author 
 */
public class Gegnerkarte extends Karte
{
    private String name;
    private Ressourcenkarte benoetigteRessourcen; //Die benötigte Anzahl an Ressourcen
    private Ressourcenkarte aktuelleRessourcen; //Aktuelle im Spiel übrige Ressourcen
    private List<Ressourcenkarte> gegebeneRessourcenkarten; //alle gespielten REssourcenkarten
    private String typ;
    private boolean besiegt;

    public Gegnerkarte(String pName,Ressourcenkarte pBenoetigteRessourcen,String pTyp)
    {
        benoetigteRessourcen = pBenoetigteRessourcen;
        aktuelleRessourcen = benoetigteRessourcen.copy();
        gegebeneRessourcenkarten = new List<Ressourcenkarte>();
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
    public Ressourcenkarte getAktuelleRessourcen(){
        return aktuelleRessourcen;
    }
}
