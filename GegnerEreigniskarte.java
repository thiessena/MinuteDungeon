public class GegnerEreigniskarte extends Ereigniskarte
{
    private String gegnertyp;
    private GegenerKarte gegnerkarte;
    private Ressource ressource;

    public static final GegnerEreigniskarte Ruecklings = new GegnerEreigniskarte ("RÃ¼cklings", "Besiege eine Person");
    public static final GegnerEreigniskarte Feuerball = new GegnerEreigniskarte ("Feuerball", "Besiege 1 Monster");
    public static final GegnerEreigniskarte Treffer = new GegnerEreigniskarte ("Treffer", "Besiege 1 Person");
    public static final GegnerEreigniskarte Haudrauf = new GegnerEreigniskarte ("Haudrauf", "Besiege 1 Monster");
    public static final GegnerEreigniskarte HeiligeHandgranate = new GegnerEreigniskarte ("Heilige Handgranate!", "Besiege eine beliebige Karte");

    public GegnerEreigniskarte(String pName, String pBeschreibung)
    {
          super(pName, pBeschreibung);
    }

    public void anwenden(GegenerKarte gegnerkarte){
        //wenn Typ der Gegnerkarte übereinstimmt, beseitigen
        if(gegnertyp.equals(gegnerkarte.getTyp())){
            System.out.println("Gegner beseitigt!");
            ressource.setAnzahl(0);
    }
     else{
          System.out.println("Gegner kann mit der Ereigniskarte nicht beseitigt werden!");
        }
    }
}
