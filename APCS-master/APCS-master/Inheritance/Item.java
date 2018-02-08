
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    private String name;
    private ArrayList stats; // HP, STR

    public Item(String name, ArrayList stats){
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
