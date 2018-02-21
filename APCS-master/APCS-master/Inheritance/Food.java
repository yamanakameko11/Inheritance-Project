
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
abstract class Food extends Item
{
    int HP;
    int MP;
    public Food(String name, ArrayList stats){
        super(name, stats); 
        stats.add(HP);
        stats.add(MP);
    }
    
}
