package main;
import helden.Held;
import karten.Karte;

public interface Controller {
    public void setHeld(Spieler pSpieler, Held pHeld);
    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad);
    public void setLevel(int pLevel);
    public void karteSpielen(Karte pKarte);
}
