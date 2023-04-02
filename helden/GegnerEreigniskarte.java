package helden;

import java.util.Collections;
import java.util.HashMap;

import gegner.Gegnerkarte;
import karten.Ereigniskarte;
import karten.Ressource;

public class GegnerEreigniskarte extends Ereigniskarte {
    private String gegnertyp;
    private Ressource ressource;
    private String beschreibung;

    private static HashMap<String, GegnerEreigniskarte> karten = new HashMap<String, GegnerEreigniskarte>();
    static {
        HashMap<String, GegnerEreigniskarte> aMap = new HashMap<String, GegnerEreigniskarte>();
        aMap.put("Ruecklings", new GegnerEreigniskarte("Ruecklings", "Person", "Besiege eine Person"));
        aMap.put("Feuerball", new GegnerEreigniskarte("Feuerball", "Monster", "Besiege 1 Monster"));
        aMap.put("Treffer", new GegnerEreigniskarte("Treffer", "Person", "Besiege 1 Person"));
        aMap.put("Haudrauf", new GegnerEreigniskarte("Haudrauf", "Monster", "Besiege 1 Monster"));
        aMap.put("Heilige Handgranate",
                new GegnerEreigniskarte("Heilige Handgranate!", "Beliebig", "Besiege eine beliebige Karte"));

        karten = (HashMap<String, GegnerEreigniskarte>) Collections.unmodifiableMap(aMap);
    }

    public static GegnerEreigniskarte create(String pName) {
        return karten.get(pName).clone();
    }

    public GegnerEreigniskarte clone() {
        return new GegnerEreigniskarte(name, gegnertyp, beschreibung);
    }

    public GegnerEreigniskarte(String pName, String pGegnertyp, String pBeschreibung) {
        super(pName, pBeschreibung);
        gegnertyp = pGegnertyp;
    }

    public void anwenden(Gegnerkarte gegnerkarte) {
        // wenn Typ der Gegnerkarte übereinstimmt, beseitigen
        if (gegnertyp.equals(gegnerkarte.getTyp()) || "Beliebig".equals(gegnertyp)) {
            System.out.println("Gegner beseitigt!");
            ressource.setAnzahl(0);
        } else {
            System.out.println("Gegner kann mit der Ereigniskarte nicht beseitigt werden!");
        }
    }

}
