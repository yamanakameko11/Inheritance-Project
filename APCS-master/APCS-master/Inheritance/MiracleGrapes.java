
/**
 * Restores MP. No HP.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MiracleGrapes extends Food
{
   public MiracleGrapes(String name, ArrayList stats){
       super(name, stats); //HP, MP
       stats.add(0, 0);
       stats.add(0, 5);
    }
}