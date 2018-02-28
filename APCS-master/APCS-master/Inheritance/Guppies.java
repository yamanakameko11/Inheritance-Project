
/**
 * Write a description of class Guppies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Guppies extends Food
{
    public Guppies(String name, ArrayList stats){
       super(name, stats);
       stats.add(0, 4);
       stats.add(1, 0);
    }
}
