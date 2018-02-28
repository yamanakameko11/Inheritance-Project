
/**
 * Write a description of class Espression here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Espression extends Food
{
    public Espression(String name, ArrayList stats){
       super(name, stats);
       stats.add(0, 4);
       stats.add(1, 10);
    }
}
