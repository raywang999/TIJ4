/*
Create a class with a static final field and a final
field and demonstrate the difference between the two.
 */
import java.util.Random;
import static java.util.Random.*;

import static net.mindview.util.Print.*;
class StaticFinalTest{
    Random rand = new Random();
    final int i = rand.nextInt(20);
    static final StaticFinalTest sft1 = new StaticFinalTest();
}

public class Excersize18 {
    public static void main(String[] args){
        StaticFinalTest sft1 = new StaticFinalTest();
        StaticFinalTest sft2 = new StaticFinalTest();
        print("sft1.sft1:" + sft1.sft1 + " sft2.sft1:" + sft2.sft1);
        print("sft1.sft1:" + sft1.i + " sft2.sft1:" + sft2.i);
    }
}
