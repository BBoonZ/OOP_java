/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author BBoonZ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private MyClock clock;
    private JButton b1, b2;
    private Thread t;
    public MyFrame(){
        frame = new JFrame("Clock");
        clock = new MyClock();
        t = new Thread(clock);
        panel = new JPanel();
        b1 = new JButton("Wait");
        b2 = new JButton("Notify");
        
        t.start();
        panel.add(clock);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)){
            System.out.println("b1");
            clock.pauseThread();
        }else{
            System.out.println("b2");
            clock.resumeThread();
        }
    }
}
