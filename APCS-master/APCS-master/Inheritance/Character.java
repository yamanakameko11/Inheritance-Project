
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
    ArrayList stats; // LVL, HP ,MP, STR, INT
    int LVL;
    int HP;
    int MP;
    int STR;
    int INT;
    public Character(String name, int LVL, int HP, int MP, int STR, int INT){
        this.name = name;
        this.stats = new ArrayList<Integer>();
        this.LVL = LVL;
        this.HP = HP;
        this.MP = MP;
        this.STR = STR;
        this.INT = INT;
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
    
    public void setLVL(){ // PLAYER LEVELS UP
        LVL++;
    }
    
    public void setHP(int x){
        HP += x;
    }
    
    public void setMP(int x){
        HP += x;
    }
    
    public void setSTR(int x){
        STR += x;
    }
    
    public void setINT(int x){
        INT += x;
    }
}
