
/**
 * Sacrifice some health for magic.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class HornedMelon extends Food
{
   public HornedMelon(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "HORNED MELON";
       HP = -2;
       MP = 10;
    }
}
