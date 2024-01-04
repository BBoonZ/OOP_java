/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
public class Week5_2_FootballPlayer extends Week5_1_Player{
    private int playerNumber;
    private String position;
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    public void setPosition(String p){
        position = p;
    }
    public int getPlayerNumber(){
        return playerNumber;
    }
    public String getPosition(){
        return position;
    }
    public boolean isSamePosition (Week5_2_FootballPlayer p){
        if((p.getPosition().equals(this.getPosition()))&
        (p.getTeam().equals(this.getTeam())))
            return true;
        else
            return false;
        }
}

