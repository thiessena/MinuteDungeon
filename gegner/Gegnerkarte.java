package gegner;

import karten.Karte;
import karten.List;
import karten.Ressourcenkarte;

/**
 * V1
 * 
 * @author
 */
public class Gegnerkarte extends Karte {
    private String name;
    private Ressourcenkarte benoetigteRessourcen; // Die benötigte Anzahl an Ressourcen
    private Ressourcenkarte aktuelleRessourcen; // Aktuelle im Spiel übrige Ressourcen
    private List<Ressourcenkarte> gegebeneRessourcenkarten; // alle gespielten REssourcenkarten
    private Gegnertyp typ;

    public Gegnerkarte(String pName, Ressourcenkarte pBenoetigteRessourcen, Gegnertyp pTyp) {
        name = pName;
        benoetigteRessourcen = pBenoetigteRessourcen;
        aktuelleRessourcen = benoetigteRessourcen.copy();
        gegebeneRessourcenkarten = new List<Ressourcenkarte>();
        typ = pTyp;
    }

    public void setTyp(Gegnertyp pTyp) {
        typ = pTyp;
    }

    public Gegnertyp getTyp() {
        return typ;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public Ressourcenkarte getAktuelleRessourcen() {
        return aktuelleRessourcen;
    }

    public String toString() {
        return "{G:" + name + "(" + typ + ")" + benoetigteRessourcen.toString() + "}";
    }
}
