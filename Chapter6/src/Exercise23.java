/*
Prove that class loading takes place only once.
Prove that loading may be caused by either the creation
of the first instance of that class or by the access of a static member.
 */
import static net.mindview.util.Print.*;
class OnlyOnce{
    private int i = once("initialized");
    OnlyOnce(){print("OnlyOnce Constructor");}
    static int once(String s){
        print(s);
        return 47;
    }
}

public class Exercise23 extends OnlyOnce{
    static int i = once("Exercise23.i initialized");
    public static void main(String[] args){
        OnlyOnce oo = new OnlyOnce();
        Exercise23 exc23 = new Exercise23();
        int i = once("Exercise23.i initialized");
    }
}
