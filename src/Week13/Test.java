/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author BBoonZ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//public class Test {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Custom Window Closing");
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Stop default behavior
//
//        // Add a window listener to handle window closing events
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
//                if (result == JOptionPane.YES_OPTION) {
//                    // If the user confirms, then exit
//                    System.exit(0);
//                }
//            }
//        });
//
//        // Add some content to the frame
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//}
public class Test {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shaking JFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null); // Center the frame

            JButton shakeButton = new JButton("Shake");
            shakeButton.addActionListener(e -> shakeFrame(frame));

            frame.getContentPane().add(shakeButton, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }

    private static void shakeFrame(JFrame frame) {
        int originalX = frame.getX();
        int originalY = frame.getY();

        Timer timer = new Timer(500, null);
        timer.addActionListener(new ActionListener() {
            int count = 0;
            int SHAKE_DISTANCE = 5;

            public void actionPerformed(ActionEvent e) {
                if (count % 2 == 0) {
                    frame.setLocation(originalX + SHAKE_DISTANCE, originalY);
                } else {
                    frame.setLocation(originalX - SHAKE_DISTANCE, originalY);
                }
                
                System.out.println(count);
                if (count >= 10) {
                    frame.setLocation(originalX, originalY);
                    ((Timer) e.getSource()).stop();
                }

                count++;
            }
        });
        timer.start();
    }
}
