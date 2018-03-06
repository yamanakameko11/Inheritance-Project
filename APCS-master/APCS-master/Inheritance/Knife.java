
/**
 * Write a description of class Knife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Knife extends Weapon
{
    public Knife(String name, ArrayList stats, double HP, int atk){
        super(name, stats, HP, atk);
        name = "KNIFE";
        HP = 20;
        atk = 7;
    }
}