package helden;

public class Zauberin extends Held {

    /**
     * Konstruktor fÃƒÂ¼r Objekte der Klasse ZauberinMagier
     * Faehigekeit: 3x Karten ablegen und ÃƒÂ¼berwinde ein Hindernis
     */

    public Zauberin() {
        super("Zauberin", "blau");
        /**
         * 3x public void karteHinzufuegen + set gegnerTyp hindernis = 0;
         * 
         * Konzept
         * 
         * getSliste.getGegenerkarte.getTyp
         * if(getTyp == "Hindernis" ){
         * setRescourcen == 0;
         * }
         * else
         * system.out.println ("Kannst deine Fähigkeit nicht bei diesem Typ anwenden")
         *
         */
    }

}
