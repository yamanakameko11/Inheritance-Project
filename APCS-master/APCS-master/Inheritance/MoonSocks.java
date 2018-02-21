
/**
 * Write a description of class MoonSocks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MoonSocks extends Armor
{
   public MoonSocks(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 4);
        stats.add(1, 50);
    }
}
