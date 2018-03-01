
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Potion extends Item
{
    int HP;
    int MP;
    int STR;
    public Potion(String name, ArrayList stats){ //HP ,MP, STR
        super(name, stats);
        stats.add(HP);
        stats.add(MP);
        stats.add(STR);
    }
    
    public void heal(Potion potion){
        System.out.println("You drink the potion.");
    }
}
