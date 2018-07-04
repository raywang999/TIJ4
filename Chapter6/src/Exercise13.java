/*
 Create a class with a method that is overloaded three times.
 Inherit a new class, add a new overloading of the method,
 and show that all four methods are available in the derived class.
 */
import static net.mindview.util.Print.*;

class Over{
    void overload(double d){
        print("overloaded(double)");
    }
    void overload(char c){
        print("overloaded(char)");
    }
    void overload(int i){
        print("overloaded(int)");
    }
}

public class Exercise13 extends Over{
    void overload(float f){
        print("overloaded(float)");
    }
    public static void main(String[] args){
        Exercise13 exc = new Exercise13();
        exc.overload(1);
        exc.overload('c');
        exc.overload(1.0);
        exc.overload(3.14f);
    }
}
