
/**
 * Write a description of class MajorMagic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MajorMagic extends Potion
{
    public MajorMagic(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "VIAL OF MAJOR MAGIC";
        HP = 0;
        MP = 10;
        STR = 0;
    }
}