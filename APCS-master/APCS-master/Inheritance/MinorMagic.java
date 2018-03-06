
/**
 * Write a description of class MinorMagic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MinorMagic extends Potion
{
    public MinorMagic(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "VIAL OF MINOR MAGIC";
        HP = 0;
        MP = 5;
        STR = 0;
    }
}