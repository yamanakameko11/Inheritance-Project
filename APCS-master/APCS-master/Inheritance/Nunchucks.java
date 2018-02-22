
/**
 * Write a description of class Nunchicks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Nunchucks extends Weapon
{
    public Nunchucks(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 5);
        stats.add(1, 40);
    }
}