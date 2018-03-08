
/**
 * Write a description of class Peas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Peas extends Food
{
    public Peas(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP);
       name = "Peas";
       HP = 2;
       MP = 2;
    }
}
