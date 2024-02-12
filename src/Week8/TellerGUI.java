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
public class TellerGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teller GUI");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        
        p1.setLayout(new GridLayout(4, 1));

        p2.setLayout(new GridLayout(1, 2));
        JTextField text1 = new JTextField("6000");
        text1.setEditable(false);
        p2.add(new JLabel("Balance"));   p2.add(text1);
        
        p3.setLayout(new GridLayout(1, 2));
        p3.add(new JLabel("Amount"));   p3.add(new JTextField());
        
        p4.add(new JButton("Deposit"));
        p4.add(new JButton("Withdraw"));
        p4.add(new JButton("Exit"));
        
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        
        frame.add(p1);
        frame.pack();
        frame.setVisible(true);
        
    }
}
