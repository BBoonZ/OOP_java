/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

import java.util.*;

/**
 *
 * @author BBoonZ
 */
public class Control {
    private BookView bookview;
    private ArrayList<Book> array = new ArrayList<>();
    public Control(){
        bookview = new BookView();
    }
    
    public void setBook(String name, double price, String type){
        Book book = new Book(name, price, type);
        System.out.println(name + price + type);
        array.add(book);
    }
            

    
    public static void main(String[] args) {
        new Control();
    }
}
