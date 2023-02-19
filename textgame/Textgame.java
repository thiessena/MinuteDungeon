package textgame;
import karten.*;
import main.*;

import java.util.Scanner;

public class Textgame {
    Spiel spiel = Spiel.getInstance();
    Scanner input; 

    public Textgame(){
        input = new Scanner(System.in);
    }

    public void loop(){
        while(!ende){
            String eingabe = input.nextLine();

        }
    }


    public static void main(String[] args){
        Textgame t = new Textgame(); 
        
    }
}
