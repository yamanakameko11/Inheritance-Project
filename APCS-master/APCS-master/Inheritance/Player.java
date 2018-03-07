
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
    public Player(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT); // LVL, HP ,MP, STR, INT
        LVL = 1;
        HP = 10;
        MP = 10;
        STR = 5;
        INT = 5;
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
}
