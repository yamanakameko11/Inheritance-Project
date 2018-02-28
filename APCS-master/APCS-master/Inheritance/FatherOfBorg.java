
/**
 * Write a description of class Father here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FatherOfBorg extends Enemy
{
    public FatherOfBorg(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        stats.add(0, 1 + (int)(Math.random() * 5));
        stats.add(1, 8);
        stats.add(2, 4);
        stats.add(3, 8);
        stats.add(4, 4);
        name = "FATHER OF BORG";
    }

    public void flex(){ // heals father
        int pts = getINT() + (int)(Math.random() * getSTR());
        setHP(pts);
        System.out.println("Father of Borg heals " + pts + " HP.");
    }
    
    public void shellShock(Player player){
        if (getHP() >= player.getHP()){
            int dmg = -1 + (int)(Math.random() * -getINT());
            player.setHP(dmg);
        }
    }
}
