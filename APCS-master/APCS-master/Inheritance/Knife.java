
/**
 * Write a description of class Knife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Knife extends Weapon
{
    public Knife(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 7);
        stats.add(1, 20);
    }
}