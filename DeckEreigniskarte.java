public class DeckEreigniskarte extends Ereigniskarte
{
    //Erklärung
    //Hallo Philipp, die Karte Chaos ist eigentlich der Name. 
    //D.h. du kannst eine neue Karte Chaos erstellen: 
    public static final DeckEreigniskarte CHAOS = new DeckEreigniskarte("Chaos", "JEDER gibt seine Handkarten einem Mitspieler.");
    public static final Deckereigniskarte EINWEHWEH = new DeckEreigniskarte("Ein Wehweh", "JEDER legt 1 Karte auf den eigenen Ablagestapel");
    public static final Deckereigniskarte PLOETZLICHKRANKHEIT = new DeckEreigniskarte("Plötzlich Krankheit!", "JEDER legt alle Handkarten auf den eigenen Ablagestapel");
    public static final Deckereigniskarte HNTERHALT = new DeckEreigniskarte("Hinterhalt!", "Deckt 2 Karten aus dem Dungeon auf. Ihr müsst beide besiegen, bevor es weitergeht");
    public static final Deckereigniskarte FALLTUER = new DeckEreigniskarte("Falltür", "JEDER legt 3 Karten auf den eigenen Ablagestapel");


    public DeckEreigniskarte(String pName, String pBeschreibung)
    {
        super(pName, pBeschreibung);
    }
    

    public void aktion(DeckEreigniskarte pDE){
        switch (pDE.name){
            "Chaos": //toDo -> Veränderung des Spiels
                 
                List<Spieler> sListe = Spiel.getInstance().getSpieler();
                Handkarten temp = sListe.toFirst().getContent().getHandkarten();
                sListe.toFirst();
                Spieler bekommt = sListe.getContent();
                sListe.next();
                while(sListe.hasAccess()){
                    Spieler von = sListe.getContent();
                    
                }
            break;
            "Ein Wehweh": 
            break;
        }
    
    }
    
   
    
    
}

