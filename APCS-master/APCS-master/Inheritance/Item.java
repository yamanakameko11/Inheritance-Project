
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
abstract class Item implements ItemInterface{
    //Implemented in your own way
    private String name;
    private ArrayList stats; // HP, DMG

    public Item(String name){
        this.name = name;
        this.stats = new ArrayList();
        stats.add(name);
    }

    public String getName(){
        return name;
    }

    public ArrayList getStats(){
        return stats;
    }
}
