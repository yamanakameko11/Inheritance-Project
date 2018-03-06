
/**
 * Restores MP. No HP.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MiracleGrapes extends Food
{
   public MiracleGrapes(String name, ArrayList stats, int HP, int MP){
       super(name, stats, HP, MP); //HP, MP
       name = "MIRACLE GRAPES";
       HP = 2;
       MP = 2;
    }
}