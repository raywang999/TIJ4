/*
Even if you don’t create a constructor for Cartoon( ),
the compiler will synthesize a default constructor for
you that calls the base class constructor. Prove it.
 */
//: reusing/Cartoon.java
// Constructor calls during inheritance.
//package reusing;
import static net.mindview.util.Print.*;

class Art1 {
    Art1() { print("Art constructor"); }
}

class Drawing1 extends Art1 {
    Drawing1() { print("Drawing constructor"); }
}
class Cartoon1 extends Drawing1 {
   // public Cartoon() { print("Cartoon constructor"); }
    public static void main(String[] args) {
        Cartoon1 x = new Cartoon1();
    }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~

public class Exercise3{
    public static void main(String[] args) {
        Cartoon1 c = new Cartoon1();
    }
}
