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
public class Week3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even=0, odd=0;
        while (true){
            int number = input.nextInt();
            if (number == -1){
                break;
            }
            if (number % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
