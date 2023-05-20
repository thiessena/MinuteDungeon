package main;

import karten.List;
import karten.Karte;

public interface View {
    public void zeigeHeldenAuswahl();

    public void zeigeLevelAuswahl();

    public void zeigeDungeon(Dungeon pDungen);

    public void zeigeTimer(Countdown pCountdown);

    public void zeigeSpieler(Spieler pSpieler);

    public void zeigeKartenAuswahl(Spieler pSpieler);

    public void zeigeKarteSpielenAuswahl(Spieler pSpieler);

    public void zeigeSpiel(Spiel pSpiel);

    public void zeigeWarteBildschirm();

    public void siegesBildschirm();
}
