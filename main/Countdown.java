package main;
import java.util.concurrent.TimeUnit;

import netzwerk.NetObject;

public class Countdown implements NetObject
{
    long startzeit;
    long pause;
    long pausenStart;
    boolean inPause;
    long laenge;
    long restlicheZeit;
    
    public Countdown(){
        inPause = false;
    }

    public void start(long pLaenge){
        reset();
         laenge = pLaenge;
        startzeit = System.currentTimeMillis();
    }
    
    public boolean ende(){
        if(startzeit + laenge + pause < System.currentTimeMillis()){
            return true;
        }else{
            return false;
        }
    }
    
    public void stopp(){
        pausenStart = System.currentTimeMillis();
        inPause = true;
    }
    
    public void weiter(){
        pause = pause + (System.currentTimeMillis() - pausenStart);
        inPause = false;
    }
    
    public void reset(){
        startzeit = 0;
        pause = 0;
        pausenStart = 0;
        laenge = 0;
    }
    
    public String umrechnen()
    {
            if(inPause == true)
            {
                restlicheZeit = (startzeit + laenge + System.currentTimeMillis() - pausenStart)-System.currentTimeMillis();
            }
            else
           {
                restlicheZeit = (startzeit + laenge + pause)-System.currentTimeMillis();
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(restlicheZeit);
            System.out.println(restlicheZeit + " Milliseconds = " + seconds + " Seconds");
            long minutes = TimeUnit.MILLISECONDS.toMinutes(restlicheZeit);
            System.out.println(restlicheZeit + " Milliseconds = " + minutes + " Minutes");
            if (seconds < 0)
            {
                return "00:00";
            }
        else
        {seconds = seconds - 60*minutes;
            return minutes + ":" + seconds;
        }
        
    }
    
    public void ausgabe(){
        System.out.println();
    }

    @Override
    public void fromNetString(String pNetString) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toNetString() {
        // TODO Auto-generated method stub
        return null;
    }
}
