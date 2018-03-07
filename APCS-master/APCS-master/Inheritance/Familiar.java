
/**
 * Write a description of class Familiar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Familiar extends Character
{
    public Familiar(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT);
    }

    public void CastHealing(Player player){ // heals player half of current HP
        int heal = player.getHP()/2;
        player.setHP(heal);
        System.out.println("PLAYER HP: " + player.getHP());
    }

    public void MagicRestoration(Player player){ //gives player twice current magick
        player.setMP(player.getMP()*2);
        System.out.println("PLAYER MP: " + player.getMP());
    }
}
