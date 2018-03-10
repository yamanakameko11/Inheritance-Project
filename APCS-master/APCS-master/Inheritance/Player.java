
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
    public Player(String name, int LVL, int HP, int MP, int STR, int INT)
    {
        super(name, LVL, HP, MP, STR, INT); // LVL, HP ,MP, STR, INT
    }
    
    public Player()
    {
        this("player", 1, 10, 10, 5, 5);
    }

    public void setName()
    {
        Scanner ask = new Scanner(System.in);
        boolean state = false;
        while (!state)
        {
            System.out.println("ENTER YOUR NAME: ");
            this.name = ask.next().toUpperCase();
            System.out.println("Your name is " + name + ", correct? Y/N");
            String confirm = ask.next().toUpperCase();
            if(confirm.equals("Y") || confirm.equals("YES"))
            {
                state = true;
                System.out.println("NAME SET TO: " + name);
            } else
            { state = false;
            }
        }
    }
    
}
