/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_6_Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    public void printDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("yearPublished : " + yearPublished);
        System.out.println("Price : $" + price);
        System.out.println("Availble : " + isAvailable);
    }
    public void updatePrice(double newPrice){
        price = newPrice;
    }
    public void markAsUnavaible(){
        isAvailable = false;
    }
    public void markAsAvailabale(){
        isAvailable = true;
    }
    public boolean isPublishedAfter(int year){
        return (year < yearPublished);
    }
}
