/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_2_FootballPlayer_main {
    public static void main(String[] args) {
        Week5_2_FootballPlayer p1 = new Week5_2_FootballPlayer();
        p1.setName("Harry");
        p1.setTeam("Gryffindor");
        p1.setPlayerNumber(1);
        p1.setPosition("keeper");
        Week5_2_FootballPlayer p2 = new Week5_2_FootballPlayer();
        p2.setName("Jame");
        p2.setTeam("Gryffindor");
        p2.setPlayerNumber(1);
        p2.setPosition("fullback");
        
        System.out.println("We are same position : " + p1.isSamePosition(p2));
        System.out.println("We are same team : "+ p1.isSameTeam(p2));
    }
}
