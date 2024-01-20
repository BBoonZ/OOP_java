/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

/**
 *
 * @author BBoonZ
 */
public abstract class Spell {
    private int damage;
    private final String name;
    public Spell(){
        this("");
    }
    public Spell(String name){
        this.name = name;
    }
    public int getDamage(){
        return damage;
    }
    public String getName(){
        return name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
}
