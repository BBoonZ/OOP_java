/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JBank;

/**
 *
 * @author BBoonZ
 */
public class Pigeous extends Bird{
    public Pigeous(){
        this("", 0);
    }
    public Pigeous(String name, int age){
        super(name, age);
    }
    @Override
    public void eat(Food f){
        setPower(getPower()+(f.getPower()*2));
    }
    @Override
    public void wingAttack(Animal a){
        this.wingAttack(a, 1);
    }
    public void wingAttack(Animal a, int times){
        for (int i=0;i<times;i++){
            a.setPower(a.getPower()-5);
        }
    }
    @Override
    public void fly(){
        System.out.println(getName() + " fly fly ....");
    }
        
}
