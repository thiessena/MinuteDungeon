package helden;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Verwaltet alle Helden und gibt die entsprechenden Herden zurück.
 * 
 * @author @Andyaya
 */
public class HeldenFactory {
    private static HashMap<String, Held> helden = new HashMap<String, Held>();
    static {
        Map<String, Held> aMap = new HashMap<String, Held>();
        aMap.put("Paladin", new Paladin());
        aMap.put("Walkuere", new Walkuere());
        aMap.put("Barbar", new Barbar());
        aMap.put("Gladiator", new Gladiator());
        aMap.put("Dieb", new Dieb());
        aMap.put("Ninja", new Ninja());
        aMap.put("Jaegerin", new Jaegerin());
        aMap.put("Waldlaeufer", new Waldlaeufer());
        aMap.put("Magier", new Magier());
        aMap.put("Zauberin", new Zauberin());
        helden = (HashMap<String, Held>) Collections.unmodifiableMap(aMap);
    }

    public static Held create(String pName) {
        return helden.get(pName);
    }

    public static Held gibHeld(int heldenNummer) {
        Object[] namen = helden.keySet().toArray();
        return helden.get((String) namen[heldenNummer]);
    }

    /**
     * Gibt die Heldennamen der vorhandenen Helden zurück. Als ein String mit Komma
     * getrennt.
     */
    public static String getHeldennamen() {
        return helden.keySet().toString();
    }

    /**
     * Gibt die Heldenfaehigkeiten der vorhandenen Helden zurück. Als ein String mit
     * Komma getrennt.
     * 
     * @return
     */
    public static String getFaehigkeiten() {
        String faehigeiten = "";
        // toDo: Alle Faehigkeiten der Helden als String mit Komma getrennt erstellen.
        return faehigeiten;
    }
}
