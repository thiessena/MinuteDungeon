public class Dungeon
{
    
    private Kartenstapel gegenerkartenstappel;
    
    /**
     * Konstruktor für Objekte der Klasse Dungeon
     */
    public Dungeon(Kartenstapel pGegenerkartenstappel)
    {
        gegenerkartenstappel = pGegenerkartenstappel;
        
    }
    
    public void nächsteKarte(){
        //prüfenObNochKartenDaSind wenn ja dann Karte von oben aus dem Gegenerkartestappel aufdecken 
    }
    
    public void kämpfen(){
        //Recurcen vom gegener zeigen und die die schon im Array sind 
        //get Recurcen welche der Gegener braucht um besiet werden muss und array machen wo der Spieler seine recucen rein machen kann
        //Nur Recurcen rein lassen die überein stimmen wenn alle da sind dann Karte weglegen
    }
    
    public void kartenWeglegen(){
        //besiegte Karte wegglegen und die da zugehörigen Reurcen u. Array und dann prüfen ob noch karten da sind 
    }
    
    public void prüfenObNochKartenDaSind(){
        //wenn nicht dann haben die Spieler gewonnen sonst nächste Karte
    }
}
