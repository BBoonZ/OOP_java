/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BBoonZ
 */
import java.math.*;
public class Week4_4_Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        return topN + "/" + btmN;
    }
    public String toFloat(){
        double btm_N = btmN;
        double top_N = topN;
        return (top_N/btm_N) + "";
    }
    public void addFraction(Week4_4_Fraction f){
        if (btmN == f.btmN){
            topN = topN + f.topN;
        }else{
            topN = (topN * f.btmN) + (f.topN * btmN);
            btmN = btmN * f.btmN;
        }
    }
    public boolean myEquals(Week4_4_Fraction x){
        return (toFloat().equals(x.toFloat()));
    }
    public void LowestTermFrac(){
        BigInteger gcd_ = BigInteger.valueOf(topN).gcd(BigInteger.valueOf(btmN));
        String var = gcd_ + "";
        int num = Integer.parseInt(var);
        topN = topN/num;
        btmN = btmN/num;
    }
}
