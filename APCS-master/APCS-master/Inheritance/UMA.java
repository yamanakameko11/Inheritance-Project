
/**
 * Write a description of class UMA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UMA extends Familiar
{
    public UMA(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT);
    }

    public UMA(){
        this("UMA", 3, 100, 100, 10, 10);
    }
}
