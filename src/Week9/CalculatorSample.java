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
public class CalculatorSample implements ActionListener {
    private JFrame frame;
    private JPanel p, p2;
    private JTextField t;
    private String num = "", check = "";
    private double prev;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bc, b10, b11, b12, b13, b14;
    public CalculatorSample() {
        frame = new JFrame();
        t = new JTextField(num);
        p = new JPanel();
        p.setLayout(new BorderLayout());
   
        p.add(t, BorderLayout.NORTH);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 4));
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bc = new JButton("c");
        b10 = new JButton("+");
        b11 = new JButton("-");
        b12 = new JButton("*");
        b13 = new JButton("/");
        b14 = new JButton("=");
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bc.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        
        
        
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b11);
        
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b12);
        
        p2.add(b0);
        p2.add(bc);
        p2.add(b14);
        p2.add(b13);
        
        p.add(p2);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(p);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b0)){
            System.out.println("b0");
            num += "0";
            t.setText(num);
        }else if (e.getSource().equals(b1)){
            System.out.println("b1");
            num += "1";
            t.setText(num);
        }else if (e.getSource().equals(b2)){
            System.out.println("b2");
            num += "2";
            t.setText(num);
        }else if (e.getSource().equals(b3)){
            System.out.println("b3");
            num += "3";
            t.setText(num);
        }else if (e.getSource().equals(b4)){
            System.out.println("b4");
            num += "4";
            t.setText(num);
        }else if (e.getSource().equals(b5)){
            System.out.println("b5");
            num += "5";
            t.setText(num);
        }else if (e.getSource().equals(b6)){
            System.out.println("b6");
            num += "6";
            t.setText(num);
        }else if (e.getSource().equals(b7)){
            System.out.println("b7");
            num += "7";
            t.setText(num);
        }else if (e.getSource().equals(b8)){
            System.out.println("b8");
            num += "8";
            t.setText(num);
        }else if (e.getSource().equals(b9)){
            System.out.println("b9");
            num += "9";
            t.setText(num);
        }else if (e.getSource().equals(bc)){
            System.out.println("bc");
            num = "";
            t.setText(num);
        }else if (e.getSource().equals(b10)){
            System.out.println("+");
            prev = Double.parseDouble(num);
            check = "+";
            num = "";
            t.setText(num);
        }else if (e.getSource().equals(b11)){
            System.out.println("-");
            prev = Double.parseDouble(num);
            check = "-";
            num = "";
            t.setText(num);
        }
        else if (e.getSource().equals(b12)){
            System.out.println("*");
            prev = Double.parseDouble(num);
            check = "*";
            num = "";
            t.setText(num);
        }
        else if (e.getSource().equals(b13)){
            System.out.println("/");
            prev = Double.parseDouble(num);
            check = "/";
            num = "";
            t.setText(num);
        }else if (e.getSource().equals(b14)){
            System.out.println("=");
            Double sum = Double.parseDouble(num);
            if (check.equals("+")){
                t.setText(prev + sum + "");
                num = prev + sum + "";
            }else if (check.equals("-")){
                t.setText(prev - sum + "");
                num = prev - sum + "";
            }else if (check.equals("*")){
                t.setText(prev * sum + "");
                num = prev * sum + "";
            }else if (check.equals("/")){
                t.setText(prev / sum + "");
                num = prev / sum + "";
            }
        }
    }
    
    public static void main(String[] args) {
        CalculatorSample c = new CalculatorSample();
    }

    
}
