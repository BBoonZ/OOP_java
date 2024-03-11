/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author BBoonZ
 */
public class Test3 {
    public static void main(String[] args) {
        Test2 t1 = new Test2("Thana");
        Test2 t2 = new Test2("Somchai");
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}
