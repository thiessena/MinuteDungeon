package helden;
/**
 * Beschreiben Sie hier die Klasse Babar.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Babar
{

    /**
     * Konstruktor fÃ¼r Objekte der Klasse Babar
     * Faehigkeit: 3x Karten ablegen und besiege eine Person
     */
    public Babar()
    {
        /**
         * [3x public void karteRauslegen(Karte pKarte)] + set  gegnerTyp, person = 0;
         */
        List<Spieler> sListe = Spiel.getInstance().getSpieler();
        switch (pDE.name)   
            sListe.toFirst();
                   while(sListe.hasAccess()){
                        Spieler akt = sListe.getContent();
                        Handkarten hk = akt.getHandkarten();
                        for (int i = 0; i < 3; i++){
                            Karte k = hk.gibHandkarte((int)(Math.random() * hk.getAnzahl()));
                            akt.getAblagestapel().legeObenDrauf(k);
                        }
                        sListe.next();
                       /**
                       *wenn der Typ "Person" vorhanden ist soll er getötet werden
                       */
                       if (Gegenerkarte.getTyp()equalsto"Person"
                    }
    }

    
}
