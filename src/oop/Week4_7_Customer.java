/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_7_Customer {
    public String name;
    public Week4_6_MyDate DOB;
    public Week4_7_Accout acct;
    public static void main(String[] args) {
        Week4_7_Customer c = new Week4_7_Customer();
        c.name = "Taravichet";
        
        Week4_6_MyDate dob = new Week4_6_MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;
        
        Week4_7_Accout acc = new Week4_7_Accout();
        acc.name = c.name;
        acc.balance = 500;
        
        c.DOB = dob;
        c.acct = acc;
        
        System.out.println("My name is " + c.name + ".");
       
        c.acct.showInfo();
        c.DOB.showDate();
        
        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
    }
}
