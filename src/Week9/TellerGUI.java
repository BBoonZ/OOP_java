/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

/**
 *
 * @author BBoonZ
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    private JFrame frame;
    private JPanel p1, p2, p3, p4;
    private JTextField text1, text2;
    private JButton b1, b2, b3;
    private int Balance = 6000;
    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        

        p1.setLayout(new GridLayout(4, 1));

        p2.setLayout(new GridLayout(1, 2));
        text1 = new JTextField(Balance + "");
        text1.setEditable(false);
        p2.add(new JLabel("Balance"));
        p2.add(text1);

        text2 = new JTextField();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(new JLabel("Amount"));
        p3.add(text2);
        
        
        p4.add(b1);
        p4.add(b2);
        p4.add(b3);

        p1.add(p2);
        p1.add(p3);
        p1.add(p4);

        frame.add(p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)) {
            int n = Integer.parseInt(text2.getText());
            if (n <= Balance){
                Balance -= n;
                text1.setText(Balance + "");
            }
        }else if (e.getSource().equals(b2)) {
            int n = Integer.parseInt(text2.getText());
            Balance += n;
            text1.setText(Balance + "");
        }
    }
    
    public static void main(String[] args) {
        TellerGUI t = new TellerGUI();
    }

}
