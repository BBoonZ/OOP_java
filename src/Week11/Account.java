/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;


/**
 *
 * @author BBoonZ
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double a){
        if ( a > 0){
            balance += a;
            System.out.println(a + " baht is deposited to " + name + ".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double amount) throws WithdrawException{
        if ( amount < balance && amount > 0){
            balance -= amount;
            System.out.println(amount + " baht is withdrawn from " + name + ".");
        }else if (amount < 0){
            System.out.println("Input number must be a positive integer.");
        }else{
            throw new WithdrawException("Account Not enough money");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
}
