/*
Create a base class with only a non-default constructor,
and a derived class with both a default (no-arg) and non-default constructor.
In the derived-class constructors, call the base-class constructor.
 */
import static net.mindview.util.Print.*;
class base{
    base(int i){
        print("base constructed" + i);
    }
}

public class Exercise8 extends base{
    Exercise8(){
        super(1);
    }
    Exercise8(int i){
        super(1+i);
    }
    public static void main(String[] args){
        Exercise8 exc = new Exercise8();
        Exercise8 exc8 = new Exercise8(1);
    }
}
