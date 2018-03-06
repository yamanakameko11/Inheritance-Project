
/**
 * Write a description of class Claws here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Claws extends Weapon
{
    public Claws(String name, ArrayList stats, double HP, int atk){
        super(name, stats, HP, atk);
        name = "CLAWS";
        HP = 17;
        atk = 8;
    }
}
