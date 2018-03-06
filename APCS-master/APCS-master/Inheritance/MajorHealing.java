
/**
 * Write a description of class MajorHealing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MajorHealing extends Potion
{
    public MajorHealing(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "FLASK OF MAJOR HEALING";
        HP = 10;
        MP = 0;
        STR = 0;
    }
}