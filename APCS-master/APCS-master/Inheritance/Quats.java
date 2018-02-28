
/**
 * Write a description of class Quats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Quats extends Food
{
    public Quats(String name, ArrayList stats){
       super(name, stats);
       stats.add(0, 5);
       stats.add(1, 2);
    }
}
