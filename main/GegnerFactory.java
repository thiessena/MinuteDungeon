package main;

import karten.List;

import java.util.HashMap;

import karten.Karte;

/**
 * Die GegnerFactory erstellt alle Gegnerkarten.
 * Und stellt die Gegnerkarten in passender Anzahl zur Verfügung.
 * 
 * @author Philipp Kühl
 */
public class GegnerFactory {
  HashMap<String, Gegnerkarte> gegner;

  public GegnerFactory() {
    gegner = new HashMap<String, Gegnerkarte>();
    erstelleKarten();
  }

  /**
   * Gibt alle Gegnerkarten zurück, die im Spiel vorhanden sind.
   * 
   * @return Gegnerkarten: List<Gegnerkarte>
   */
  public List<Karte> getAlleGegnerkarten() {
    List<Karte> karten = new List<Karte>();
    gegner.forEach((key, value) -> {
      karten.append(value);
    });
    return karten;
  }

  /**
   * Gibt die Gegnerkarte mit dem Namen pNamen zurück.
   * 
   * @param pName
   * @return Gegnerkarte
   */
  public Gegnerkarte getGegnerkarte(String pName) {
    return gegner.get(pName);
  }

  public void erstelleKarten() {
    gegner.put("Zombies ohne Ende",
        new Gegnerkarte("Zombies ohne Ende", new Ressourcenkarte(0, 3, 0, 0, 0), "Monster"));
    gegner.put("Ein überteuerter Händler",
        new Gegnerkarte("Ein überteuerter Händler", new Ressourcenkarte(0, 0, 1, 2, 1), "Person"));
    gegner.put("Bodenloser Abgrund",
        new Gegnerkarte("Bodenloser Abgrund", new Ressourcenkarte(0, 0, 2, 0, 0), "Hindernis"));
    gegner.put("Ein „Geist“ ja klar!",
        new Gegnerkarte("Ein „Geist“ ja klar!", new Ressourcenkarte(0, 2, 0, 0, 1), "Person"));
    gegner.put("Ein Haufen schreiender Kinder",
        new Gegnerkarte("Ein Haufen schreiender Kinder", new Ressourcenkarte(1, 1, 0, 0, 1), "Person"));
    gegner.put("Ein Timberwolf", new Gegnerkarte("Ein Timberwolf", new Ressourcenkarte(0, 2, 0, 0, 0), "Monster"));
    gegner.put("Lebendiges Grünzeug",
        new Gegnerkarte("Lebendiges Grünzeug", new Ressourcenkarte(0, 0, 0, 3, 0), "Hindernis"));
    gegner.put("Eine sicher Sprengfallenfreie Truhe",
        new Gegnerkarte("Eine sicher Sprengfallenfreie Truhe", new Ressourcenkarte(3, 0, 1, 0, 0), "Hindernis"));
    gegner.put("Reizender Schleim",
        new Gegnerkarte("Reizender Schleim", new Ressourcenkarte(0, 0, 1, 0, 1), "Monster"));
    gegner.put("Sir Fuzzy", new Gegnerkarte("Sir Fuzzy", new Ressourcenkarte(0, 0, 1, 0, 2), "Monster"));
    gegner.put("Ein langsam ladender Bildschirm",
        new Gegnerkarte("Ein langsam ladender Bildschirm", new Ressourcenkarte(0, 1, 1, 0, 1), "Hindernis"));
    gegner.put("Eine Kriegerprinzessin",
        new Gegnerkarte("Eine Kriegerprinzessin", new Ressourcenkarte(1, 0, 0, 0, 1), "Person"));
    gegner.put("Ööööhhaa", new Gegnerkarte("Ööööhhaa", new Ressourcenkarte(2, 0, 0, 1, 0), "Monster"));
    gegner.put("Ein Aufrechter Geist",
        new Gegnerkarte("Ein Aufrechter Geist", new Ressourcenkarte(1, 0, 0, 1, 0), "Monster"));
    gegner.put("Genau 26 Ninjas", new Gegnerkarte("Genau 26 Ninjas", new Ressourcenkarte(0, 0, 2, 1, 0), "Person"));
    gegner.put("Der Karpaltunnel",
        new Gegnerkarte("Der Karpaltunnel", new Ressourcenkarte(0, 0, 0, 1, 2), "Hindernis"));
    gegner.put("Eine lächerlich hohe Eiswand",
        new Gegnerkarte("Eine lächerlich hohe Eiswand", new Ressourcenkarte(0, 0, 3, 0, 0), "Hindernis"));
    gegner.put("Ein paar Stufen", new Gegnerkarte("Ein paar Stufen", new Ressourcenkarte(0, 0, 1, 1, 0), "Hindernis"));
    gegner.put("Zwei Mann ein Bogen",
        new Gegnerkarte("Zwei Mann ein Bogen", new Ressourcenkarte(1, 0, 0, 0, 2), "Person"));
    gegner.put("Hai mit sexy Beinen",
        new Gegnerkarte("Hai mit sexy Beinen", new Ressourcenkarte(0, 1, 0, 0, 2), "Monster"));
    gegner.put("Knappe Nedward", new Gegnerkarte("Knappe Nedward", new Ressourcenkarte(2, 0, 0, 0, 1), "Person"));
    gegner.put("Barb-irrer", new Gegnerkarte("Barb-irrer", new Ressourcenkarte(1, 2, 0, 0, 0), "Person"));
    gegner.put("Typ mit massiven Schulterpanzer",
        new Gegnerkarte("Typ mit massiven Schulterpanzer", new Ressourcenkarte(0, 2, 0, 1, 0), "Person"));
    gegner.put("Ein Ad-hoc-Völkerballturnier",
        new Gegnerkarte("Ein Ad-hoc-Völkerballturnier", new Ressourcenkarte(0, 0, 2, 0, 1), "Hindernis"));
    gegner.put("Zombietusse", new Gegnerkarte("Zombietusse", new Ressourcenkarte(0, 1, 0, 0, 1), "Monster"));
    gegner.put("Ein Kaktus der dich umarmen will",
        new Gegnerkarte("Ein Kaktus der dich umarmen will", new Ressourcenkarte(3, 0, 0, 0, 0), "Monster"));
    gegner.put("Treibsand", new Gegnerkarte("Treibsand", new Ressourcenkarte(1, 0, 2, 0, 0), "Hindernis"));
    gegner.put("7 Null-bock-Zwerge",
        new Gegnerkarte("7 Null-bock-Zwerge", new Ressourcenkarte(1, 1, 0, 1, 0), "Person"));
    gegner.put("Knuffiger Goblin", new Gegnerkarte("Knuffiger Goblin", new Ressourcenkarte(0, 1, 1, 0, 0), "Monster"));
    gegner.put("Ein etwas unbequemer Stuhl",
        new Gegnerkarte("Ein etwas unbequemer Stuhl", new Ressourcenkarte(1, 1, 1, 0, 0), "Hindernis"));
    gegner.put("Eingestürzte Decke",
        new Gegnerkarte("Eingestürzte Decke", new Ressourcenkarte(0, 1, 0, 2, 0), "Hindernis"));
    gegner.put("Steve", new Gegnerkarte("Steve", new Ressourcenkarte(0, 0, 1, 1, 1), "Person"));
    gegner.put("Ein Armhändler", new Gegnerkarte("Ein Armhändler", new Ressourcenkarte(0, 0, 0, 1, 1), "Person"));
    gegner.put("Ein Rosetta-Stein-Golem",
        new Gegnerkarte("Ein Rosetta-Stein-Golem", new Ressourcenkarte(1, 0, 1, 0, 0), "Monster"));
    gegner.put("Eine “Abkürzung”",
        new Gegnerkarte("Eine “Abkürzung”", new Ressourcenkarte(2, 1, 0, 0, 0), "Hindernis"));
    gegner.put("Gespickte Wand", new Gegnerkarte("Gespickte Wand", new Ressourcenkarte(1, 0, 0, 2, 0), "Hindernis"));
    gegner.put("Buchstäblich ein Strohmann",
        new Gegnerkarte("Buchstäblich ein Strohmann", new Ressourcenkarte(0, 1, 1, 1, 0), "Hindernis"));
    gegner.put("William Duck I.", new Gegnerkarte("William Duck I.", new Ressourcenkarte(1, 0, 1, 1, 0), "Monster"));
    gegner.put("Unsichtbare Wand",
        new Gegnerkarte("Unsichtbare Wand", new Ressourcenkarte(0, 0, 0, 2, 0), "Hindernis"));
    gegner.put("Grozznak der Grosse",
        new Gegnerkarte("Grozznak der Grosse", new Ressourcenkarte(1, 0, 1, 0, 1), "Person"));

  }

}
