
/**
 * It's metal.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FruitRollUp extends Weapon
{
    public FruitRollUp(String name, ArrayList stats, double HP, int atk){
        super(name, stats, HP, atk);
        name = "FRUIT ROLL UP";
        HP = 7;
        atk = 15;
    }
}
