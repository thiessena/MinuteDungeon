package helden;

import org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import karten.Kartenstapel;

public class HeldenDeckFactoryTest {

    @Test
    public void test() {
        Kartenstapel deck = new Kartenstapel(HeldenDeckFactory.create("rot"));
        assertEquals(38, deck.getAnzahl());
        deck = new Kartenstapel(HeldenDeckFactory.create("lila"));
        // assertEquals(40, deck.getAnzahl());

    }
}
