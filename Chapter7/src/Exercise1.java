/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Demonstrate
that an instance of each type can be upcast to Cycle via a ride( ) method.
 */
/*
Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( )
method to Unicycle and Bicycle, but not to Tricycle. Create instances of all
three types and upcast them to an array of Cycle. Try to call balance( ) on
each element of the array and observe the results. Downcast and call
balance( ) and observe what happens.
 */
class Cycle{
//    protected int wheels;
    void pedal(int i){ }
    void ride(Cycle c,int i){
        c.pedal(10);
        System.out.println("Riding a " + c);
        int wheels = wheels(i);
        System.out.println("wheels : " + wheels);
    }
    int wheels(int i){
        return i;
    }
}

class Unicycle extends Cycle{
    Unicycle() {
        ride(this, 1);
    }
    void balance(){}
}

class Bicycle extends Cycle{
    Bicycle() {
        ride(this, 2);
    }
    void balance(){}
}

class Tricycle extends Cycle{
    Tricycle(){
        ride(this, 3);
    }
}

public class Exercise1 {
    public static void main(String[] args){
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        u.ride(u, 1);
        b.ride(b, 2);
        t.ride(t, 3);
        Cycle[] cycles = {
            new Unicycle(),
            new Bicycle(),
            new Tricycle()
        };
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//!        ((Tricycle)cycles[2]).balance(); //hopeless
    }
}
