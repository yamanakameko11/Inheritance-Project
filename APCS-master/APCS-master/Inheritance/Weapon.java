
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.String;
abstract class Weapon extends Item implements WeaponInterface
{
    private int atk;
    private double HP;
    public Weapon(String name, ArrayList stats){
        super(name, stats);
        stats.add(atk);
        stats.add(HP);
    }
    

    public int attack(){
        int dmg = atk + (int)(Math.random() * (atk*2));
        System.out.println(atk);
        return dmg;
    }

    public boolean parry(Player player, Enemy enemy){
        if(player.getSTR() > enemy.getSTR()){
            return true;
        } else{
            return false;
        }
    }
}
