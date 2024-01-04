/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_1_Player_main {
    public static void main(String[] args) {
        Week5_1_Player p1 = new Week5_1_Player();
        p1.setName("Bank");
        p1.setTeam("Gate OR");
        
        Week5_1_Player p2 = new Week5_1_Player();
        p2.setName("Khim");
        p2.setTeam("Gate AND");
        if(p1.isSameTeam(p2))
            System.out.println(p1.getName() +" is a same team with "+p2.getName());
        else
            System.out.println(p1.getName() +" is not a same team with "+p2.getName());
    }
}
