
/**
 * Write a description of class FlaskOFHealing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FlaskOFHealing extends Potion
{
    public FlaskOfHealing(String name, ArrayList stats){ // HP, MP, STR
        super(name, stats);
        stats.add(0, 10);
        stats.add(1, 0);
        stats.add(2, 0);
    }
    
}
