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
public class CalculatorTwoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
   
        p.add(new JTextField(), BorderLayout.NORTH);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 4));
        p2.add(new JButton("7"));
        p2.add(new JButton("8"));
        p2.add(new JButton("9"));
        p2.add(new JButton("+"));
        
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p2.add(new JButton("6"));
        p2.add(new JButton("-"));
        
        p2.add(new JButton("1"));
        p2.add(new JButton("2"));
        p2.add(new JButton("3"));
        p2.add(new JButton("*"));
        
        p2.add(new JButton("0"));
        p2.add(new JButton("c"));
        p2.add(new JButton("="));
        p2.add(new JButton("/"));
        
        p.add(p2);
        
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
