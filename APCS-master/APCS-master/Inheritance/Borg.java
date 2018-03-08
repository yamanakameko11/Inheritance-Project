
/** A borg is a pill bug man.
 * Write a description of class Borg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Borg extends Enemy // enemy is an amalgamation of little fat bugs
{
    int summon;
    public Borg(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT); // LVL, HP ,MP, STR, INT
    }
    
    public Borg(){
        this("BORG", 3, 5, 0, 5, 1);
    }

    public void cry(Player player){ //drains MP
        System.out.println("SSSSHHHHHHAAAAAAAAAAAAAAA!!! SSSSHHH-SHHHH-SHHAAAAA!!");
        System.out.println("It cries out in a thousand voices.");
        player.setHP(-getINT());
        System.out.println("Slight damage was dealt. Lose 1HP.");
    }
}
