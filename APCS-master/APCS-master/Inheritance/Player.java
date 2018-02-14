
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Player extends Character
{
    Scanner scanner = new Scanner(System.in);
    public Player(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        stats.add(1);
        stats.add(10);
        stats.add(10);
        stats.add(5);
        stats.add(5);
    }
    
    public String setName(){
        name = scanner.next("Please enter your name").upper();
        return name;
    }
    
}
