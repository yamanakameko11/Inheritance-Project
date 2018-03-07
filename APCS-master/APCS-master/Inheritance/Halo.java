
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Halo extends Armor
{
    public Halo(String name, ArrayList stats, int str){
        super(name, stats, str);
        name = "HALO";
        str = 15;
    }
}
