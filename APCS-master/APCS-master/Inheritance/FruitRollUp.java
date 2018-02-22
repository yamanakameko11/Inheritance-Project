
/**
 * It's metal.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FruitRollUp extends Weapon
{
    public FruitRollUp(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 15);
        stats.add(1, 5);
    }
}
