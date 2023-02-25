package netzwerk;
import java.net.InetAddress;
import java.net.UnknownHostException;

import karten.List;

public class SpielServer extends Server{
    List<User> user; 
    public static int idNummer = 0;

    public SpielServer(int pPortNr) {
        super(pPortNr);
        user = new List<User>();
        try{
            InetAddress IP = InetAddress.getLocalHost();
            System.out.println("Serverläuft auf folgender IP (Port): " + IP.getHostAddress() + " (1337)" );
        }catch(UnknownHostException e){
            System.out.println("Der Host ist nicht bekannt.");
        }
    }

    /**
     * Verarbeitet eine neue Verbindung zu einem Client.
     */
    public void processNewConnection(String pIp, int pPort){
        neuerUser(pIp, pPort);
        send(pIp, pPort,"VERBINDUNG_ERFOLGREICH");
    }

    /**
     * Verarbeitet Nachrichten vom Client.
     */
    public void processMessage(String pIp, int pPort, String pMessage){
        User u = getUserByIp(pIp, pPort);
        String[] message = pMessage.split(NetTrennzeichen.BEFEHL_TRENNZEICHEN);
        switch(message[0]){
            case "LOGIN":
                int userId = Integer.parseInt(message[1]);
                User vorhadnenerUser = getUserById(userId); 
                if(vorhadnenerUser == null){
                    u.setUserId(++idNummer);
                    send(pIp, pPort, "LOGIN_ERFOLGREICH: " + idNummer);
                }
                send(pIp, pPort,"LOGIN_ERFOLGREICH");
            break;
        }
    }

    public static void main(String[] args){
        SpielServer sServer = new SpielServer(1337);
        
    }

    /**
     * Erstellt einen neuen User
     * @param pName
     * @return
     */
    public void neuerUser(String pIp, int pPort){
        user.append(new User(pIp, pPort));
    }
    /**
     * 
     * @param pName
     * @return
     */
    private User getUserByName(String pName){
        user.toFirst();
        while(user.hasAccess()){
            if(pName.equals(user.getContent().getName())){
                return user.getContent();
            }
        }
        return null;
    }

    /**
     * 
     * @param pIp
     * @param pPort
     * @return
     */
    private User getUserByIp(String pIp, int pPort){
        user.toFirst();
        while(user.hasAccess()){
            if(pIp.equals(user.getContent().getIp()) && user.getContent().getPort() == pPort){
                return user.getContent();
            }
        }
        return null;
    }

        /**
     * 
     * @param pName
     * @return
     */
    private User getUserById(int userId){
        user.toFirst();
        while(user.hasAccess()){
            if(userId == user.getContent().getUserId())){
                return user.getContent();
            }
        }
        return null;
    }
    
}
