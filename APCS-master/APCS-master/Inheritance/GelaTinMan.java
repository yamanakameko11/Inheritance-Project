
/**
 * Write a description of class GelaTinMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GelaTinMan extends Enemy
{
    public GelaTinMan(String name, int LVL, int HP, int MP, int STR, int INT){
        super(name, LVL, HP, MP, STR, INT); // LVL, HP ,MP, STR, INT
    }

    public GelaTinMan(){
        super("GELA-TIN-MAN", 5, 15, 10, 3, 7);
    }

    public void splatt(Player player, GelaTinMan gelatinman){
        if(player.getINT() < gelatinman.getINT()){
            System.out.println("It swiftly jabs into your sides, but surprisingly, doesn't hurt too much???");
            player.setINT(-2);
        } else {
            System.out.println("Alas, you are too smart, and swiftly dodge the tin man full of jelly.");
        }
    }
}
