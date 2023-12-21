/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_3_Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade() {
        double s = ((mScore*0.4) + (fScore*0.4) + 20);
        if (s >= 80){
            System.out.println("Your grade: A.");
        }else if (s >= 70){
            System.out.println("Your grade: B.");
        }else if (s >= 60){
            System.out.println("Your grade: C.");
        }else if (s >= 50){
            System.out.println("Your grade: D.");
        }else{
            System.out.println("Your grade: F.");
        }
    }
}
