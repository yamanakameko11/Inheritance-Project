
/**
 * Write a description of class Espression here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Espression extends Food
{
    public Espression(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP);
       name = "Espression";
       HP = 3;
       MP = 5;
    }
}
