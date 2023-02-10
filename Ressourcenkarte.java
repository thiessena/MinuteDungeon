public class Ressourcenkarte extends Karte;
{
  private int[]ressource = new int[4];
  private int schild;
  private int schwert;
  private int sprung;
  private int schriftrolle;
  private int pfeil;
  
  public Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil)
  {
    ressource[0] = pSchild;
    ressource[1] = pSchwert;
    ressource[2] = pSprung;
    ressource[3] = pSchriftrolle;
    ressource[4] = pPfeil; 
  }
  
  public int[] getArray()
  {
    return ressource;
  }
  
  public void toArray()
  {
  
  }
}
