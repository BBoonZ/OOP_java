/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_6_Book_main {
    public static void main(String[] args) {
        Week4_6_Book book1 = new Week4_6_Book();
        book1.title = "Java {rpgrammiong";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        
        book1.printDetails();
        System.out.println("---------------");
        book1.updatePrice(250);
        book1.markAsAvailabale();
        book1.printDetails();
        System.out.println(book1.isPublishedAfter(2000));
    }
}
