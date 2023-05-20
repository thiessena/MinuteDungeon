package test;

import helden.Held;
import helden.HeldenDeckFactory;
import helden.HeldenFactory;
import karten.Handkarten;
import main.*;

public class TestSinglePlayer {

    public static void main(String[] args) {
        Spieler s = new Spieler();
        Spiel spiel = Spiel.getInstance();
        Held h = HeldenFactory.gibHeld(7);
        System.out.println("Heldenfarbe: " + h.getFarbe());
        Handkarten hK = new Handkarten(HeldenDeckFactory.create("gelb"));
        spiel.addSpieler(s);
        System.out.println(spiel.setHeld(s, h));
        // System.out.println(s.toString());
    }

}
