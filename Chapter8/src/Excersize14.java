/*
Exercise 14: (2) Create three interfaces, each with two methods.
Inherit a new interface that combines the three, adding a new method.
Create a class by implementing the new interface and also inheriting
from a concrete class. Now write four methods, each of which
takes one of the four interfaces as an argument. In main( ),
create an object of your class and pass it to each of the methods.

Exercise 15: (2) Modify the previous exercise by creating an
abstract class and inheriting that into the derived class.
 */

public class Excersize14 {
    static void Inter1(Inter1 inter1){}
    static void Inter2(Inter2 inter2){}
    static void Inter3(Inter3 inter3){}
    static void MulInter(MulInter Mulinter){}
    public static void main(String[] args){
        All x = new All();
        Inter1(x);
        Inter2(x);
        Inter3(x);
        MulInter(x);
    }
}

interface Inter1{
    void hi();
    void bye();
}
interface Inter2{
    void hi();
    void bye();
}
interface Inter3{
    void hi();
    void bye();
}

interface MulInter extends
        Inter1, Inter2, Inter3{
    void MulInter();
}

abstract class Base{}

class All extends Base
        implements MulInter{
    public void MulInter(){}
    public void hi(){};
    public void bye(){};
}
