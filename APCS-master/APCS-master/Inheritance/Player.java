
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
    int LVL;
    int HP;
    int MP;
    int STR;
    int INT;
    public Player(String name, ArrayList stats){
        super(name, stats); // LVL, HP ,MP, STR, INT
        stats.add(1);
        stats.add(10);
        stats.add(10);
        stats.add(5);
        stats.add(5);
        name = "";
    }

    public void playerName(){
        Scanner ask = new Scanner(System.in);
        boolean state = false;
        while (!state){
            name = ask.next("ENTER YOUR NAME: ").toUpperCase();
            String confirm = ask.next("Your name is " + name + ", correct? Y/N").toUpperCase();
            if(confirm.equals("Y") || confirm.equals("YES")){
                state = true;
            } else{ state = false;}
        }
    }
    
    public void consume(Item Food){
    }
}
