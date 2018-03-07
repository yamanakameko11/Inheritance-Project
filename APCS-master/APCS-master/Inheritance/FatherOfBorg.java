
/**
 * Write a description of class Father here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class FatherOfBorg extends Enemy
{
    public FatherOfBorg(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT); // LVL, HP ,MP, STR, INT
        name = "FATHER OF BORG";
        LVL = 1 + (int)(Math.random() * 5);
        HP = 14;
        MP = 0;
        STR = 8;
        INT = 4;
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
            if (dmg > INT/2){
                System.out.println("FATHER OF BORG deals minor damage.");
            }else{
                System.out.println("FATHER OF BORG deals soem damage.");
            }
            System.out.println("PLAYER HP: " + player.getHP());
        }
    }
}
