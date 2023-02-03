public class Karte{
    private int x ;
    private int y;
    private boolean verdeckt;
    private String farbe;
 
    public Karte(){
        verdeckt = false;
        farbe = "";
    }
 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
 
    public void setX(int pX){
        x = pX;
    }
    public void setY(int pY){
        y = pY;
    }
}
