package helden;

import main.Spieler;
import netzwerk.NetObject;

public class Held implements NetObject {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected String heldenname;
    protected String faehigkeitname;
    protected Spieler spieler;
    protected String farbe;

    public Held() {

    }

    /**
     * Konstruktor für Objekte der Klasse Held
     */
    public Held(String pHeldenname, String pFarbe) {
        heldenname = pHeldenname;
        farbe = pFarbe;
    }

    /**
     * Wird vom konkreten Helden uberschrieben.
     */
    public void nutzefaehigkeit() {

    }

    public void setSpieler(Spieler pSpieler) {
        spieler = pSpieler;
    }

    public String getHeldenname() {
        return heldenname;
    }

    public String getFarbe(){
        return farbe; 
    }

    public String toString() {
        return heldenname;
    }

    @Override
    public void fromNetString(String pNetString) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toNetString() {
        // TODO Auto-generated method stub
        return null;
    }
}
