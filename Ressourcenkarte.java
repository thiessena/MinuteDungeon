public class Ressourcenkarte extends Karte
{
  private Ressource schild;
  private int schwert;
  private int sprung;
  private int schriftrolle;
  private int pfeil;
  
  public Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil)
  {
    schild = new Ressource("gelb", pSchild);
  
  }
  
  public int[] getArray()
  {
    int[]ressource = new int[5];
    ressource[0] = schild.getAnzahl();
    ressource[1] = pSchwert;
    ressource[2] = pSprung;
    ressource[3] = pSchriftrolle;
    ressource[4] = pPfeil; 
    return ressource;
  }
}
