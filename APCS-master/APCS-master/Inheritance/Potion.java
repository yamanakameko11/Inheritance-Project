
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Potion extends Item
{
    int HP;
    int MP;
    int STR;
    public Potion(String name, ArrayList stats, int HP, int MP, int STR){ //HP ,MP, STR
        super(name, stats);
        this.HP = HP;
        this.MP = MP;
        this.STR = STR;
        stats.add(HP);
        stats.add(MP);
        stats.add(STR);
    }

    public void heal(Player player, Potion potion){
        System.out.println("You drink the potion. Nice.");
        player.setHP(potion.getHP());
        player.setMP(potion.getMP());
        player.setSTR(potion.getSTR());
        System.out.println("PLAYER HP: " + player.getHP());
        System.out.println("PLAYER MP: " + player.getMP());
        System.out.println("PLAYER STR: " + player.getSTR());
    }

    public int getHP(){
        return HP;
    }

    public int getMP(){
        return MP;
    }

    public int getSTR(){
        return STR;
    }
}
