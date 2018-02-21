
/**
 * Feels like the warm embrace only a mother could give.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MothersCloak extends Armor
{
   public MothersCloak(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 11);
        stats.add(1, 50);
    }
}