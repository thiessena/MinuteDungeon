package helden;
import karten.*;
import main.Spieler;

/**
 * Beschreiben Sie hier die Klasse Dieb.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Dieb extends Held
{
   
    /**
     * Konstruktor fÃ¼r Objekte der Klasse Dieb
     * Faehigkeit: 3x karten ablegenen und dafuer 5 Karten ziehen.
     */
    public Dieb()
    {
      
    }

    /**
     * Die Faehigkeit des Diebes. Er kann für drei abgelegte Karten 5 Karten nachziehen.
     * 
     */
    @Override
    public void nutzefaehigkeit(){
        //holt sich die obersten fünf Karten vom Ablagestapel. 
        //Haengt die Kartenliste an die Handkarten an.
    }

 
}
