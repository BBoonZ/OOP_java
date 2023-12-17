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
public class Week3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = input.nextInt();
        for (int i=1; i<=number; i++){
            if (i%5 == 0){
                System.out.print("/");
            }else{
                System.out.print("|");
            }
        }
    }
}
