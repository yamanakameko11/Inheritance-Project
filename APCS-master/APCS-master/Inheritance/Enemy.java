
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Enemy extends Character
{
    int LVL;
    int HP;
    int MP;
    int STR;
    int INT;
    public Enemy(String name, ArrayList stats){ // LVL, HP ,MP, STR, INT
        super(name, stats);
        stats.add(LVL);
        stats.add(HP);
        stats.add(MP);
        stats.add(STR);
        stats.add(INT);
    }
    
}
