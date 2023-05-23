package textgame;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import gegner.Gegnerkarte;
import helden.Held;
import helden.HeldenDeckFactory;
import helden.HeldenFactory;
import helden.Paladin;
import helden.Waldlaeufer;
import karten.Kartenstapel;
import karten.Ressourcenkarte;
import main.Dungeon;
import main.Spiel;
import main.Spieler;

public class TextgameTest {
    @Test
    public void test_Leeren_Spieler_Hinzufuegen() {

        Spiel spiel = Spiel.getInstance();
        Textgame tGame = new Textgame(spiel);
        Spieler sp = tGame.getSpieler();
        spiel.addSpieler(sp);
        assertEquals(0, sp.getNachziehstapel().getAnzahl());
    }

    @Test
    public void test_Kartenstapel_Heldendeck() {
        Kartenstapel kS = new Kartenstapel(HeldenDeckFactory.create("gruen"));
        assertEquals(30, kS.getAnzahl());
    }

    @Test
    public void test_Heldenerstellung() {
        Held h = HeldenFactory.gibHeld(1);
        assertEquals("Waldlaeufer", h.getHeldenname());
    }

    @Test
    public void test_HeldenDeck_Hinzufuegen() {
        Spiel spiel = Spiel.getInstance();
        Textgame tGame = new Textgame(spiel);
        Spieler sp = tGame.getSpieler();
        spiel.addSpieler(sp);
        Kartenstapel kS = new Kartenstapel(HeldenDeckFactory.create("gruen"));
        Held h = HeldenFactory.gibHeld(1);
        assertEquals(true, spiel.setHeld(sp, h));
        assertEquals(kS.getAnzahl(), sp.getNachziehstapel().getAnzahl());
    }

    @Test
    public void test_Ressourcenkarte() {
        Ressourcenkarte r1 = new Ressourcenkarte("gelb", 1, 1, 3, 3, 3);
        Gegnerkarte gK = new Gegnerkarte("Test", new Ressourcenkarte("gelb", 2, 1, 0, 0, 0), null);
        assertEquals(3, gK.getAktuelleRessourcen().getRohstoffSumme());
        gK.karteSpielen(r1);
        assertEquals(1, gK.getAktuelleRessourcen().getRohstoffSumme());
    }

    @Test
    public void test_Dungeon_KarteSpielen() {
        Dungeon d = new Dungeon();
        Gegnerkarte gK = d.getAktuelleGegner();
        Ressourcenkarte r1 = new Ressourcenkarte("gelb", 3, 3, 3, 3, 3);
        d.karteSpielen(r1);
        assert (!gK.equals(d.getAktuelleGegner()));
    }

    @Test
    public void test_Spiel_KarteSpielen() {
        Spiel spiel = Spiel.getInstance();
        Textgame tGame = new Textgame(spiel);
        spiel.addSpieler(tGame.getSpieler());
        spiel.setHeld(tGame.getSpieler(), HeldenFactory.gibHeld(1));
        Gegnerkarte gK_Vor = spiel.getDungeon().getAktuelleGegner();
        int rohstoffe_Vor = spiel.getDungeon().getAktuelleGegner().getAktuelleRessourcen().getRohstoffSumme();
        Ressourcenkarte r1 = new Ressourcenkarte("gelb", 0, 0, 0, 1, 1);
        spiel.karteSpielen(r1);
        int rohstoffe_Nach = spiel.getDungeon().getAktuelleGegner().getAktuelleRessourcen().getRohstoffSumme();
        assertEquals(rohstoffe_Vor - 2, rohstoffe_Nach);
        Ressourcenkarte r2 = new Ressourcenkarte("gelb", 0, 0, 0, 10, 1);
        spiel.karteSpielen(r2);
        Gegnerkarte gK_Nach = spiel.getDungeon().getAktuelleGegner();
        assert (!gK_Vor.equals(gK_Nach));
    }

    @Test
    public void test_Spiel_Spieler_KarteSpielen() {
        Spiel spiel = Spiel.getInstance();
        Textgame tGame = new Textgame(spiel);
        spiel.addSpieler(tGame.getSpieler());
        spiel.setHeld(tGame.getSpieler(), HeldenFactory.gibHeld(1));
        Gegnerkarte gK_Vor = spiel.getDungeon().getAktuelleGegner();
        Gegnerkarte gK_Nach = gK_Vor;
        int kAnzahl = 0;
        while (gK_Vor.equals(gK_Nach)) {
            spiel.karteSpielen(tGame.getSpieler(), 0);
            kAnzahl++;
            gK_Nach = spiel.getDungeon().getAktuelleGegner();
        }
        System.out.println(kAnzahl);
        assert (kAnzahl < 20);
    }
}
