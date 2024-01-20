/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

/**
 *
 * @author BBoonZ
 */
public class Gryffindor extends Houses implements Magicable{
    public Gryffindor(){
        super("Gryffindor", "RED");
    }
    @Override
    public void attackSpell(Player player, Player target, Spell spell){
        target.setHP(target.getHP() - (player.getAttackDamage() + spell.getDamage()));
        System.out.println("[" + player.getName() +"]: use spell (" + spell.getName() + ")!");
        if (spell instanceof Incendio){
            player.setMana(player.getMana()-4);
        }else if (spell instanceof Expelliarmus){
            player.setMana(player.getMana()-3);
        }
    }
    @Override
    public void defense(Player player, Player damage){
        player.setHP(player.getHP()+4);
        player.setMana(player.getMana()+3);
        System.out.println("[" + player.getName() + "]: Protego !");
    }
}
