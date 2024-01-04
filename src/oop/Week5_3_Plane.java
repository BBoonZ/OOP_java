/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_3_Plane extends Week5_3_Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " topSpeed m/s.");
    }
    public void setPlaneInfo(int s, String t){
        setFuel(s);
        setTopSpeed(t);
    }
    public void fly(){
        if (getFuel() >= 200){
            setFuel(getFuel()-200);
            System.out.println("Fly.");
        }else{
            System.out.println("Please add fuel.");
        }
    }
}
