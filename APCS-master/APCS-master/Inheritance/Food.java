
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
abstract class Food extends Item
{
    int HP;
    int MP;
    public Food(String name, ArrayList stats){
        super(name, stats); 
        stats.add(HP);
        stats.add(MP);
    }
    
    public int getHP(){
        return HP;
    }
    
    public int getMP(){
        return MP;
    }
    
    public void consume(Player player){
        System.out.println("You consume the sustenance.");
        player.setHP(getHP());
        player.setMP(getMP());
        player.getName();
        System.out.println("HP:" + player.getHP());
        System.out.println("MP:" + player.getHP());
    }
}
