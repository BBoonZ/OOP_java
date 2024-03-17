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
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookView implements ActionListener, WindowListener{
    private JFrame frame;
    private JPanel panelmain, panel, panel2, panel3;
    private JTextField name, price, number;
    private JButton add, update, del, pre, next;
    private JComboBox box;
    private ArrayList<Book> array = new ArrayList<>();
    public BookView(){
        frame = new JFrame();
        panelmain = new JPanel(new BorderLayout());
        

        // Gird
        panel = new JPanel(new GridLayout(3, 2));
        name = new JTextField();
        price = new JTextField();
        box = new JComboBox();
        box.addItem("General");
        box.addItem("Computer");
        box.addItem("Math&Sci");
        box.addItem("Photo");
        panel.add(new JLabel("Name")); panel.add(name);
        panel.add(new JLabel("Price")); panel.add(price);
        panel.add(new JLabel("Type")); panel.add(box);
        
        //next prev
        panel2 = new JPanel();
        pre = new JButton("<<<");
        next = new JButton(">>>");
        number = new JTextField("0");
        panel2.add(pre);
        panel2.add(number);
        panel2.add(next);
        
        //add update
        panel3 = new JPanel();
        add = new JButton("Add");
        update = new JButton("Update");
        del = new JButton("Delete");
        panel3.add(add);
        panel3.add(update);
        panel3.add(del);

        
        panelmain.add(panel, BorderLayout.NORTH);
        panelmain.add(panel2, BorderLayout.CENTER);
        panelmain.add(panel3, BorderLayout.SOUTH);
        frame.add(panelmain);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        //Event add, update, del, pre, next;
        add.addActionListener(this);
        update.addActionListener(this);
        del.addActionListener(this);
        pre.addActionListener(this);
        next.addActionListener(this);
        frame.addWindowListener(this);
    }
    
    public static void main(String[] args) {
        new BookView();
    }
    
    public void setBook(String name, double price, String type){
        array.add(new Book(name, price, type));
        System.out.println(name + " " + price + " " + type);
        reData(array.size() - 1);
        JOptionPane.showMessageDialog(panelmain, "Done it.", null, JOptionPane.PLAIN_MESSAGE);

    }
    
    public void updateBook(String name, double price, String type){
        int index = Integer.parseInt(number.getText());
        Book b = array.get(index);
        b.setName(name);
        b.setPrice(price);
        b.setType(type);
        array.set(index, b);
        reData(index);
        JOptionPane.showMessageDialog(panelmain, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void delBook(int index){
        array.remove(index);
        if (array.size() == 0){
            name.setText("");
            price.setText("");
            box.setSelectedItem("General");
        }else{
            reData(index-1);
        }
        JOptionPane.showMessageDialog(panelmain, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);

    }
    
    public void reData(int index){
        Book b = array.get(index);
        number.setText("" + index);
        name.setText(b.getName());
        price.setText(String.valueOf(b.getPrice()));
        box.setSelectedItem(b.getType());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource().equals(add)){
                new BookAdd(this);
            }else if (e.getSource().equals(update)){
                System.out.println("up");
                updateBook(name.getText(), Double.parseDouble(price.getText()), (String)box.getSelectedItem());
            }else if (e.getSource().equals(del)){
                System.out.println("del");
                delBook(Integer.parseInt(number.getText()));
            }else if (e.getSource().equals(pre)){
                reData(Integer.parseInt(number.getText()) - 1);
            }else if (e.getSource().equals(next)){
                reData(Integer.parseInt(number.getText()) + 1);
            }
        } catch (IndexOutOfBoundsException i){
            
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("OPEN");
        File f = new File("Book.data");
        System.out.println(array.size());
        if (f.exists()){
            try (FileInputStream fin = new FileInputStream("Book.data");
                ObjectInputStream oin = new ObjectInputStream(fin);){

                array = (ArrayList) oin.readObject();
                reData(array.size()-1);
            } catch(IOException i){

            } catch (ClassNotFoundException ex) {

            }
        }
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Close");
        try (FileOutputStream fout = new FileOutputStream("Book.data");
            ObjectOutputStream oout = new ObjectOutputStream(fout);){
            
            oout.writeObject(array);

        } catch(IOException i){
            
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
