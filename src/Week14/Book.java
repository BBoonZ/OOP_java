/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.io.Serializable;

/**
 *
 * @author BBoonZ
 */
public class Book implements Serializable{
    private String name;
    private double price;
    private String type;
    public Book(){
        this("", 0, "");
    }
    public Book(String name, double price, String type){
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
}
