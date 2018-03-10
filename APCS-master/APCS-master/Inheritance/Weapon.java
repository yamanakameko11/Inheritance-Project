
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.String;
abstract class Weapon extends Item implements WeaponInterface
{
    private double HP;
    private int atk;
    public Weapon(String name, double HP, int atk){
        super(name);
        this.atk = atk;
        this.HP = HP;
        stats.add(HP);
        stats.add(atk);
    }

    public int attack(){
        int dmg = atk + (int)(Math.random() * (atk*2));
        System.out.println(atk);
        return dmg;
    }

    public boolean parry(){
        int p = 1 + (int)(Math.random() * (atk*2));
        if(p > HP/2){
            return true;
        } else{
            return false;
        }
    }

    public int getAtk(){
        return atk;
    }

    public void setAtk(double x){
        atk += x;
    }

    public double getHP(){
        return HP;
    }

    public void setHP(int x){
        HP += x;
    }
}
