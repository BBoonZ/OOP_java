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
public class Week2_12 {
    public static void main(String[] args) {
        String name;
        int age, work, absent, body, salary=0, salary_bonus=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = input.nextLine();
        System.out.print("Please insert your age : ");
        age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        work = input.nextInt();
        System.out.print("Please insert number of absent days ; ");
        absent = input.nextInt();
        System.out.print("Please insert your body weight : ");
        body = input.nextInt();
        
        if ((age >= 21) && (age <= 30)){
            salary = ((work * 300) - (absent * 50));
        }else if ((age >= 31) && (age <= 40)){
            salary = (work * 500) - (absent * 50);
        }else if ((age >= 41) && (age <= 50)){
            salary = (work * 1000) - (absent * 25);
        }else if ((age >= 51) && (age <= 60)){
            salary = (work * 3000);
        }
        
        if ((body >= 10) && (body <= 60)){
            salary_bonus = salary + 5000;
        }else if ((body >= 61) && (body <= 90)){
            salary_bonus = salary + 5000 - ((body-60)*10);
        }
        
        
        System.out.println("Hi, " + name);
        System.out.println("Your Salary is " + salary + " Baht");
        System.out.println("Your Salary and bonus is " + salary_bonus);
    }
}
