/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_7_Accout {
    public double balance;
    public String name;
    public void deposit(double b){
        if (b >= 0){
            balance += b;
        }else{
            System.out.println("The balance variable must be greater than or qual to zero.");
        }
    }
    public double withdraw(double b){
        if (b <= balance && b >= 0){
            balance -= b;
            return balance;
        }else if (b < 0){
            System.out.println("The balance variable must be greater than or qual to zero.");
            return 0;
        }else{
            System.out.println("Your account balance is insufficient");
            return 0;
        }
    }
    public void showInfo(){
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
}
