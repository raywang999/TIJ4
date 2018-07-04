/*
Exercise 4: (3) Create an abstract class with no methods. Derive a class and add a method.
Create a static method that takes a reference to the base class, downcasts it to the
derived class, and calls the method. In main( ), demonstrate that it works.
Now put the abstract declaration for the method in the base class,
thus eliminating the need for the downcast.
 */
abstract class Empty{}

class Box extends Empty{ void hi(){ System.out.println("hi");} }

abstract class Empty2{
    abstract void hi();
}

class Box2 extends Empty2{
    void hi(){System.out.println("Box2hi");}
}

public class Exercise4 {
    static void high(Empty empty){
        ((Box)empty).hi();
    }
    public static void main(String[] args){
        Empty empty = new Box();
        Exercise4.high(empty);
        Box2 present = new Box2();
        present.hi();
    }
}
