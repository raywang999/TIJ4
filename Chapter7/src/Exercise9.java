/*
Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
In the base class, provide methods that are common to all Rodents, and
override these in the derived classes to perform different behaviors
depending on the specific type of Rodent. Create an array of Rodent,
fill it with different specific types of Rodents, and call
your base-class methods to see what happens.

Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of
initialization of the base classes and derived classes. Now add member
objects to both the base and derived classes and show the order in
which their initialization occurs during construction.

Exercise 14: (4) Modify Exercise 12 so that one of the member objects is
a shared object with reference counting, and demonstrate that it works properly.

Chapter8 Exercise7 (1) Change Exercise 9 in the Polymorphism chapter
so that Rodent is an interface
 */
package Chapter7.src;
import java.util.Random;

import static net.mindview.util.Print.*;
class Shared{
    private int refcount = 0;
    private static long counter = 0;
//    private final long id = counter++;
    public void addRef(){refcount++;}
    public void dispose(){
        if (--refcount == 0){
            print("disposing shared");
        }
    }
    public void showref(){print(refcount);}
    public String toString(){
        return "" + refcount;
    }
}

abstract class Rodent{
    private Shared shared = new Shared();
    Rodent(Shared shared) {
        print("Rodent()");
        this.shared = shared;
        shared.addRef();
    }
    abstract void scurry();/*{print("Rodent.scurry");}*/
    abstract void eat();/*{print("Rodent.eat");}*/
    static int printinit(String s){print(s); return 0;}
    int i = printinit("Rodent.i initiated");
    int a = printinit("Rodent.a initiated");
    static int x = printinit("static Rodent.x initiated");
}

class Mouse extends Rodent{
    Mouse(Shared shared){
        super(shared);
        print("Mouse()");
    }
    void scurry(){print("Mouse.scurry"); }
    void eat(){print("Mouse.eat");}
    int b = printinit("Mouse.b initiated");
    int c = printinit("Mouse.c initiated");
    static int x = printinit("static Mouse.x initiated");
}

class Gerbil extends Rodent{
    Gerbil(Shared shared){
        super(shared);
        print("Gerbil()");
    }
    void scurry(){print("Gerbil.scurry"); }
    void eat(){print("Gerbil.eat");}
    int d = printinit("Gerbil.d initiated");
    int e = printinit("Gerbil.e initiated");
    static int x = printinit("static Gerbil.x initiated");
}

class Chipmunk extends Rodent{
    Chipmunk(Shared shared){
        super(shared);
        print("Chipmunk()");
    }
    void scurry(){print("Chipmunk.scurry"); }
    void eat(){print("Chipmunk.eat");}
    int f = printinit("Chipmunk.f initiated");
    int g = printinit("Chipmunk.g initiated");
    static int x = printinit("static Chipmunk.x initiated");
}

class Despereaux extends Mouse{
    Despereaux(Shared shared){
        super(shared);
        print("Despereaux()");
    }
    void scurry(){print("Despereaux.scurry"); }
    void eat(){print("Despereaux.eat");}
    int h = printinit("Despereaux.h initiated");
    int j = printinit("Despereaux.j initiated");
    static int x = printinit("static Despereaux.x initiated");
}

class Eddie extends Gerbil{
    Eddie(Shared shared){
        super(shared);
        print("Eddie()");
    }
    void scurry(){print("Eddie.scurry"); }
    void eat(){print("Eddie.eat");}
    int k = printinit("Eddie.k initiated");
    int l = printinit("Eddie.l initiated");
    static int x = printinit("static Eddie.x initiated");
}

class Alvin extends Chipmunk{
    Alvin(Shared shared){
        super(shared);
        print("Alvin()");
    }
    void scurry(){print("Alvin.scurry"); }
    void eat(){print("Alvin.eat");}
    int m = printinit("Alvin.m initiated");
    int n = printinit("Alvin.n initiated");
    static int x = printinit("static Alvin.x initiated");
}

class RandomRodentGenerator{
    private Random rand = new Random();
    Shared shared = new Shared();
    Rodent next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Despereaux(shared);
            case 1: return new Eddie(shared);
            case 2: return new Alvin(shared);
//            case 3: return new Shared();
        }
    }
}

public class Exercise9 {
    static private RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args){
        Rodent[] r = new Rodent[10];
        {
            for (int i = 0; i < 10; i++){
                r[i]=gen.next();
            }
        }
        for (Rodent rod:r) {
            rod.eat();
            rod.scurry();
        }
        gen.shared.showref();
    }
}
