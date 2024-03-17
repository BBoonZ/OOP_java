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
public class BookAdd implements ActionListener{
    private JFrame frame;
    private JPanel panelmain, panel, panel2;
    private JTextField name, price;
    private JButton insert;
    private JComboBox box;
    private BookView b;
    
    public BookAdd(BookView b){
        this.b = b;
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
        
        //insert
        panel2 = new JPanel();
        insert = new JButton("insert");
        panel2.add(insert);
        
        panelmain.add(panel, BorderLayout.NORTH);
        panelmain.add(panel2, BorderLayout.CENTER);
        frame.add(panelmain);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        //Event
        insert.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.setBook(name.getText(), Double.parseDouble(price.getText()), (String)box.getSelectedItem());
        frame.dispose();
    }
}
