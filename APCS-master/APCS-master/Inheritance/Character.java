
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

    public Character(String name, ArrayList stats){
        this.name = name;
        this.stats = new ArrayList();
    }

    public String getName(){
        return name;
    }

    public ArrayList getStats(){
        return stats;
    }
}
