
/** A borg is a pill bug man.
 * Write a description of class Borg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class Borg extends Enemy // enemy is an amalgamation of little fat bugs
{
    
    public Borg(String name, ArrayList stats){
        super(name, stats);
        stats.add(1 + (int)(Math.random() * 2)); // LVL, HP ,MP, STR, INT (min + (int)(Math.random() * max);)
        stats.add(5);
        stats.add(0);
        stats.add(5);
        stats.add(1);
    }
}
