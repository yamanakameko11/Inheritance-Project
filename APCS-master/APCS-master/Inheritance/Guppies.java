
/**
 * Write a description of class Guppies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Guppies extends Food
{
   public Guppies(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "GUPPIES";
       HP = 4;
       MP = 4;
    }
}
