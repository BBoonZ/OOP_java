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

    private String sec = "0";
    private String min = "0";
    private String hour = "0";
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

                sec = time % 60 + "";
                min = time / 60 + "";
                hour = time / 3600 + "";
                
                System.out.println(sec);
                System.out.println(min);
                System.out.println(hour);
                
                
                if (Integer.parseInt(sec) < 10){
                    sec = "0" + sec;
                }if (Integer.parseInt(min) < 10){
                    min = "0" + min;
                }if (Integer.parseInt(hour) < 10){
                    hour = "0" + hour;
                }

                setFont(new Font("Verdana", Font.PLAIN, 102));
                setText(hour + ":" + min + ":" + sec);
//                setText("" + time);
                
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
