public class GegnerEreigniskarte extends Ereigniskarte
{
    private String gegnertyp;
    private Gegnerkarte gegnerkarte;

    public static final GegnerEreigniskarte Rücklings = new GegnerEreigniskarte ("Rücklings", "Besiege eine Person");
    public static final GegnerEreigniskarte Feuerball = new GegnerEreigniskarte ("Feuerball", "Besiege 1 Monster");
    public static final GegnerEreigniskarte Treffer = new GegnerEreigniskarte ("Treffer", "Besiege 1 Person");
    public static final GegnerEreigniskarte Haudrauf = new GegnerEreigniskarte ("Haudrauf", "Besiege 1 Monster");
    public static final GegnerEreigniskarte HeiligeHandgranate = new GegnerEreigniskarte ("Heilige Handgranate!", "Besiege eine beliebige Karte");

    public GegnerEreigniskarte(String pName, String pBeschreibung)
    {

    }

    public void beseitigen(Gegnerkarte gegnerkarte){
        if(gegnertyp.equals(gegnerkarte.getTyp())){
            System.out.println("Gegner beseitigt!");
    }
     else{
          System.out.println("Gegner kann mit der Ereigniskarte nicht beseitigt werden!");
        }
    }
}
