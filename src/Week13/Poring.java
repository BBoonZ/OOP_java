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
import java.util.logging.Level;
import java.util.logging.Logger;
public class Poring implements MouseListener, Runnable{
    private JFrame frame;
    private JPanel panel;
    private ImageIcon icon;
    public static int num;
    public Poring() {
        frame = new JFrame("Poring");
        panel = new JPanel();
        icon = new ImageIcon("E:\\VScode\\ProjectPSCP\\OOP_java\\src\\Week13\\p.png");
        
        panel.add(new JLabel(icon));
        panel.add(new JLabel("" + num));
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        panel.addMouseListener(this);
    }
    
//    public static void main(String[] args) {
//        new Poring();
//    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Visible..");
        frame.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void run() {
            
            var screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            int randomX = (int) (Math.random() * (screenWidth - frame.getWidth()));
            int randomY = (int) (Math.random() * (screenHeight - frame.getHeight()));

            // Set the frame's location to the random coordinates
            frame.setLocation(randomX, randomY);
            while (true){
                frame.setLocation(randomX+10, randomY);
                frame.setLocation(randomX, randomY);
                frame.setLocation(randomX-10, randomY);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Poring.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
}
