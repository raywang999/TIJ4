/*
Exercise9
Create a class called Root that contains an instance of each of the classes
(that you also create) named Component1, Component2, and Component3. 
Derive a class Stem from Root that also contains an instance of each “component.” 
All classes should have default constructors that print a message about that class.
 */
/*
Exercise10:
Modify the previous exercise so that each class only has non-default constructors.
 */
/*
Exercise12:
Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 */
import static net.mindview.util.Print.*;

class Component1{
//    Component1(){ print("I am Component1"); }
    Component1(int i){
        print("I am Component1");
    }
    void dispose(){ print("dispose Component1"); }
}
class Component2{
//    Component2(){ print("I am Component2"); }
    Component2(int i){
        print("I am Component2");
    }
    void dispose(){ print("dispose Component2"); }
}
class Component3{
    //    Component3(){ print("I am Component3"); }
    Component3(int i){ print("I am Component3"); }
    void dispose(){ print("dispose Component3"); }
}

class Root{
//    Component1 cmp1 = new Component1();
//    Root(){print("I am a Root");}
//    Component3 cmp3 = new Component3();
//    Component2 cmp2 = new Component2();
Root(int i){print("I am a Root");}
    Component1 cmp1 = new Component1(1);
    Component2 cmp2 = new Component2(2);
    Component3 cmp3 = new Component3(3);
    void dispose(){
        print("uprooting Root");
        cmp3.dispose();
        cmp2.dispose();
        cmp1.dispose();
    }
}

class Stem extends Root{
//    Component1 cmp1 = new Component1();
//    Stem(){ print("I am a Stem"); }
//    Component2 cmp2 = new Component2();
//    Component3 cmp3 = new Component3();
    Stem(int i){
        super(i);
        print("I am a Stem");
    }
    Component1 cmp1 = new Component1(1);
    Component2 cmp2 = new Component2(2);
    Component3 cmp3 = new Component3(3);
    void dispose(){
        print("killing stem");
        cmp3.dispose();
        cmp2.dispose();
        cmp1.dispose();
        super.dispose();
    }
}

public class Exercise9 {
    public static void main(String[] args){
//        Stem groot = new Stem();
        Stem groot = new Stem(1);
        try { }
        finally {
            groot.dispose();
        }
    }
}
