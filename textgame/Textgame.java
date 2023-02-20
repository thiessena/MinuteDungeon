package textgame;
import karten.*;
import main.*;

import java.util.Scanner;

public class Textgame implements View{
    Spiel spiel = Spiel.getInstance();
    Scanner input; 

    public Textgame(){
        input = new Scanner(System.in);
    }

    public void loop(){
        boolean ende = false;
        while(!ende){
            String eingabe = input.nextLine();

        }
    }


    public static void main(String[] args){
        Textgame t = new Textgame(); 
        
    }
    /**
     * 
     */
    @Override
    public void zeigeHeldenAuswahl() {
        System.out.println("Wähle einen Helden aus:")
        
    }

    @Override
    public void zeigeLevelAuswahl() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeDungeon(Dungeon pDungen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeTimer(Countdown pCountdown) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void zeigeSpieler(Spieler pSpieler) {
        // TODO Auto-generated method stub
        
    }
}
