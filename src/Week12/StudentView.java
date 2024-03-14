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
import java.awt.event.*;
import javax.swing.*;

public class StudentView implements ActionListener, WindowListener, WindowFocusListener {

    private JFrame frame;
    private JPanel panel;
    private JTextField t1, t2, t3;
    private JButton b1, b2;
    private Student s;

    public StudentView() {
        s = new Student();
        frame = new JFrame("StudentView");
        panel = new JPanel(new GridLayout(4, 2));
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");

        frame.addWindowFocusListener(this);
        frame.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        panel.add(new JLabel("ID:"));
        panel.add(t1);
        panel.add(new JLabel("Name:"));
        panel.add(t2);
        panel.add(new JLabel("Money:"));
        panel.add(t3);
        panel.add(b1);
        panel.add(b2);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 150);
    }

    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b1)) {
            System.out.println("b1");
            s.setID(Integer.parseInt(t1.getText()));
            s.setName(t2.getText());
            s.setMoney(s.getMoney() + 100);
            t3.setText("" + s.getMoney());

        } else if (e.getSource().equals(b2)) {
            System.out.println("b2");
            s.setMoney(s.getMoney() - 100);
            t3.setText("" + s.getMoney());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Open");
        File file = new File("StudentM.dat");
        if (file.exists()) {
            try (FileInputStream fin = new FileInputStream("StudentM.dat"); ObjectInputStream oin = new ObjectInputStream(fin);) {

                s = (Student) oin.readObject();
                t1.setText("" + s.getID());
                t2.setText("" + s.getName());
                t3.setText("" + s.getMoney());
            } catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            } catch (NullPointerException n) {
                n.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); ObjectOutputStream oout = new ObjectOutputStream(fout)) {

            oout.writeObject(s);
            System.out.println("Close");
        } catch (IOException i) {
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

    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println("On Focus");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("Out Focus");
    }
}
