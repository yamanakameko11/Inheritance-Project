
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
    public Armor(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        this.str = str;
        stats.add(str);
    }
    
    public boolean blocked(){
        boolean end;
        int rand = 1 + (int)(Math.random() * (str^2));
        if (rand < str){
            end = false;
        } else {
            end = true;
        }
        return end;
    }
    
    public int getStr(){
        return str;
    }
    
    public void setStr(int x){
        str += x;
    }
}
