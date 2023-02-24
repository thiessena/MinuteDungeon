package main;
import karten.*;

/**
 * Verwaltet alle Aktionen der DeckEreigniskarten.
 */
public class DeckEreigniskarte extends Ereigniskarte
{
    public static final DeckEreigniskarte CHAOS = new DeckEreigniskarte("Chaos", "JEDER gibt seine Handkarten einem Mitspieler.");
    public static final DeckEreigniskarte EINWEHWEH = new DeckEreigniskarte("Ein Wehweh", "JEDER legt 1 Karte auf den eigenen Ablagestapel");
    public static final DeckEreigniskarte PLOETZLICHKRANKHEIT = new DeckEreigniskarte("Plötzlich Krankheit!", "JEDER legt alle Handkarten auf den eigenen Ablagestapel");
    public static final DeckEreigniskarte HNTERHALT = new DeckEreigniskarte("Hinterhalt!", "Deckt 2 Karten aus dem Dungeon auf. Ihr müsst beide besiegen, bevor es weitergeht");
    public static final DeckEreigniskarte FALLTUER = new DeckEreigniskarte("Falltür", "JEDER legt 3 Karten auf den eigenen Ablagestapel");


    public DeckEreigniskarte(String pName, String pBeschreibung)
    {
        super(pName, pBeschreibung);
    }
    

    public void aktion(DeckEreigniskarte pDE){
        List<Spieler> sListe = Spiel.getInstance().getSpieler();
        switch (pDE.name){
            case "Chaos": //toDo -> Veränderung des Spiels
                sListe.toFirst();
                Handkarten temp = sListe.getContent().getHandkarten();
                sListe.toFirst();
                Spieler bekommt = sListe.getContent();
                sListe.next();
                while(sListe.hasAccess()){
                    Spieler von = sListe.getContent();
                    bekommt.setHandkarten(von.getHandkarten());
                    bekommt = von;
                    sListe.next();
                }
                bekommt.setHandkarten(temp);
            break;
            case "Ein Wehweh":
                sListe.toFirst();
               while(sListe.hasAccess()){
                    Spieler akt = sListe.getContent();
                    Handkarten hk = akt.getHandkarten();
                    Karte k = hk.gibHandkarte((int)(Math.random() * hk.getAnzahl()));         
                    akt.getAblagestapel().legeObenDrauf(k);
                    sListe.next();
                }
            break;
            case "Ploetzlich Krankheit!":
                sListe.toFirst();
               while(sListe.hasAccess()){
                    Spieler akt = sListe.getContent();
                    Handkarten hk = akt.getHandkarten();
                    List<Karte> alleKarten = hk.gibAlleHandkarten();
                    akt.getAblagestapel().legeObenDrauf(alleKarten);
                    sListe.next();
                 }
            break;
            case "Hinterhalt":
                for (int i = 0; i < 2; i++){
                    Spiel.getInstance().getDungeon().naechsteGegnerKarte();
                }
            break;
            case "Falltuer":
                sListe.toFirst();
               while(sListe.hasAccess()){
                    Spieler akt = sListe.getContent();
                    Handkarten hk = akt.getHandkarten();
                    for (int i = 0; i < 3; i++){
                        Karte k = hk.gibHandkarte((int)(Math.random() * hk.getAnzahl()));
                        akt.getAblagestapel().legeObenDrauf(k);
                    }
                    sListe.next();
                }
            break;
        }
    }
}

