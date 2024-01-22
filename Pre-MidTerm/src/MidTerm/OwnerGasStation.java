/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_64
 */
public class OwnerGasStation extends Person{
    public OwnerGasStation(){
        this(null, "");
        System.out.println("Instance OS1 is constructed.");
    }
    public OwnerGasStation(Wallet wallet, String name){
        super(wallet, name);
        System.out.println("Instance OS2 is constructed.");
    }
    public boolean chargePayment(Person c, Pay p, double amount){
        if (p.pay(c, this, amount)){
            return true;
        }else{
            return false;
        }
    }
    public double fueling(Person p, double amount){
        Vehicle v1 = (((Customer)p).getVehicle());
        if (v1 != null){
            double i = v1.fuelUp(amount)*30.5;
            System.out.println("Fueling Completed, " + amount + " Liters for " + i + " Baht.");
            return i;
        }else{
            return 0;
        } 
    }
}
