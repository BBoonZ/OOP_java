/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author BBoonZ
 */
public class Main {
    public static void main(String[] args) {
        CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
        Customer cust = new Customer("Sompong", "Sookjai", acct1);
        try{
            cust.getAcct().deposit(500);
            cust.getAcct().withdraw(1800);
            cust.getAcct().withdraw(300);
            cust.getAcct().deposit(1000);
            cust.getAcct().withdraw(200);
        }
        catch(WithdrawException e){
            System.out.println("WithdrawException: Account "+cust.getAcct().getName()+" has not enough money!");
        }
        finally{
            System.out.println("Thank you.");
        }

    }
}
