/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

import Week10.*;
import oop.Week7.*;

/**
 *
 * @author BBoonZ
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double amount) throws WithdrawException{
        if (balance - amount >= 0){
            balance -= amount;
            System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        }else if (balance - amount + credit >= 0){
            credit = balance + credit - amount;
            balance = 0;
            System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        }else if (balance - amount + credit < 0){
            throw new WithdrawException("Account Not enough money");
        }
    }
    
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
