package main;

import helden.Held;
import karten.Karte;
import karten.List;

public interface Controller {
    public void setView(View pView);

    public boolean setHeld(Spieler pSpieler, Held pHeld);

    public void setSchwierigkeitsgrad(int pSchwierigkeitsgrad);

    public void setLevel(int pLevel);

    public void karteSpielen(Karte pKarte);

    public void karteSpielen(Spieler pSpieler, int position);

    public void karteAuswaehlen(Spieler pSpieler, Karte pKarte);

    public void kartenAuswaehlen(Spieler pSpieler, List<Karte> pKarten);

    public void kartenAuswaehlen(Spieler pSpieler, int[] positionen);

    public void spezialFaehigkeitNutzen(Spieler pSpieler);
}
