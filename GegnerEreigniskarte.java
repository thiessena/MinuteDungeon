public class GegnerEreigniskarte extends Ereigniskarte
{
    private String gegnertyp;

    public GegnerEreigniskarte(String farbe, String Name, String Beschreiung)
    {

    }

    public void beseitigen(){

        if(gegnertyp.equals(Gegnerkarte.getTyp())){
            System.out.println("Gegner beseitigt!")
        }
        else{
            System.put.println("Gegner kann mit der Ereigniskarte nicht beseitigt werden!")
        }
        }
    }
}
