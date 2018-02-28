
/**
 * Write a description of class Peas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Peas extends Food
{
    public Peas(String name, ArrayList stats){
       super(name, stats);
       stats.add(0, 2);
       stats.add(1, 2);
    }
}
