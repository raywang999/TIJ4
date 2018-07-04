/*
Create a base class with two methods. In the first method, call the second method.
Inherit a class and override the second method. Create an object of the derived class,
upcast it to the base type, and call the first method. Explain what happens.
 */
import static net.mindview.util.Print.*;

class Dual{
    void guner(Dual d){ gun(); }
    void gun(){ print("bam!"); }
}

public class Excersize10 extends Dual{
    void gun() { print("Boom!"); }
    public static void main(String[] args){
        Excersize10 roland = new Excersize10();
        roland.guner(roland);
    }
}
