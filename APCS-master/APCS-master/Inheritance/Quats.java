
/**
 * Write a description of class Quats here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Quats extends Food
{
   public Quats(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "QUATS";
       HP = 0;
       MP = 4;
    }
}
