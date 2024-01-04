/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_1_Player {
    private String name;
    private String team;
    public void setName(String n){
        name = n;
    }
    public void setTeam(String n){
        team = n;
    }
    public String getName(){
        return name;
    }
    
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Week5_1_Player p){
        return team.equals(p.team);
    }
}
