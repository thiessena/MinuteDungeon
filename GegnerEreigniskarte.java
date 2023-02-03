public class GegnerEreigniskarte extends Ereigniskarte
{
    private String gegnertyp;

    public GegnerEreigniskarte(String pName, String pBeschreiung){
        super(pName, pBeschreiung);
    }

    public void beseitigen(Gegnerkarte gK){
        if(gegnertyp.equals(gK.getTyp())){
            System.out.println("Gegner beseitigt!");
        }
        else{
            System.out.println("Gegner kann mit der Ereigniskarte nicht beseitigt werden!");
        }
    }
}
