/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_4_Fraction_main {
    public static void main(String[] args) {
        Week4_4_Fraction f1 = new Week4_4_Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Week4_4_Fraction f2 = new Week4_4_Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
        
        
        System.out.println("-----------------------------");
        Week4_4_Fraction f3 = new Week4_4_Fraction();
        f3.topN = 1;
        f3.btmN = 3;
        Week4_4_Fraction f4 = new Week4_4_Fraction();
        f4.topN = 4;
        f4.btmN = 16;
        Week4_4_Fraction f5 = new Week4_4_Fraction();
        f5.topN = 5;
        f5.btmN = 15;
        
        System.out.println(f3.toFloat());
        System.out.println(f4.toFloat());
        System.out.println(f5.toFloat());
        
        System.out.println("f1 is equal to f2 >> " + f3.myEquals(f4));
        System.out.println("f1 is equal to f3 >> " + f3.myEquals(f5));
        
        System.out.println("Before : " + f4.toFraction());
        f4.LowestTermFrac();
        System.out.println("After : " + f4.toFraction());
    }
    /*public void Week4_5(){
        Week4_4_Fraction f1 = new Week4_4_Fraction();
        f1.topN = 1;
        f1.btmN = 3;
        Week4_4_Fraction f2 = new Week4_4_Fraction();
        f2.topN = 4;
        f2.btmN = 16;
        Week4_4_Fraction f3 = new Week4_4_Fraction();
        f2.topN = 5;
        f2.btmN = 15;
        
        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());
        
    }*/
}
