package helden;

import netzwerk.NetObject;

public class Held implements NetObject
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String heldenname;
    private String faehigkeitname;
    

    /**
     * Konstruktor für Objekte der Klasse Held
     */
    public Held()
    {
        // Instanzvariable initialisieren
        
    }


     
    public void faehigkeit()
    {
        //Eiese Methode soll den Spieler weiterleiten, damit wir uns einfach über die
        //haufen verschiedener Helden zugriff
        
    }


    public String getHeldenname() {
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
