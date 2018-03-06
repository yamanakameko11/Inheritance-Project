
/**
 * Write a description of class MinorStrength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MinorStrength extends Potion
{
    public MinorStrength(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "POD OF MINOR STRENGTH";
        HP = 0;
        MP = 0;
        STR = 5;
    }
}