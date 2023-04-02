package helden;

import java.util.Collections;
import java.util.HashMap;

import karten.Karte;
import karten.List;
import karten.Ressourcenkarte;

public class HeldenDeckFactory {
    private static HashMap<String, List<Karte>> deckKarten = new HashMap<String, List<Karte>>();
    static {
        HashMap<String, List<Karte>> aMap = new HashMap<String, List<Karte>>();
        aMap.put("gelb", erstelleHeldenKartenGelb());
        aMap.put("rot", erstelleHeldenKartenRot());
        aMap.put("lila", erstelleHeldenKartenLila());
        aMap.put("gruen", erstelleHeldenKartenGruen());
        aMap.put("blau", erstelleHeldenKartenBlau());
        deckKarten = (HashMap<String, List<Karte>>) Collections.unmodifiableMap(aMap);
    }

    public static List<Karte> create(String pFarbe) {
        return deckKarten.get(pFarbe);
    }

    /**
     * Lila
     * Normale Ressourcen: Schild, Schwert, Sprung, Schriftrolle, Pfeil
     * 5,7,7,6,3
     * Doppel Ressourcen: Doppelsprung 3
     * Besondere Karten:
     * Stehlen 2 Klau die Handkarten eines Mitspielers und nimm sie zusätzlich auf
     * deine Hand
     * Spende 1 gib deine Handkarten einem Mitspieler auf die Hand
     * Rücklings 3 besiege eine Person
     * Sprint 3 überwinde ein Hindernis
     * 
     * @return
     */
    private static List<Karte> erstelleHeldenKartenLila() {
        List<Karte> lilaKarten = new List<Karte>();
        lilaKarten.concat(erstelleNormaleRessourcenkarten("lila", 5, 7, 7, 6, 3));
        // Doppel-Ressourcenkarten:
        lilaKarten.append(new Ressourcenkarte("lila", 0, 0, 2, 0, 0));
        lilaKarten.append(new Ressourcenkarte("lila", 0, 0, 2, 0, 0));
        lilaKarten.append(new Ressourcenkarte("lila", 0, 0, 2, 0, 0));
        return lilaKarten;
    }

    /**
     * #Blau
     * Normale Ressourcen: Schild, Schwert, Sprung, Schriftrolle, Pfeil
     * 5,3,6,9,7
     * Doppel Ressourcen: 2x Doppelschriftrolle,
     * Besondere Karten:
     * 4x Feuerball (Besiege ein Monster)
     * 1x Verhinderung (Alle Ignorieren ein Hindernis)
     * 3x Magische Bombe (Zählt wie 1- Mal alle Ressourcen)
     * 
     * @return
     */
    private static List<Karte> erstelleHeldenKartenBlau() {
        List<Karte> blaueKarten = new List<Karte>();
        blaueKarten.concat(erstelleNormaleRessourcenkarten("blau", 5, 3, 6, 9, 7));
        // Doppel-Ressourcenkarten:
        blaueKarten.append(new Ressourcenkarte("blau", 0, 0, 0, 2, 0));
        blaueKarten.append(new Ressourcenkarte("blau", 0, 0, 0, 2, 0));
        // Magische Bomben
        for (int i = 0; i < 4; i++) {
            blaueKarten.append(new Ressourcenkarte("blau", 1, 1, 1, 1, 1));
        }
        // Feuerbaelle
        for (int i = 0; i < 4; i++) {
            blaueKarten.append(GegnerEreigniskarte.create("Feuerball"));
        }
        return blaueKarten;
    }

    /**
     * Erstellt alle Karten für das gruene Deck:
     * #Grün
     * Normale Ressourcen: Schild, Schwert, Sprung, Schriftrolle, Pfeil
     * 3,4,7,4,9
     * Doppel Ressourcen: 2 x Doppelpfeil 1 Treffer
     * Besondere Karten:
     * 8 x Joker
     * 2 x Heilkräuter (1 Spieler + 4 Karten)
     * 1 x Treffer (Person besiegen)
     * 
     * @return
     */
    private static List<Karte> erstelleHeldenKartenGruen() {
        List<Karte> grueneKarten = new List<Karte>();
        grueneKarten.concat(erstelleNormaleRessourcenkarten("gruen", 3, 4, 7, 4, 9));
        // Doppel-Ressourcenkarten:
        grueneKarten.append(new Ressourcenkarte("gruen", 0, 0, 0, 0, 2));
        grueneKarten.append(new Ressourcenkarte("gruen", 0, 0, 0, 0, 2));
        // Treffer
        grueneKarten.append(GegnerEreigniskarte.create("Treffer"));
        return grueneKarten;
    }

    /**
     * Erstellt alle Karten für das rote Deck:
     * #Rot
     * Normale Ressourcen: Schild, Schwert, Sprung, Schriftrolle, Pfeil
     * 7,5,6,3,5
     * Doppel Ressourcen:
     * 2x Doppelschwert, 2x Schwert/Schild, 2x Schwert/Pfeil, 2x Schwert/Sprung, 2x
     * Schwert/Schriftrolle
     * Besondere Karten:
     * 2x Riesensprung (Überwinde ein Hindernis)
     * 2x Wut (Bestimme 2 Spieler(1 kannst du sein), die jeweils 3 Karten vom
     * Nachziehstapel ziehen)
     * 
     * @return
     */
    private static List<Karte> erstelleHeldenKartenRot() {
        List<Karte> roteKarten = new List<Karte>();
        roteKarten.concat(erstelleNormaleRessourcenkarten("rot", 7, 5, 6, 3, 5));
        // Doppel-Ressourcenkarten:
        for (int i = 0; i < 2; i++) {
            roteKarten.append(new Ressourcenkarte("rot", 0, 2, 0, 0, 0));
            roteKarten.append(new Ressourcenkarte("rot", 1, 1, 0, 0, 0));
            roteKarten.append(new Ressourcenkarte("rot", 0, 1, 0, 0, 1));
            roteKarten.append(new Ressourcenkarte("rot", 0, 1, 1, 0, 0));
            roteKarten.append(new Ressourcenkarte("rot", 0, 1, 0, 1, 0));

            // Riesensprung
            roteKarten.append(GegnerEreigniskarte.create("Riesensprung"));
        }

        return roteKarten;
    }

    /**
     * Erstellt die Karten für das gelbe Deck:
     * Gelb
     * Normale Ressourcen: Schild, Schwert, Sprung, Schriftrolle, Pfeil
     * 9,6,3,8,6
     * Doppel Ressourcen: 2 x Doppelschild
     * Besondere Karten:
     * 1 x Heile(1 Spieler darf den Nachziehstapel verdeckt den Ablegestapel legen)
     * 2 x Göttliche Schild (stoppt die Zeit bis jemand eine Karte spiet)
     * 1 x Haudrauf (besiegt ein Monster)
     * 1 x Heilige Handgranate (besiege eine beliebige Karte)
     * 1 x Heiltrank (Jeder zeigt 3 Karten)
     */
    private static List<Karte> erstelleHeldenKartenGelb() {

        List<Karte> gelbeKarten = new List<Karte>();
        gelbeKarten.concat(erstelleNormaleRessourcenkarten("gelb", 9, 6, 3, 8, 6));
        gelbeKarten.append(new Ressourcenkarte("gelb", 2, 0, 0, 0, 0));
        gelbeKarten.append(new Ressourcenkarte("gelb", 2, 0, 0, 0, 0));
        gelbeKarten.append(GegnerEreigniskarte.create("Haudrauf"));
        gelbeKarten.append(GegnerEreigniskarte.create("Heilige Handgranate"));
        return gelbeKarten;
    }

    private static List<Karte> erstelleNormaleRessourcenkarten(String pFarbe, int pSchild, int pSchwert, int pSprung,
            int pSchriftrolle, int pPfeil) {
        List<Karte> ressourcenListe = new List<Karte>();
        ressourcenListe.concat(erstelleRessourcenkarten(pFarbe, pSchild, 1, 0, 0, 0, 0));
        ressourcenListe.concat(erstelleRessourcenkarten(pFarbe, pSchwert, 0, 1, 0, 0, 0));
        ressourcenListe.concat(erstelleRessourcenkarten(pFarbe, pSprung, 0, 0, 1, 0, 0));
        ressourcenListe.concat(erstelleRessourcenkarten(pFarbe, pSchriftrolle, 0, 0, 0, 1, 0));
        ressourcenListe.concat(erstelleRessourcenkarten(pFarbe, pPfeil, 0, 0, 0, 0, 1));
        return ressourcenListe;
    }

    private static List<Karte> erstelleRessourcenkarten(String pFarbe, int pAnzahl,
            int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil) {
        List<Karte> ressourcenListe = new List<Karte>();
        for (int i = 0; i < pAnzahl; i++) {
            Ressourcenkarte rKarte = new Ressourcenkarte(pSchild, pSchwert, pSprung, pSchriftrolle, pPfeil);
            rKarte.setFarbe(pFarbe);
            ressourcenListe.append(rKarte);
        }
        return ressourcenListe;
    }
}
