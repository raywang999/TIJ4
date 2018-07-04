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

public class Excersize8 extends base{
    Excersize8(){
        super(1);
    }
    Excersize8(int i){
        super(1+i);
    }
    public static void main(String[] args){
        Excersize8 exc = new Excersize8();
        Excersize8 exc8 = new Excersize8(1);
    }
}
