import static net.mindview.util.Print.*;
import java.lang.Integer;

class Exercise9{
    public static void main(String[] args){
        int range = Integer.parseInt(args[0]);
        int fbefore2 = 0;
        int fbefore = 1;
        int fnow = 1;
        for (int i = 0; i < range; i++){
            printnb(fnow + " ");
            fnow = fbefore + fbefore2;
            fbefore2 = fbefore;
            fbefore = fnow;
        }
    }
}
