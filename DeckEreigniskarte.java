public class DeckEreigniskarte extends Ereigniskarte
{
    //Erklärung
    //Hallo Philipp, die Karte Chaos ist eigentlich der Name. 
    //D.h. du kannst eine neue Karte Chaos erstellen: 
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
        switch (pDE.name){
            case "Chaos": //toDo -> Veränderung des Spiels
                 
                List<Spieler> sListe = Spiel.getInstance().getSpieler();
                sListe.toFirst();
                Kartenstapel temp = sListe.getContent().getHandkarten();
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
            //toDo: Hallo Luca, ich habe die obere Karte zu Ende gemacht. 
            //      Meine Idee: Du kannst den Quelltext oben verstehen und dann 
            //      auf die anderen DeckEreigniskarten anwenden. 
            break;
        }
    }
}

