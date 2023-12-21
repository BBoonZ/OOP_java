/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week4_6_Library {
    public String libraryName;
    public Week4_6_Book book1;
    public Week4_6_Book book2;
    public Week4_6_Book book3;
    public void addBook(Week4_6_Book book, int slot){
        switch(slot){
            case 1 -> book1 = book;
            case 2 -> book2 = book;
            case 3 -> book3 = book;
        }
    }
    public void removeBook(int slot){
        switch(slot){
            case 1 -> book1 = null;
            case 2 -> book2 = null;
            case 3 -> book3 = null;
        }
    }
    public void printLibraryDetails(){
        System.out.println("Library : " + libraryName);
        System.out.println("");
        
        if (book1 != null){
            System.out.println("Title : " + book1.title);
            System.out.println("Author : " + book1.author);
            System.out.println("Publisher : " + book1.publisher);
            System.out.println("yearPublished : " + book1.yearPublished);
            System.out.println("Price : $" + book1.price);
            if (book1.isAvailable){
                System.out.println("Availble : Yes");
            }else{
                System.out.println("Availble : No");
            }
        }else{
            System.out.println("No book in this slot.");
        }
        
        System.out.println("");
        
        if (book2 != null){
            System.out.println("Title : " + book2.title);
            System.out.println("Author : " + book2.author);
            System.out.println("Publisher : " + book2.publisher);
            System.out.println("yearPublished : " + book2.yearPublished);
            System.out.println("Price : $" + book2.price);
            if (book2.isAvailable){
                System.out.println("Availble : Yes");
            }else{
                System.out.println("Availble : No");
            }
        }else{
            System.out.println("No book in this slot.");
        }
        
        System.out.println("");
        
        if (book3 != null){
            System.out.println("Title : " + book3.title);
            System.out.println("Author : " + book3.author);
            System.out.println("Publisher : " + book3.publisher);
            System.out.println("yearPublished : " + book3.yearPublished);
            System.out.println("Price : $" + book3.price);
            if (book3.isAvailable){
                System.out.println("Availble : Yes");
            }else{
                System.out.println("Availble : No");
            }
        }else{
            System.out.println("No book in this slot.");
        }
        
    }
    public void checkBookAvailability(int slot){
        switch(slot){
            case 1 -> {
                if (book1 != null) {
                    System.out.println(book1.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available");
                }      
            }
            case 2 -> {
                if (book2 != null) {
                    System.out.println(book2.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available");
                }      
            }
            case 3 -> {
                if (book3 != null) {
                    System.out.println(book3.title + " is available.");
                } else {
                    System.out.println("Book in slot " + slot + " is not available");
                }      
            }
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        switch(slot){
            case 1 -> {     
                if (book1 != null){
                    System.out.println("Updated price of " + book1.title + " to $" + newPrice);
                    book1.price = newPrice;
                }else{
                    System.out.println("No book in this slot.");
                }
            }
            case 2 -> {     
                if (book2 != null){
                    System.out.println("Updated price of " + book2.title + " to $" + newPrice);
                    book2.price = newPrice;
                }else{
                    System.out.println("No book in this slot.");
                }
            }
            case 3 -> {     
                if (book3 != null){
                    System.out.println("Updated price of " + book3.title + " to $" + newPrice);
                    book3.price = newPrice;
                }else{
                    System.out.println("No book in this slot.");
                }
            }
        }
    }
    public void printBookDetails(Week4_6_Book book){
        if (book != null){
            System.out.println("Title : " + book.title);
            System.out.println("Author : " + book.author);
            System.out.println("Publisher : " + book.publisher);
            System.out.println("yearPublished : " + book.yearPublished);
            System.out.println("Price : " + book.price);
            System.out.println("Availble : " + book.isAvailable);
        }else{
            System.out.println("No book in this slot.");
        }
    }
}
