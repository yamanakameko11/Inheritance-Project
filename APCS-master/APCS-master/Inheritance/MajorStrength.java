
/**
 * Write a description of class MajorStrength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MajorStrength extends Potion
{
    public MajorStrength(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "POD OF MAJOR STRENGTH";
        HP = 0;
        MP = 0;
        STR = 10;
    }
}