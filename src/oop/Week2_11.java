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
public class Week2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Your money : ");
        int money = input.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        input.nextLine(); // i don't know wat is this 
        
        String type = input.nextLine();  // use char type = input.netx().charAt(0);
        
        //switch help shorter
        if (type.equals("A")){
            money += money*.015;
        }else if (type.equals("B")){
            money += money*0.02;
        }else if (type.equals("C")){
            money += money*.015;
        }else if (type.equals("X")){
            money += money*.05;
        }System.out.println("Your total money in one year = " + money);
    }
}
