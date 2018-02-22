
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.ArrayList;
public abstract class Character implements CharacterInterface
{
    private String name;
    private ArrayList stats; // LVL, HP ,MP, STR, INT
    private int LVL;
    private int HP;
    private int MP;
    private int STR;
    private int INT;
    public Character(String name, ArrayList stats){
        this.name = name;
        this.stats = new ArrayList<Integer>();
        stats.add(LVL);
        stats.add(HP);
        stats.add(MP);
        stats.add(STR);
        stats.add(INT);
    }

    public String getName(){
        return name;
    }

    public ArrayList getStats(){
        return stats;
    }
    
    public int getLVL(){
        return (Integer)stats.get(0);
    }
    
    public int getHP(){
        return (Integer)stats.get(1);
    }
    
    public int getMP(){
        return (Integer)stats.get(2);
    }
    
    public int getSTR(){
        return (Integer)stats.get(3);
    }
    
    public int getINT(){
        return (Integer)stats.get(4);
    }
}
