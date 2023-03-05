package main;

import karten.List;
import karten.Karte;

/**
 * Die GegnerFactory erstellt alle Gegnerkarten.
 * Und stellt die Gegnerkarten in passender Anzahl zur Verfügung.
 * 
 * @author Philipp Kühl
 */
public class GegnerFactory {
  List<Karte> gegner;

  public GegnerFactory() {
    gegner = new List<Karte>();
    erstelleKarten();
  }

  /**
   * Gibt alle Gegnerkarten zurück, die im Spiel vorhanden sind.
   * 
   * @return Gegnerkarten: List<Gegnerkarte>
   */
  public List<Karte> getAlleGegnerkarten() {
    return gegner;
  }

  /**
   * Gibt die Gegnerkarte mit dem Namen pNamen zurück.
   * 
   * @param pName
   * @return Gegnerkarte
   */
  public Gegnerkarte getGegnerkarte(String pName) {
    Gegnerkarte erg;

    /**
     * Anmerkung von ThI:
     * Die Listenmethoden benutzen:
     * - toFirst()
     * - hasAccess()
     * - next()
     * - getContent()
     */
    /*
     * List<Gegnerkarte>gegner{
     * for(int i=0;i<list.length && list[i]!=null;i++){
     * if (name = pName){
     * return Gegnerkarte erg;
     * }
     * }
     * }
     */
    // Durch die Liste laufen und immer vergleichen, ob der Name zu pName passt.
    // Dann das Element zurückgeben.

    return null;
  }

  public void erstelleKarten() {
    // Gegnerkarte(String pName,Ressourcenkarte pBR,Ressourcenkarte pGB,String pTyp)
    // new Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int
    // pSchriftrolle, int pPfeil));
    gegner.append(new Gegnerkarte("Zombies ohne Ende", new Ressourcenkarte(0, 3, 0, 0, 0), "Monster"));
    gegner.append(new Gegnerkarte("Ein überteuerter Händler", new Ressourcenkarte(0, 0, 1, 2, 1), "Person"));
    gegner.append(new Gegnerkarte("Bodenloser Abgrund", new Ressourcenkarte(0, 0, 2, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Ein „Geist“ ja klar!", new Ressourcenkarte(0, 2, 0, 0, 1), "Person"));
    gegner.append(new Gegnerkarte("Ein Haufen schreiender Kinder", new Ressourcenkarte(1, 1, 0, 0, 1), "Person"));
    gegner.append(new Gegnerkarte("Ein Timberwolf", new Ressourcenkarte(0, 2, 0, 0, 0), "Monster"));
    gegner.append(new Gegnerkarte("Lebendiges Grünzeug", new Ressourcenkarte(0, 0, 0, 3, 0), "Hindernis"));
    gegner.append(
        new Gegnerkarte("Eine sicher Sprengfallenfreie Truhe", new Ressourcenkarte(3, 0, 1, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Reizender Schleim", new Ressourcenkarte(0, 0, 1, 0, 1), "Monster"));
    gegner.append(new Gegnerkarte("Sir Fuzzy", new Ressourcenkarte(0, 0, 1, 0, 2), "Monster"));
    gegner.append(new Gegnerkarte("Ein langsam ladender Bildschirm", new Ressourcenkarte(0, 1, 1, 0, 1), "Hindernis"));
    gegner.append(new Gegnerkarte("Eine Kriegerprinzessin", new Ressourcenkarte(1, 0, 0, 0, 1), "Person"));
    gegner.append(new Gegnerkarte("Ööööhhaa", new Ressourcenkarte(2, 0, 0, 1, 0), "Monster"));
    gegner.append(new Gegnerkarte("Ein Aufrechter Geist", new Ressourcenkarte(1, 0, 0, 1, 0), "Monster"));
    gegner.append(new Gegnerkarte("Genau 26 Ninjas", new Ressourcenkarte(0, 0, 2, 1, 0), "Person"));
    gegner.append(new Gegnerkarte("Der Karpaltunnel", new Ressourcenkarte(0, 0, 0, 1, 2), "Hindernis"));
    gegner.append(new Gegnerkarte("Eine lächerlich hohe Eiswand", new Ressourcenkarte(0, 0, 3, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Ein paar Stufen", new Ressourcenkarte(0, 0, 1, 1, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Zwei Mann ein Bogen", new Ressourcenkarte(1, 0, 0, 0, 2), "Person"));
    gegner.append(new Gegnerkarte("Hai mit sexy Beinen", new Ressourcenkarte(0, 1, 0, 0, 2), "Monster"));
    gegner.append(new Gegnerkarte("Knappe Nedward", new Ressourcenkarte(2, 0, 0, 0, 1), "Person"));
    gegner.append(new Gegnerkarte("Barb-irrer", new Ressourcenkarte(1, 2, 0, 0, 0), "Person"));
    gegner.append(new Gegnerkarte("Typ mit massiven Schulterpanzer", new Ressourcenkarte(0, 2, 0, 1, 0), "Person"));
    gegner.append(new Gegnerkarte("Ein Ad-hoc-Völkerballturnier", new Ressourcenkarte(0, 0, 2, 0, 1), "Hindernis"));
    gegner.append(new Gegnerkarte("Zombietusse", new Ressourcenkarte(0, 1, 0, 0, 1), "Monster"));
    gegner.append(new Gegnerkarte("Ein Kaktus der dich umarmen will", new Ressourcenkarte(3, 0, 0, 0, 0), "Monster"));
    gegner.append(new Gegnerkarte("Treibsand", new Ressourcenkarte(1, 0, 2, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("7 Null-bock-Zwerge", new Ressourcenkarte(1, 1, 0, 1, 0), "Person"));
    gegner.append(new Gegnerkarte("Knuffiger Goblin", new Ressourcenkarte(0, 1, 1, 0, 0), "Monster"));
    gegner.append(new Gegnerkarte("Ein etwas unbequemer Stuhl", new Ressourcenkarte(1, 1, 1, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Eingestürzte Decke", new Ressourcenkarte(0, 1, 0, 2, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Steve", new Ressourcenkarte(0, 0, 1, 1, 1), "Person"));
    gegner.append(new Gegnerkarte("Ein Armhändler", new Ressourcenkarte(0, 0, 0, 1, 1), "Person"));
    gegner.append(new Gegnerkarte("Ein Rosetta-Stein-Golem", new Ressourcenkarte(1, 0, 1, 0, 0), "Monster"));
    gegner.append(new Gegnerkarte("Eine “Abkürzung”", new Ressourcenkarte(2, 1, 0, 0, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Gespickte Wand", new Ressourcenkarte(1, 0, 0, 2, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Buchstäblich ein Strohmann", new Ressourcenkarte(0, 1, 1, 1, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("William Duck I.", new Ressourcenkarte(1, 0, 1, 1, 0), "Monster"));
    gegner.append(new Gegnerkarte("Unsichtbare Wand", new Ressourcenkarte(0, 0, 0, 2, 0), "Hindernis"));
    gegner.append(new Gegnerkarte("Grozznak der Grosse", new Ressourcenkarte(1, 0, 1, 0, 1), "Person"));

  }

}
