
/**
 * Write a description of class Stick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Stick extends Weapon
{
    public Stick(String name, ArrayList stats, double HP, int atk){
        super(name, stats, HP, atk);
        name = "STICK";
        HP = 8;
        atk = 2;
    }
}
