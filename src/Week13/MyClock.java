/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author BBoonZ
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClock extends JLabel implements Runnable{

//    private int sec;
//    private int min;
//    private int hour;
    private int time;
    private boolean paused;
    
    public synchronized void checkThread(){
        while (paused){
            try{
                this.wait();
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void pauseThread(){
        paused = true;
    }
    
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    }
    
    @Override
    public void run() {
        while (true){
            try {
//                Calendar d = Calendar.getInstance();
//                int sec = d.get(Calendar.SECOND);
//                int min = d.get(Calendar.MINUTE);
//                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.checkThread();
                time += 1;

                

                setFont(new Font("Verdana", Font.PLAIN, 102));
//                setText(hour + ":" + min + ":" + sec);
                setText("" + time);
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
