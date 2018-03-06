
/**
 * Write a description of class Starfruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Starfruit extends Food
{
   public Starfruit(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "STARFRUIT";
       HP = 2;
       MP = 2;
    }
}
