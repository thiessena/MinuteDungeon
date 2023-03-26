package helden;

import karten.List;
import karten.Karte;
import main.Ressourcenkarte;

/**
 * Verwaltet alle Helden und gibt die entsprechenden Herden zurück.
 * 
 * @author @Andyaya
 */
public class HeldenFactory {
    List<Held> helden;

    public HeldenFactory() {
        helden = new List<Held>();
        erstelleHelden();
    }

    private void erstelleHelden() {
        helden.append(new Paladin());
        helden.append(new Walkuere());
        helden.append(new Barbar());
        helden.append(new Gladiator());
        helden.append(new Dieb());
        helden.append(new Ninja());
        helden.append(new Jaegerin());
        helden.append(new Waldlaeufer());
        helden.append(new Magier());
        helden.append(new Zauberin());
    }

    public static Held gibHeld(int heldenNummer) {
        Held h = null;
        switch (heldenNummer) {
            case 1:
                h = new Paladin();
                break;
        }
        return h;
    }

    /**
     * Gibt die Heldennamen der vorhandenen Helden zurück. Als ein String mit Komma
     * getrennt.
     */
    public String getHeldennamen() {
        String heldenAuswahl = "";
        // toDo: Alle Namen der Helden als String mit Komma zurückgeben.
        return heldenAuswahl;
    }

    /**
     * Gibt die Heldenfaehigkeiten der vorhandenen Helden zurück. Als ein String mit
     * Komma getrennt.
     * 
     * @return
     */
    public String getFaehigkeiten() {
        String faehigeiten = "";
        // toDo: Alle Faehigkeiten der Helden als String mit Komma getrennt erstellen.
        return faehigeiten;
    }

}
