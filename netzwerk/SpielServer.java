package netzwerk;
import karten.List;

public class SpielServer extends Server{

    List<User> user; 

    public SpielServer(int pPortNr) {
        super(pPortNr);
        user = new List<User>();
    }

    public void processNewConnection(String pIp, int pPort){
        User u = getUserByIp(pIp, pPort);
        if(u != null){
            
        }
    }

    public void processMessage(String pIp, int pPort, String pMessage){
        User u = getUserByIp(pIp, pPort);
        String[] message = pMessage.split(":");
        switch(message[0]){
            case "": 
            break;
        }
    }




    /**
     * Erstellt einen neuen User
     * @param pName
     * @return
     */
    public void neuerUser(String pIp, int pPort){

    }
    /**
     * 
     * @param pName
     * @return
     */
    private User getUserByName(String pName){
        User u; 
        return u;
    }

    /**
     * 
     * @param pIp
     * @param pPort
     * @return
     */
    private User getUserByIp(String pIp, int pPort){
        User u;
        return u;
    }
    
}
