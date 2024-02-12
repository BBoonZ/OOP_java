/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

/**
 *
 * @author BBoonZ
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 1));
        
        p.add(new JTextField());
        p.add(new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(new JButton("+"));
        p2.add(new JButton("-"));
        p2.add(new JButton("*"));
        p2.add(new JButton("/"));
        p.add(p2);
        
        //p.add(new JTextField());
        
        f.add(p);
        f.pack();
        f.setVisible(true);
    }    
}
