/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.Week7;

/**
 *
 * @author BBoonZ
 */
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer() {
        this("", "", null);
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public void setFirstName(String firstName){ this.firstName = firstName;}
    public String getFirstName(){ return firstName;}
    public void setLastName(String lastName) { this.lastName = lastName;}
    public String getLastName() { return lastName;}
    public void setAcct(CheckingAccount acct) {this.acct = acct;}
    public CheckingAccount getAcct() { return acct;}
    @Override
    public String toString(){
        if (acct != null){
            return "The " + firstName + " account has " + acct.balance + " baht and " + acct.getCredit() + " credits.";
        }else{
            return firstName + " " + lastName + " doesn't have account.";
        }
    }
    public boolean equals(Customer c) {
        if (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName)){
            return true;
        }else{
            return false;
        }
    }
}
