
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
abstract class Armor extends Item implements DefenseCommands
{
    int str;
    int HP;
    boolean end;
    public Armor(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        stats.add(str);
        stats.add(HP);
    }
    
    public boolean blocked(){
        if (HP > str){
            end = false;
        } else {
            end = true;
        }
        return end;
    }
}
