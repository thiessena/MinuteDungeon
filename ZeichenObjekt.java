/**
 * Die Klasse ZeichenObjekt dient als Basis für alle Objekte, die gezeichnet werden.
 * Sie verwaltet die Attribute: 
 *  - x,y und visible
 */
public class ZeichenObjekt {
    int x; 
    int y; 
    boolean visible; 

    public ZeichenObjekt(){
        x = 0; 
        y = 0; 
        visible = true;
    }

    public void draw(){
        
    }

    /**
     * Setzt die Position des Zeichenobjektes.
     * @param pX
     * @param pY
     */
    public void setPosition(int pX, int pY){
        x = pX; 
        y = pY;
    }

    public void setX(int pX){
        x = pX;
    }
    public void setY(int pY){
        y = pY;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
 


}
