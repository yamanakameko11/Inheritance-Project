
/**
 * Write a description of class FlaskOFHealing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MinorHealing extends Potion
{
    public MinorHealing(String name, ArrayList stats, int HP, int MP, int STR){ // HP, MP, STR
        super(name, stats, HP, MP, STR);
        name = "FLASK OF MINOR HEALING";
        HP = 5;
        MP = 0;
        STR = 0;
    }
}
