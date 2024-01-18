/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Week6;

/**
 *
 * @author BBoonZ
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance() > Food.getPrice()){
            getWallet().setBalance(getWallet().getBalance()+Food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-Food.getPrice());
            return new Food();
        }else{
            System.out.println("Your money is no enough.");
            return null;
        }
    }
}
