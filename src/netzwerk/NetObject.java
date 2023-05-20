package netzwerk;

/**
 * Für alle Netzwerk-Klassen werden die zwei Methoden fromNetString und toNetString benötigt. 
 * Hierdurch stellt jede Klasse sicher, dass sie über das Netzwerk verschickt werden kann. 
 */
public interface NetObject{
    public void fromNetString(String pNetString); 
    public String toNetString();
}