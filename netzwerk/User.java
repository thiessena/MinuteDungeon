package netzwerk;
import main.Spieler;

public class User {
    private String ip;
    private int port; 
    private Spieler spieler;
    private int userId;


    private String name;

        
    /**
     * Erstellt einen User, der einen Spieler besitzt. 
     * Sobald ein User einen Spieler ausgewählt hat, kann er am Dungeonspiel teilnehmen.
     * @param pIp
     * @param pPort
     */
    public User(String pIp, int pPort){
        ip = pIp; 
        port = pPort;
    }


    /**
     * Erstellt einen User, der einen Spieler besitzt. 
     * Sobald ein User einen Spieler ausgewählt hat, kann er am Dungeonspiel teilnehmen.
     * @param pIp
     * @param pPort
     */
    public User(String pIp, int pPort,int pUserId){
        ip = pIp; 
        port = pPort;
        userId = pUserId;
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
        this.spieler.setUserId(userId);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public String getIp(){
        return ip;
    }
}
