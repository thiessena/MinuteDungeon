package main;
import karten.Karte;

public class Ressourcenkarte extends Karte
{
  private Ressource schild;
  private Ressource schwert;
  private Ressource sprung;
  private Ressource schriftrolle;
  private Ressource pfeil;
  
  public Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil)
  {
    schild = new Ressource("🛡️", pSchild);
    schwert = new Ressource("🗡️", pSchwert);
    sprung = new Ressource("🤾‍", pSprung);
    schriftrolle = new Ressource("📝, pSchriftrolle);
    pfeil = new Ressource("🏹", pPfeil);
  }

  public Ressourcenkarte copy(){
    return new Ressourcenkarte(schild.getAnzahl(), schwert.getAnzahl(), sprung.getAnzahl(), schriftrolle.getAnzahl(), pfeil.getAnzahl());
  }

  public String toString(){
    return "(R>🛡️"+schild+" 🗡️:"+schwert+" 🤾‍♀️:"+sprung+" 📝:"+schriftrolle+" 🏹:"+pfeil+")";
  }

  /**
   * Addiert die Werte der Ressourcenkarte pRessourcenkarte zur Ressourcenkarte.
   * @param pRessourcenkarte
   */
  public void addiere ( Ressourcenkarte pRessourcenkarte){
    //toDo Sadduzaer1
  }

  /**
   * Subtrahiert die Werte der Ressourcenkarte pRessourcenkarte zur Ressourcenkarte.
   * @param pRessourcenkarte
   */
  public void subtrahiere ( Ressourcenkarte pRessourcenkarte){
    //toDo Sadduzaer1
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
