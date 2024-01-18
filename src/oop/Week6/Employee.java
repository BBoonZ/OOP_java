/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Week6;

/**
 *
 * @author BBoonZ
 */
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnery(){
        return energy;
    }
    public void setEnery(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public void eat(Food f){
        energy += f.getEnergy();
    }
    public boolean buyFood(Seller s){
        Food f1 = (s.sell(this));
        if (f1 != null){
            eat(f1);
            return true;
        }else{
            return false;
        }
    }
    
}
