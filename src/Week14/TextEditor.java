/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author BBoonZ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JMenuBar bar;
    private JMenu menu;
    private JMenuItem i1, i2, i3, i4;
    private JTextArea area;
    public TextEditor(){
        frame = new JFrame("Text Editor");
        panel = new JPanel();
        bar = new JMenuBar();
        menu = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Close");
        area = new JTextArea(20, 40);
        
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.addSeparator();
        menu.add(i4);
        bar.add(menu);
        panel.add(area);
        frame.add(panel);
        frame.setJMenuBar(bar);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
    }
    
    
    public static void main(String[] args) {
        new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(i1)){
            System.out.println("i1");
            area.setText("");
        }else if (e.getSource().equals(i2)){
            System.out.println("i2");
            
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fc);
            File f = fc.getSelectedFile();

        }else if (e.getSource().equals(i3)){
            System.out.println("i3");
            
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fc);
            File f = fc.getSelectedFile();
            
        }else if (e.getSource().equals(i4)){
            System.out.println("i4");
            System.exit(0);
        }
    }
}
