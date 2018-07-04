/*
Exercise 18: (2) Create a Cycle interface, with implementations Unicycle,
Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
 */
/*
Exercise 16: (1) Modify the solution to Exercise 18 from the
Interfaces chapter to use anonymous inner classes.
 */
import static net.mindview.util.Print.*;

public class Excersize18 {
    public void ride(CycleFactory factory){
        Cycle c = factory.getCycle();
        while (c.moving());
    }
    public static void main(String[] args){
        Excersize18 exc18 = new Excersize18();
        //new Bicycle();
        //new Bicycle();
        //Bicycle b = new Bicycle();
        //exc18.ride(new BicycleFactory());
        //exc18.ride(new UnicycleFactory());
        //exc18.ride(new TricycleFactory());
        exc18.ride(Bicycle.factory);
        exc18.ride(Tricycle.factory);
        exc18.ride(Unicycle.factory);
    }
}

interface Cycle{
    int maxLength = 4;
    boolean moving();
    void whoami();
}
interface CycleFactory{ Cycle getCycle(); }

class Bicycle implements Cycle{
    private Bicycle(){}
    private int id = 0;
    private int i = 0;
    public boolean moving(){
        print("Bicycle is Moving");
        return ++i != maxLength;
    }
    public void whoami(){ print("Bicycle"); }
    public static CycleFactory factory =
            new CycleFactory(){
            public Cycle getCycle(){
                return new Bicycle();
            }
    };
}
/*class BicycleFactory implements CycleFactory{
    public Cycle getCycle() { return new Bicycle(); }
}*/

class Tricycle implements Cycle{
    private Tricycle(){}
    private int id = 0;
    private int i = 0;
    public boolean moving(){
        print("Tricycle is Moving");
        return ++i != maxLength;
    }
    public void whoami(){ print("Tricycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() {
                    return new Tricycle();
                }
            };
}
/*class TricycleFactory implements CycleFactory{
    public Cycle getCycle() { return new Tricycle(); }
}*/

class Unicycle implements Cycle{
    private Unicycle(){}
    private int id = 0;
    private int i = 0;
    public boolean moving(){
        print("Unicycle is Moving");
        return ++i != maxLength;
    }
    public void whoami(){ print("Unicycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() {
                    return new Unicycle();
                }
            };
}
/*class UnicycleFactory implements CycleFactory{
    public Cycle getCycle() { return new Unicycle(); }
}*/
