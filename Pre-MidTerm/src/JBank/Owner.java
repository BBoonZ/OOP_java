/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JBank;

/**
 *
 * @author BBoonZ
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this("", null);
    }
    public Owner(String name){
        this(name, null);
    }
    public Owner(Animal animal){
        this("", animal);
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public String getName(){
        return name;
    }
    public Animal getAnimal(){
        return animal;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public void feedFood(Food f){
        animal.setPower(animal.getPower()+f.getPower());
    }
    public void protectOwnerFrom(Animal a){
        if ((animal instanceof Dog)){
            Dog d1 = (Dog) animal;
            d1.kick(a);
        }else if ((animal instanceof Bird)){
            Bird b1 = (Bird) animal;
            b1.wingAttack(a);
        }
            
    }
    @Override
    public String toString(){
        return "Owner : name = " + getName() + ", Animal : name = " + animal.getName() + ", power = " + animal.getPower() + ", age = " + animal.getAge();
    }
}
