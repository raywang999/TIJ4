/*
(1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an
interface
 */
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

interface Rodent{
    Shared shared = new Shared();
    abstract void scurry();/*{print("Rodent.scurry");}*/
    abstract void eat();/*{print("Rodent.eat");}*/
    static int printinit(String s){print(s); return 0;}
    int i = printinit("Rodent.i initiated");
    int a = printinit("Rodent.a initiated");
    int x = printinit("static Rodent.x initiated");
}

class Mouse implements Rodent{
    private Shared shared = new Shared();
    Mouse(Shared shared){
        print("Mouse()");
        this.shared=shared;
        shared.addRef();
    }
    public void scurry(){print("Mouse.scurry"); }
    public void eat(){print("Mouse.eat");}
    int b = Rodent.printinit("Mouse.b initiated");
    int c = Rodent.printinit("Mouse.c initiated");
    static int x = Rodent.printinit("static Mouse.x initiated");
}

class Gerbil implements Rodent{
    private Shared shared = new Shared();
    Gerbil(Shared shared){
        print("Gerbil()");
        this.shared=shared;
        shared.addRef();
    }
    public void scurry(){print("Gerbil.scurry"); }
    public void eat(){print("Gerbil.eat");}
    int d = Rodent.printinit("Gerbil.d initiated");
    int e = Rodent.printinit("Gerbil.e initiated");
    static int x = Rodent.printinit("static Gerbil.x initiated");
}

class Chipmunk implements Rodent{
    private Shared shared = new Shared();
    Chipmunk(Shared shared){
        print("Chipmunk()");
        this.shared=shared;
        shared.addRef();
    }
    public void scurry(){print("Chipmunk.scurry"); }
    public void eat(){print("Chipmunk.eat");}
    int f = Rodent.printinit("Chipmunk.f initiated");
    int g = Rodent.printinit("Chipmunk.g initiated");
    static int x = Rodent.printinit("static Chipmunk.x initiated");
}

class RandomRodentGenerator{
    private Random rand = new Random();
    Shared shared = new Shared();
    Rodent next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Mouse(shared);
            case 1: return new Gerbil(shared);
            case 2: return new Chipmunk(shared);
//            case 3: return new Shared();
        }
    }
}

public class Exercise7 {
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
