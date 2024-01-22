/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

/**
 *
 * @author BBoonZ
 */
public class Player {
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    private final int attackDamage = 2;
    private final String name;
    public Player(String name){
        this(name, 20);
    }
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getHP(){
        return hp;
    }
    public Houses getHouse(){
        return houses;
    }
    public int getMana(){
        return mana;
    }
    public String getName(){
        return name;
    }
    public void setHP(int hp){
        if (hp < 0 ){
            this.hp = 0;
        }else if (hp > 20){
            this.hp = 20;
        }else{
            this.hp = hp;
        }
    }
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    public void setMana(int Mana){
        if (Mana < 0 ){
            this.mana = 0;
        }else if (Mana > 50){
            this.mana = 50;
        }else{
            this.mana = Mana;
        }
    }
    public void attack(Player target, Spell spell){
        if (houses instanceof Hufflepuff){
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }else if (houses instanceof Gryffindor){
            Gryffindor g1 = (Gryffindor) houses;
            g1.attackSpell(this, target, spell);
        }
        
        if (target.getHP() <= 0){
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + name);
        }
    }
    public void protectFromPlayer(Player target){
        if (houses instanceof Hufflepuff){
            Hufflepuff h1 = (Hufflepuff) houses;
            h1.defense(this, target);
        }else if (houses instanceof Gryffindor){
            Gryffindor g1 = (Gryffindor) houses;
            g1.defense(this, target);
        }
    }
    
    public boolean equals(Player player){
        if (player.getName().equals(getName()) && player.getHouse().equals(getHouse())){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }
    
}
