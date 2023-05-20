package karten;

/**
 * Die Ressourcenkarte verwaltet die verschiedenen Ressourcen, die im Spiel
 * verwendet werden.
 * 
 * @author Sadduzaer1
 */
public class Ressourcenkarte extends Karte {
  private Ressource schild;
  private Ressource schwert;
  private Ressource sprung;
  private Ressource schriftrolle;
  private Ressource pfeil;

  public Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil) {
    schild = new Ressource("gelb", pSchild);
    schwert = new Ressource("rot", pSchwert);
    sprung = new Ressource("lila", pSprung);
    schriftrolle = new Ressource("blau", pSchriftrolle);
    pfeil = new Ressource("gruen", pPfeil);
  }

  public Ressourcenkarte(String pFarbe, int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil) {
    super.setFarbe(pFarbe);
    schild = new Ressource("gelb", pSchild);
    schwert = new Ressource("rot", pSchwert);
    sprung = new Ressource("lila", pSprung);
    schriftrolle = new Ressource("blau", pSchriftrolle);
    pfeil = new Ressource("gruen", pPfeil);
  }

  public Ressourcenkarte copy() {
    return new Ressourcenkarte(schild.getAnzahl(), schwert.getAnzahl(), sprung.getAnzahl(), schriftrolle.getAnzahl(),
        pfeil.getAnzahl());
  }

  public String toString() {
    return "(R> " +
        (schild.getAnzahl() > 0 ? "gelb:" + schild.getAnzahl() : "") +
        (schwert.getAnzahl() > 0 ? " rot:" + schwert.getAnzahl() : "") +
        (sprung.getAnzahl() > 0 ? " lila:" + sprung.getAnzahl() : "") +
        (schriftrolle.getAnzahl() > 0 ? " blau:" + schriftrolle.getAnzahl() : "") +
        (pfeil.getAnzahl() > 0 ? " gruen:" + pfeil.getAnzahl() : "")
        + ")";
  }

  /**
   * Addiert die Werte der Ressourcenkarte pRessourcenkarte zur Ressourcenkarte.
   * 
   * @param pRessourcenkarte
   */
  public void addiere(Ressourcenkarte pRessourcenkarte) {
    int[] anzahlen = pRessourcenkarte.getArray();
    schild.setAnzahl(schild.getAnzahl() + anzahlen[0]);
    schwert.setAnzahl(schwert.getAnzahl() + anzahlen[1]);
    sprung.setAnzahl(sprung.getAnzahl() + anzahlen[2]);
    schriftrolle.setAnzahl(schriftrolle.getAnzahl() + anzahlen[3]);
    pfeil.setAnzahl(pfeil.getAnzahl() + anzahlen[4]);
  }

  /**
   * Subtrahiert die Werte der Ressourcenkarte pRessourcenkarte zur
   * Ressourcenkarte.
   * 
   * @param pRessourcenkarte
   */
  public void subtrahiere(Ressourcenkarte pRessourcenkarte) {
    int[] anzahlen = pRessourcenkarte.getArray();
    substrahiereBisNull(schild, anzahlen[0]);
    substrahiereBisNull(schwert, anzahlen[1]);
    substrahiereBisNull(sprung, anzahlen[2]);
    substrahiereBisNull(schriftrolle, anzahlen[3]);
    substrahiereBisNull(pfeil, anzahlen[4]);
  }

  /**
   * Subtrahiert die anzahl von der Ressource pRessource. Falls die Ressource
   * unter 0 wäre,
   * wird sie auf 0 gesetzt.
   * 
   * @param pRessource
   */
  private void substrahiereBisNull(Ressource pRessource, int anzahl) {
    if (pRessource.getAnzahl() - anzahl >= 0) {
      pRessource.setAnzahl(pRessource.getAnzahl() - anzahl);
    } else {
      pRessource.setAnzahl(0);
    }
  }

  public int[] getArray() {
    int[] ressource = new int[5];
    ressource[0] = schild.getAnzahl();
    ressource[1] = schwert.getAnzahl();
    ressource[2] = sprung.getAnzahl();
    ressource[3] = schriftrolle.getAnzahl();
    ressource[4] = pfeil.getAnzahl();
    return ressource;
  }

  public boolean getAlleRessourcenGleichNull() {
    return getRohstoffSumme() == 0;
  }

  public int getRohstoffSumme() {
    int summe = 0;
    int[] ressourcenAnzahl = getArray();
    for (int i = 0; i < ressourcenAnzahl.length; i++) {
      summe += ressourcenAnzahl[i];
    }
    return summe;
  }
}
