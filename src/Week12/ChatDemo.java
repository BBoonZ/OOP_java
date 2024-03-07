/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author BBoonZ
 */
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {

    private JFrame frame;
    private JPanel p1;
    private JTextArea a;
    private JTextField f;
    private JButton b1, b2;
    private String text;

    //yak jing yak chip hai but i smart eiei :P ...
    public ChatDemo() {
        
        frame = new JFrame("ChatDemo");
        p1 = new JPanel(new FlowLayout());
        a = new JTextArea(20, 45);
        a.setEditable(false);
        f = new JTextField(45);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        frame.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        p1.add(a);
        p1.add(f);
        p1.add(b1);
        p1.add(b2);
        frame.add(p1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(520, 425);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            System.out.println("btn1");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now()) + " : " + f.getText());
            
            text = a.getText();
            a.setText(text + dtf.format(LocalDateTime.now()) + " : " + f.getText() + "\n");
            f.setText("");
            
        } else if (ae.getSource().equals(b2)) {
            System.out.println("btn2");
            a.setText("");
        }
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Open");
        File f = new File("datachat.dat");
        if (f.exists()){
            try (FileInputStream fin = new FileInputStream("datachat.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                System.out.println("Have File");
                a.setText("" + (String)in.readObject());
            } catch (IOException i){
                i.printStackTrace();
            } catch (ClassNotFoundException c){
                c.printStackTrace();
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Close");
        try (FileOutputStream fout = new FileOutputStream("datachat.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);){
                System.out.println("Save File");
                oout.writeObject(a.getText());
            } catch (IOException i){
                i.printStackTrace();
            } 
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
