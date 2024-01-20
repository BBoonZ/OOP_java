/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pfew;

/**
 *
 * @author BBoonZ
 */
public interface Magicable {
    public abstract void attackSpell(Player player, Player targe, Spell spell);
    public abstract void defense(Player player, Player damage);
}
