
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Armor extends Item implements DefenseCommands
{
    public Armor(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
    }
    
    public boolean blocked(){
        int x = 1 + (int)(Math.random() * 10); //70% chance of blocking all attacks
        if (x > 7){
            return false;
        } else{
            return true;
        }
    }
}
