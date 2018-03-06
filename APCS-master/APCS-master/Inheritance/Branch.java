
/**
 * Write a description of class Branch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Branch extends Weapon
{
    public Branch(String name, ArrayList stats, double HP, int atk){ // name, HP, atk
        super(name, stats, HP, atk);
        name = "BRANCH";
        HP = 15;
        atk = 3;
    }
}
