/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_3_Car extends  Week5_3_Vehicle{
    private String typeEngine;
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void move(){
        if (getFuel() >= 50){
            setFuel(getFuel()-50);
            System.out.println("Move.");
        }else{
            System.out.println("Please add fuel.");
        }
    }
    public void setCarInfo(int s, String t, String y){
        setFuel(s);
        setTopSpeed(t);
        typeEngine = y;
    }
    public void showCarInfo(){
        System.out.println("Car engine is " + typeEngine + ".\n" +
        "Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " topSpeed m/s.");
    }
}
