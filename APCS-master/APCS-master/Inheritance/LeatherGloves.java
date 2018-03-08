
/**
 * Write a description of class LeatherGloves here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class LeatherGloves extends Armor
{
   public LeatherGloves(String name, ArrayList stats, int str){
        super(name, stats, str);
        name = "LEATHER GLOVES";
        str = 4;
    }
}