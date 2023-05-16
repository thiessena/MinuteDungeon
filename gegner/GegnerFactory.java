package gegner;

import karten.List;
import karten.Ressourcenkarte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import karten.Karte;

/**
 * Die GegnerFactory erstellt alle Gegnerkarten.
 * Und stellt die Gegnerkarten in passender Anzahl zur Verfügung.
 * 
 * @author Philipp Kühl
 */
public class GegnerFactory {
        private static HashMap<String, Gegnerkarte> gegnerKarten = new HashMap<String, Gegnerkarte>();
        static {
                HashMap<String, Gegnerkarte> gegner = new HashMap<String, Gegnerkarte>();
                gegner.put("Zombies ohne Ende",
                                new Gegnerkarte("Zombies ohne Ende", new Ressourcenkarte(0, 3, 0, 0, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Ein überteuerter Händler",
                                new Gegnerkarte("Ein überteuerter Händler", new Ressourcenkarte(0, 0, 1, 2, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Bodenloser Abgrund",
                                new Gegnerkarte("Bodenloser Abgrund", new Ressourcenkarte(0, 0, 2, 0, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Ein „Geist“ ja klar!",
                                new Gegnerkarte("Ein „Geist“ ja klar!", new Ressourcenkarte(0, 2, 0, 0, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Ein Haufen schreiender Kinder",
                                new Gegnerkarte("Ein Haufen schreiender Kinder", new Ressourcenkarte(1, 1, 0, 0, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Ein Timberwolf",
                                new Gegnerkarte("Ein Timberwolf", new Ressourcenkarte(0, 2, 0, 0, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Lebendiges Grünzeug",
                                new Gegnerkarte("Lebendiges Grünzeug", new Ressourcenkarte(0, 0, 0, 3, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Eine sicher Sprengfallenfreie Truhe",
                                new Gegnerkarte("Eine sicher Sprengfallenfreie Truhe",
                                                new Ressourcenkarte(3, 0, 1, 0, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Reizender Schleim",
                                new Gegnerkarte("Reizender Schleim", new Ressourcenkarte(0, 0, 1, 0, 1),
                                                Gegnertyp.MONSTER));
                gegner.put("Sir Fuzzy",
                                new Gegnerkarte("Sir Fuzzy", new Ressourcenkarte(0, 0, 1, 0, 2), Gegnertyp.MONSTER));
                gegner.put("Ein langsam ladender Bildschirm",
                                new Gegnerkarte("Ein langsam ladender Bildschirm", new Ressourcenkarte(0, 1, 1, 0, 1),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Eine Kriegerprinzessin",
                                new Gegnerkarte("Eine Kriegerprinzessin", new Ressourcenkarte(1, 0, 0, 0, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Ööööhhaa",
                                new Gegnerkarte("Ööööhhaa", new Ressourcenkarte(2, 0, 0, 1, 0), Gegnertyp.MONSTER));
                gegner.put("Ein Aufrechter Geist",
                                new Gegnerkarte("Ein Aufrechter Geist", new Ressourcenkarte(1, 0, 0, 1, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Genau 26 Ninjas",
                                new Gegnerkarte("Genau 26 Ninjas", new Ressourcenkarte(0, 0, 2, 1, 0),
                                                Gegnertyp.PERSON));
                gegner.put("Der Karpaltunnel",
                                new Gegnerkarte("Der Karpaltunnel", new Ressourcenkarte(0, 0, 0, 1, 2),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Eine lächerlich hohe Eiswand",
                                new Gegnerkarte("Eine lächerlich hohe Eiswand", new Ressourcenkarte(0, 0, 3, 0, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Ein paar Stufen",
                                new Gegnerkarte("Ein paar Stufen", new Ressourcenkarte(0, 0, 1, 1, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Zwei Mann ein Bogen",
                                new Gegnerkarte("Zwei Mann ein Bogen", new Ressourcenkarte(1, 0, 0, 0, 2),
                                                Gegnertyp.PERSON));
                gegner.put("Hai mit sexy Beinen",
                                new Gegnerkarte("Hai mit sexy Beinen", new Ressourcenkarte(0, 1, 0, 0, 2),
                                                Gegnertyp.MONSTER));
                gegner.put("Knappe Nedward",
                                new Gegnerkarte("Knappe Nedward", new Ressourcenkarte(2, 0, 0, 0, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Barb-irrer",
                                new Gegnerkarte("Barb-irrer", new Ressourcenkarte(1, 2, 0, 0, 0), Gegnertyp.PERSON));
                gegner.put("Typ mit massiven Schulterpanzer",
                                new Gegnerkarte("Typ mit massiven Schulterpanzer", new Ressourcenkarte(0, 2, 0, 1, 0),
                                                Gegnertyp.PERSON));
                gegner.put("Ein Ad-hoc-Völkerballturnier",
                                new Gegnerkarte("Ein Ad-hoc-Völkerballturnier", new Ressourcenkarte(0, 0, 2, 0, 1),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Zombietusse",
                                new Gegnerkarte("Zombietusse", new Ressourcenkarte(0, 1, 0, 0, 1), Gegnertyp.MONSTER));
                gegner.put("Ein Kaktus der dich umarmen will",
                                new Gegnerkarte("Ein Kaktus der dich umarmen will", new Ressourcenkarte(3, 0, 0, 0, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Treibsand",
                                new Gegnerkarte("Treibsand", new Ressourcenkarte(1, 0, 2, 0, 0), Gegnertyp.HINDERNIS));
                gegner.put("7 Null-bock-Zwerge",
                                new Gegnerkarte("7 Null-bock-Zwerge", new Ressourcenkarte(1, 1, 0, 1, 0),
                                                Gegnertyp.PERSON));
                gegner.put("Knuffiger Goblin",
                                new Gegnerkarte("Knuffiger Goblin", new Ressourcenkarte(0, 1, 1, 0, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Ein etwas unbequemer Stuhl",
                                new Gegnerkarte("Ein etwas unbequemer Stuhl", new Ressourcenkarte(1, 1, 1, 0, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Eingestürzte Decke",
                                new Gegnerkarte("Eingestürzte Decke", new Ressourcenkarte(0, 1, 0, 2, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Steve", new Gegnerkarte("Steve", new Ressourcenkarte(0, 0, 1, 1, 1), Gegnertyp.PERSON));
                gegner.put("Ein Armhändler",
                                new Gegnerkarte("Ein Armhändler", new Ressourcenkarte(0, 0, 0, 1, 1),
                                                Gegnertyp.PERSON));
                gegner.put("Ein Rosetta-Stein-Golem",
                                new Gegnerkarte("Ein Rosetta-Stein-Golem", new Ressourcenkarte(1, 0, 1, 0, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Eine “Abkürzung”",
                                new Gegnerkarte("Eine “Abkürzung”", new Ressourcenkarte(2, 1, 0, 0, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Gespickte Wand",
                                new Gegnerkarte("Gespickte Wand", new Ressourcenkarte(1, 0, 0, 2, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Buchstäblich ein Strohmann",
                                new Gegnerkarte("Buchstäblich ein Strohmann", new Ressourcenkarte(0, 1, 1, 1, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("William Duck I.",
                                new Gegnerkarte("William Duck I.", new Ressourcenkarte(1, 0, 1, 1, 0),
                                                Gegnertyp.MONSTER));
                gegner.put("Unsichtbare Wand",
                                new Gegnerkarte("Unsichtbare Wand", new Ressourcenkarte(0, 0, 0, 2, 0),
                                                Gegnertyp.HINDERNIS));
                gegner.put("Grozznak der Grosse",
                                new Gegnerkarte("Grozznak der Grosse", new Ressourcenkarte(1, 0, 1, 0, 1),
                                                Gegnertyp.PERSON));

                gegnerKarten = gegner;
        }

        /**
         * Gibt alle Gegnerkarten zurück, die im Spiel vorhanden sind.
         * 
         * @return Gegnerkarten: List<Gegnerkarte>
         */
        public static List<Karte> getAlleGegnerkarten() {
                List<Karte> karten = new List<Karte>();
                gegnerKarten.forEach((key, value) -> {
                        karten.append(value.clone());
                });
                return karten;
        }

        /**
         * Gibt n Gegnerkarten in einer zufälligen Reihenfolge zurück.
         * 
         * @param n
         * @return
         */
        public static List<Karte> getGegnerKarten(int n) {
                final java.util.List<String> keys = new ArrayList<String>(gegnerKarten.keySet());
                List<Karte> gegnerListe = new List<Karte>();
                Collections.shuffle(keys);
                for (int i = 0; i < n; i++) {
                        gegnerListe.append(gegnerKarten.get(keys.get(i)).clone());
                }
                return gegnerListe;
        }

        /**
         * Gibt die Gegnerkarte mit dem Namen pNamen zurück.
         * 
         * @param pName
         * @return Gegnerkarte
         */
        public static Gegnerkarte getGegnerkarte(String pName) {
                return gegnerKarten.get(pName);
        }

        public Set<String> getGegnernamen() {
                return gegnerKarten.keySet();
        }

        /**
         * Erzeugt eine Gegnerkarte mit dem Namen pName.
         * 
         * @param pName
         * @return
         */
        public static Gegnerkarte create(String pName) {
                return gegnerKarten.get(pName).clone();
        }

}
