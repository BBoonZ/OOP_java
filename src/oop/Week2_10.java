/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
import java.util.*;
public class Week2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        if (money > 50000){
            System.out.println(money*0.1);
        }else{
            System.out.println(money*0.05);
        }
    }
}
