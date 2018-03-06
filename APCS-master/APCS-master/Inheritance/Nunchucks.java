
/**
 * Write a description of class Nunchicks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Nunchucks extends Weapon
{
    public Nunchucks(String name, ArrayList stats, double HP, int atk){
        super(name, stats, HP, atk);
        name = "NUNCHUCKS";
        HP = 40;
        atk = 10;
    }
}