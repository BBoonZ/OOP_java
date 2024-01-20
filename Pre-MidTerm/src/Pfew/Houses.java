/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

/**
 *
 * @author BBoonZ
 */
public class Houses {
    private String color;
    private String name;
    public Houses(){
        this("", "");
    }
    public Houses(String name, String color){
        this.color = color;
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "[House] : " + name + " , Color : " + color;
    }
}
