
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Shield extends Armor
{
   public Shield(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 6);
        stats.add(1, 150);
    }
}
