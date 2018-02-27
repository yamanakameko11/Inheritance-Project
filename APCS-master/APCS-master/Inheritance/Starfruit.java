
/**
 * Write a description of class Starfruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Starfruit extends Food
{
   public Starfruit(String name, ArrayList stats){
       super(name, stats); //HP, MP
       stats.add(0, 5);
       stats.add(0, 5);
    }
}
