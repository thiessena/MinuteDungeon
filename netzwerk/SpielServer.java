package netzwerk;
import java.net.InetAddress;
import java.net.UnknownHostException;

import helden.HeldenFactory;
import helden.Held;
import karten.List;
import main.*;

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
        String[] message = pMessage.split(NetTrennzeichen.BEFEHL_TRENNZEICHEN);
        switch(message[0]){
            case "LOGIN": userEinloggen(message[1], pIp, pPort); break;
            case "LEVEL": 
                int level = Spiel.getInstance().getDungeon().getLevel();
                if(level < 1){
                    send(pIp, pPort,"LEVEL_FEHLT:"); break;
                }else{
                    send(pIp, pPort, "LEVEL_EINGELOGGT:"+level);
                }
            break;    
            case "LEVEL_AUSWAHL": levelAuswaehlen(message[1], pIp, pPort); break; 
            case "HELDEN_AUSWAHL": heldenAuswaehlen(message[1], pIp, pPort); break;

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
     * Die UserId für den Nutzer wird festgelegt. Und ein neuer Spieler wird zum Spiel hinzugefügt.
     * @param userIdString
     * @param pIp
     * @param pPort
     */
    private void userEinloggen(String userIdString, String pIp, int pPort){
        int userId = -1;
        try{
           userId = Integer.parseInt(userIdString);
        }catch(NumberFormatException nE){
            System.out.println("Falsche Id eingegeben.");
            send(pIp, pPort, "ERROR: Falsche Id - Bitte Zahl eingeben.");
            return ; //Abbruch der Methode
        }
         
        User aktUser = null;
        User vorhandenerUser = getUserById(userId); 
        if(vorhandenerUser == null){
            aktUser = getUserByIp(pIp, pPort);
            aktUser.setUserId(++idNummer); //Der neue User erhält eine id.
        }else{
            getUserByIp(pIp, pPort); //Zum wahrscheinlich neu erstellten User gehen.
            user.remove(); // neu erstellten User löschen.
            aktUser = vorhandenerUser;
        }
        //Spieler erstellen.
        boolean spielerErstellt = Spiel.getInstance().addSpieler(new Spieler(
                                    aktUser.getUserId(),null, null));
        if(spielerErstellt){
            send(pIp, pPort, "LOGIN_ERFOLGREICH: " + idNummer);
        }else{
            send(pIp, pPort,"ERROR: Keine freien Plätze im Spiel.");
        }
    }

    /**
     * Legt das Level für den Dungeon fest.
     * @param pLevelString
     * @param pIp
     * @param pPort
     */
    public void levelAuswaehlen(String pLevelString, String pIp, int pPort){
        int level = 1;
        try{
            level = Integer.parseInt(pLevelString);
        }catch(NumberFormatException nE){System.out.println("Falsche Levelnummer");}
        
        Spiel.getInstance().getDungeon().setLevel(level);
        send(pIp, pPort, "LEVEL_EINGELOGGT:"+level);
    }

    
    public void heldenAuswaehlen(String pHeldenString, String pIp, int pPort){
        try{
            int heldenNummer = Integer.parseInt(pHeldenString);
            Held h = HeldenFactory.gibHeld(heldenNummer);
            getUserByIp(pIp, pPort)
                .getSpieler()
                .setHeld(h);
            send(pIp, pPort, "HELD_EINGELOGGT:"+h.getHeldenname());
        }catch(NumberFormatException nE){System.out.println("Falsche Heldennummer");}
        
        
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
            user.next();
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
            user.next();
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
            if(userId == user.getContent().getUserId()){
                return user.getContent();
            }
            user.next();
        }
        return null;
    }
    
}
