
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armor extends Item implements DefenseCommands
{
    public Armor(String name, ArrayList<Integer> stats){
        super(name, stats);
    }
    
    public boolean blocked(){
    }
}
