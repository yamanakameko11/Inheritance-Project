
/**
 * Write a description of class Stick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Stick extends Weapon
{
    public Stick(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 2);
        stats.add(1, 10);
    }
}
