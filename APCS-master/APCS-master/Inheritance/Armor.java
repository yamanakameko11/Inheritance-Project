
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Armor extends Item implements DefenseCommands
{
    int str;
    int HP;
    public Armor(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        stats.add(str);
        stats.add(HP);
    }
    
    public boolean blocked(){
        int x = str + (int)(Math.random() * (HP*2)); //70% chance of blocking all attacks
        if (x > (str/2)){
            return true;
        } else{
            return false;
        }
    }
}
