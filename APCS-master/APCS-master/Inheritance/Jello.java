
/**
 * Write a description of class Jello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Jello extends Food
{
   public Jello(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "JELLO";
       HP = 5;
       MP = 5;
    }
}
