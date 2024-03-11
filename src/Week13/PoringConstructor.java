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

public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JButton b1;
    public PoringConstructor(){
         frame = new JFrame("Virus101");
         panel = new JPanel();
         b1 = new JButton("Add");
         
         
         panel.add(b1);
         frame.add(panel);
         frame.setVisible(true);
         frame.pack();
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         b1.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new PoringConstructor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //for(int i=0;i<10;i++){
        new Poring();
        
        Poring.num += 1;
        //}
    }
}
