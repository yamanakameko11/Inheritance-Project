
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Shield extends Armor
{
   public Shield(String name, ArrayList stats, int str){
        super(name, stats, str);
        name = "SHIELD";
        str = 100;
    }
}
