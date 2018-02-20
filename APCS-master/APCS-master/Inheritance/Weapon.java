
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.String;
public class Weapon extends Item implements WeaponInterface
{
    private double atk;
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

    public boolean parry(){
        double str = atk + HP;
        double var = 0 + (int)(Math.random() * str);
        if(var > HP/2){
            return true;
        } else{
            return false;
        }
    }
}
