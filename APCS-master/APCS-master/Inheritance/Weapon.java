
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weapon extends Item implements WeaponInterface
{
    public Weapon(String name, ArrayList stats){
        super(name, stats);
    }
    
    public int attack(){
    }
    
    public boolean parry(){
    }
}
