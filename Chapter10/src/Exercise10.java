/*
Exercise 10: (2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList
to hold the Rodents and an Iterator to move through the sequence of Rodents.
 */
package Chapter10.src;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class Exercise10 {
    static private RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args){
        List<Rodent> rodents = new ArrayList<Rodent>();
        {
            for (int i = 0; i < 10; i++)
                rodents.add(gen.next());
        }
        Iterator<Rodent> it = rodents.iterator();
        while (it.hasNext()){
            Rodent r = it.next();
            r.eat(); r.scurry();
        }
        gen.shared.showref();
    }
}
