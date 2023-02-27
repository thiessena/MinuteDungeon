package main;
import karten.List;

/**
 * Die GegnerFactory erstellt alle Gegnerkarten. 
 * Und stellt die Gegnerkarten in passender Anzahl zur Verfügung.
 * @author Philipp Kühl
 */
public class GegnerFactory{
  List<Gegnerkarte> gegner;
  
  public GegnerFactory(){
    gegner = new List<Gegnerkarte>();
    erstelleKarten();
  }
  
  /**
   * Gibt die Gegnerkarte mit dem Namen pNamen zurück.
   * @param pName
   * @return Gegnerkarte
   */
  public Gegnerkarte gibGegnerkarte(String pName){
    Gegnerkarte erg;
    //Durch die Liste laufen und immer vergleichen, ob der Name zu pName passt.
    //Dann das Element zurückgeben.
      
    return null;
  }
  
  public void erstelleKarten(){
    //Gegnerkarte(String pName,Ressourcenkarte pBR,Ressourcenkarte pGB,String pTyp)
    //          new Ressourcenkarte(int pSchild, int pSchwert, int pSprung, int pSchriftrolle, int pPfeil));
    gegner.append(new Gegnerkarte("Zombies ohne Ende", new Ressourcenkarte( 0,3,0,0,0 ), "Monster"));
    gegner.append(new Gegnerkarte("Ein überteuerter Händler", new Ressourcenkarte(0,0,1,2,1),"Person"));
    gegner.append(new Gegnerkarte("Bodenloser Abgrund", new Ressourcenkarte(0,0,2,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Ein „Geist“ ja klar!", new Ressourcenkarte(0,2,0,0,1),"Person"));
    gegner.append(new Gegnerkarte("Ein Haufen schreiender Kinder", new Ressourcenkarte(1,1,0,0,1),"Person")); 
    gegner.append(new Gegnerkarte("Ein Timberwolf", new Ressourcenkarte(0,2,0,0,0),"Monster")); 
    gegner.append(new Gegnerkarte("Lebendiges Grünzeug", new Ressourcenkarte(0,0,0,3,0),"Hindernis"));          
    gegner.append(new Gegnerkarte("Eine sicher Sprengfallenfreie Truhe", new Ressourcenkarte(3,0,1,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Reizender Schleim", new Ressourcenkarte(0,0,1,0,1),"Monster"));
    gegner.append(new Gegnerkarte("Sir Fuzzy", new Ressourcenkarte(0,0,1,0,2),"Monster"));
    gegner.append(new Gegnerkarte("Ein langsam ladender Bildschirm", new Ressourcenkarte(0,1,1,0,1),"Hindernis"));               
    gegner.append(new Gegnerkarte("Eine Kriegerprinzessin", new Ressourcenkarte(1,0,0,0,1),"Person"));
    gegner.append(new Gegnerkarte("Ööööhhaa", new Ressourcenkarte(2,0,0,1,0),"Monster"));
    gegner.append(new Gegnerkarte("Ein Aufrechter Geist", new Ressourcenkarte(1,0,0,1,0),"Monster"));
    gegner.append(new Gegnerkarte("Genau 26 Ninjas", new Ressourcenkarte(0,0,2,1,0),"Person"));
    gegner.append(new Gegnerkarte("Der Karpaltunnel", new Ressourcenkarte(0,0,0,1,2),"Hindernis"));
    gegner.append(new Gegnerkarte("Eine lächerlich hohe Eiswand", new Ressourcenkarte(0,0,3,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Ein paar Stufen", new Ressourcenkarte(0,0,1,1,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Zwei Mann ein Bogen", new Ressourcenkarte(1,0,0,0,2),"Person"));
    gegner.append(new Gegnerkarte("Hai mit sexy Beinen", new Ressourcenkarte(0,1,0,0,2),"Monster"));
    gegner.append(new Gegnerkarte("Knappe Nedward", new Ressourcenkarte(2,0,0,0,1),"Person"));
    gegner.append(new Gegnerkarte("Barb-irrer", new Ressourcenkarte(1,2,0,0,0),"Person"));
    gegner.append(new Gegnerkarte("Typ mit massiven Schulterpanzer", new Ressourcenkarte(0,2,0,1,0),"Person"));
    gegner.append(new Gegnerkarte("Ein Ad-hoc-Völkerballturnier", new Ressourcenkarte(0,0,2,0,1),"Hindernis"));
    gegner.append(new Gegnerkarte("Zombietusse", new Ressourcenkarte(0,1,0,0,1),"Monster"));
    gegner.append(new Gegnerkarte("Ein Kaktus der dich umarmen will", new Ressourcenkarte(3,0,0,0,0),"Monster"));
    gegner.append(new Gegnerkarte("Treibsand", new Ressourcenkarte(1,0,2,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("7 Null-bock-Zwerge", new Ressourcenkarte(1,1,0,1,0),"Person"));
    gegner.append(new Gegnerkarte("Knuffiger Goblin", new Ressourcenkarte(0,1,1,0,0),"Monster"));
    gegner.append(new Gegnerkarte("Ein etwas unbequemer Stuhl", new Ressourcenkarte(1,1,1,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Eingestürzte Decke", new Ressourcenkarte(0,1,0,2,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Steve", new Ressourcenkarte(0,0,1,1,1),"Person"));
    gegner.append(new Gegnerkarte("Ein Armhändler", new Ressourcenkarte(0,0,0,1,1),"Person"));
    gegner.append(new Gegnerkarte("Ein Rosetta-Stein-Golem", new Ressourcenkarte(1,0,1,0,0),"Monster"));
    gegner.append(new Gegnerkarte("Eine “Abkürzung”", new Ressourcenkarte(2,1,0,0,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Gespickte Wand", new Ressourcenkarte(1,0,0,2,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Buchstäblich ein Strohmann", new Ressourcenkarte(0,1,1,1,0),"Hindernis"));
    gegner.append(new Gegnerkarte("William Duck I.", new Ressourcenkarte(1,0,1,1,0),"Monster"));
    gegner.append(new Gegnerkarte("Unsichtbare Wand", new Ressourcenkarte(0,0,0,2,0),"Hindernis"));
    gegner.append(new Gegnerkarte("Grozznak der Grosse", new Ressourcenkarte(1,0,1,0,1),"Person"));

  }
  /**
Gegner: 
##Name: Art: Schild, Schwert, Sprung, Schriftrolle, Pfeil


Ein überteuerter Händler, 2 Schriftrolle, 1 Sprung, Person 
Bodenloser Abgrund, 2 Sprung, Hindernis
Ein „Geist“ ja klar!, 2 Schwert, 1 Pfeil, Person
Ein Haufen schreiender Kinder, 1 Schwert, 1 Schild, 1 Pfeil, Person 
Ein Timberwolf, 2 Schwert, Monste
Lebendiges Grünzeug, 3 Schriftrolle, Hindernis
Eine sicher Sprengfallenfreie Truhe, 1 Sprung, 3 Schild, Hindernis
Reizender Schleim, 1 Sprung, 1 Pfeil, Monster
Sir Fuzzy, 1 Sprung, 2 Pfeil, Monster 
Ein langsam ladender Bildschirm, 1 Schwert, 1 Sprung, 1 Pfeil, Hindernis
Eine Kriegerprinzessin, 1 Schild, 1 Pfeil, Person
Ööööhhaa, 2 Schild, 1 Schriftrolle, Monster
Ein Aufrechter Geist, 1 Schriftrolle, 1 Schild, Monster
Genau 26 Ninjas, 1 Schriftrolle, 2 Sprung, Person 
Der Karpaltunnel, 1 Schriftrolle, 2 Pfeil, Hindernis
Eine lächerlich hohe Eiswand, 3 Sprung, Hindernis
Ein paar Stufen, 1 Schriftrolle, 1 Sprung, Hindernis
Zwei Mann ein Bogen, 2 Pfeil, 1 Schild, Person 
Hai mit sexy Beinen, 1 Schwert, 2 Pfeil, Monster
Knappe Nedward, 2 Schild, 1 Pfeil, Person 
Barb-irrer, 2 Schwert, 1 Schild, Person 
Typ mit massiven Schulterpanzer, 2 Schwert, 1 Schriftrolle, Person
Ein Ad-hoc-Völkerballturnier, 2 Sprung, 1 Pfeil, Hindernis
Zombietusse, 1 Schwert, 1 Pfeil, Monster 
Ein Kaktus der dich umarmen will, 3 Schild, Monster
Treibsand, 2 Sprung, 1 Schild, Hindernis 
7 Null-bock-Zwerge, 1 Schwert, 1 Schriftrolle, 1 Schild, Person
Knuffiger Goblin, 1 Schwert, 1 Sprung, Monster
Ein etwas unbequemer Stuhl, 1 Schwert, 1 Sprung, 1 Schild, Hindernis
Eingestürzte Decke, 1 Schwert, 2 Schriftrolle, Hindernis
Steve, 1 Schriftrolle, 1 Sprung, 1 Pfeil, Person
Ein Armhändler, 1 Schriftrolle, 1 Pfeil, Person 
Ein Rosetta-Stein-Golem, 1 Sprung, 1 Schild, Monster
Eine “Abkürzung”, 1 Schwert, 2 Schild, Hindernis 
Gespickte Wand, 2 Schriftrolle, 1 Schild, Hindernis 
Buchstäblich ein Strohmann, 1 Schwert, 1 Schriftrolle, 1 Sprung, Hindernis
William Duck I., 1 Schriftrolle, 1 Sprung, 1 Schild, Monster
Unsichtbare Wand, 2 Schriftrolle, Hindernis
Grozznak der Grosse , 1 Sprung, 1 Schild, 1 Pfeil, Person  
  
  */
                  
}
