public class Ressourcenkarte extends Karte
{
  private Ressource schild;
  private Ressource schwert;
  private Ressource sprung;
  private Ressource schriftrolle;
  private Ressource pfeil;
  
  public Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil)
  {
    schild = new Ressource("gelb", pSchild);
    schwert = new Ressource("rot", pSchwert);
    sprung = new Ressource("lila", pSprung);
    schriftrolle = new Ressource("blau", pSchriftrolle);
    pfeil = new Ressource("grün", pPfeil);
  }
  
  public int[] getArray()
  {
    int[]ressource = new int[5];
    ressource[0] = schild.getAnzahl();
    ressource[1] = schwert.getAnzahl();
    ressource[2] = sprung.getAnzahl();
    ressource[3] = schriftrolle.getAnzahl();
    ressource[4] = pfeil.getAnzahl(); 
    return ressource;
  }
}
