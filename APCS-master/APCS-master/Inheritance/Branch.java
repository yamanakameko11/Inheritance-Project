
/**
 * Write a description of class Branch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Branch extends Weapon
{
    public Branch(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 4);
        stats.add(1, 15);
    }
}
