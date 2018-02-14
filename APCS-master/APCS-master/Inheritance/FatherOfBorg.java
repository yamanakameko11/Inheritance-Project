
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
        super(name, stats);
        stats.add(1 + (int)(Math.random() * 5));
        stats.add(8);
        stats.add(4);
        stats.add(8);
        stats.add(4);
    }
    
    public void flex(){
        Player player = new Player();
        if (player.getStats(4) <= FatherOfBorg.getStats(4)){
            Player.getStats(1) -= Player.getStats(4)-FatherOfBorg.getStats(4);
        }
    }
}
