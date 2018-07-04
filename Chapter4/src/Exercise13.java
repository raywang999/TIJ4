/*
The static initializers for Cups run when either the access of the static object cup1 occurs on the line marked (1), or if line (1) is commented out and the lines marked (2) are uncommented.
If both (1) and (2) are commented out, the static initialization for Cups never occurs, as you can see from the output.
Also, it doesn’t matter if one or both of the lines marked (2) are uncommented; the static initialization only occurs once.
Exercise 13: (1) Verify the statements in the previous paragraph.
 */

import static net.mindview.util.Print.*;

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;
//    static int i = 0;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
//    Cups(int i) {
//        print("Cups()");
//    }
}
class Exercise13{
    public static void main(String[] args) {
        print("Inside main()");
//        print(Cups.cup2);
//        print(Cups.i);
//        Cups.i=1;
//        print(Cups.i);
//        Cup c = new Cup(3);
        Cups.cup1.f(99); // (1)
    }
 static Cups cups1 = new Cups(); // (2)
 static Cups cups2 = new Cups(); // (2)
}
