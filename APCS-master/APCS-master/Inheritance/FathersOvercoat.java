
/**
 * Write a description of class FathersOvercoat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FathersOvercoat extends Armor
{
    public FathersOvercoat(String name, ArrayList stats){
        super(name, stats);
        stats.add(0, 10);
        stats.add(1, 50);
    }
}
