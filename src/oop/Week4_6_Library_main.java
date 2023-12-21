/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_6_Library_main {
    public static void main(String[] args) {
        Week4_6_Book book1 = new Week4_6_Book();
        book1.title = "Java {rpgrammiong";
        book1.price = 450;
        book1.publisher = "Head First";
        book1.yearPublished = 2006;
        book1.isAvailable = false;
        book1.author = "John Smith";
        
        Week4_6_Book book2 = new Week4_6_Book();
        book2.title = "Python Programming";
        book2.price = 225;
        book2.publisher = "KM";
        book2.yearPublished = 2020;
        book2.isAvailable = true;
        book2.author = "Elon Potter";
        
        Week4_6_Library lib = new Week4_6_Library();
        lib.libraryName = "IT Library";
        lib.addBook(book2, 1);
        lib.addBook(book1, 3);
        
        lib.updateBookPrice(2, 1000);
        lib.updateBookPrice(3, 320);
        
        lib.printLibraryDetails();
    }
}

