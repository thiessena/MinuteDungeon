package main;
import helden.Held;
import karten.Karte;
import karten.List;

public interface Controller {
    public void setView(View pView);
    public void setHeld(Spieler pSpieler, Held pHeld);
    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad);
    public void setLevel(int pLevel);
    public void karteSpielen(Karte pKarte);
    public void karteAuswaehlen(Spieler pSpieler, Karte pKarte); 
    public void kartenAuswahlen(Spieler pSpieler, List<Karte> pKarten);
    public void spezialFaehigkeitNutzen(Spieler pSpieler);
}
