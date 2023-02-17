/**
 * V1
 */
public class GegnerKarte
{
    private String gegnerName;
    private Ressourcenkarte benoetigteRessourcen;
    private Ressourcenkarte gegebeneRessourcen;
    private String gegnerTyp;
    private boolean besiegt;
    public GegnerKarte(String pName,Ressourcenkarte pBR,Ressourcenkarte pGB,String pTyp)
    {
        benoetigteRessourcen = pBR;
        gegebeneRessourcen = pGB;
        besiegt = false;
    }
    public void setTyp(gegnerTyp pTyp){
        gegenerTyp = pTyp;
    }
    public void setName(gegnerName pName){
        gegnerName = pName;
    }
    public void arrayGegner(Ressourcenkarte pBR){
        pBR.getArray();
    }
}
