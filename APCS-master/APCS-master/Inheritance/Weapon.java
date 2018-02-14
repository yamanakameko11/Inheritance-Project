
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
    public Weapon(String name, ArrayList stats){
        super(name, stats);
    }
    

    public int attack(){
        int dmg;

        return dmg;
    }

    public boolean parry(){
        if(Item.getStats.get(4) < Enemy.getStats.get(3)){
        }
    }
}
