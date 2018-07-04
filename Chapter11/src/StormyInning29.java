/*
Exercise 29: (1) Modify all the exception types in Stormylnning.java so that they
extend RuntimeException, and show that no exception specifications or try blocks are necessary.
Remove the ‘//!’ comments and show how the methods can be compiled without specifications.
 */
//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException29 extends RuntimeException {}
class Foul29 extends BaseballException29 {}
class Strike29 extends BaseballException29 {}

abstract class Inning29 {
    public Inning29() {}
    public void event() {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat();
    public void walk() {} // Throws no checked exceptions
}

class StormException29 extends RuntimeException {}
class RainedOut29 extends StormException29 {}
class PopFoul29 extends Foul29 {}

interface Storm29 {
    public void event();
    public void rainHard();
}

public class StormyInning29 extends Inning29 implements Storm29 {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning29(){}
    public StormyInning29(String s){}
    // Regular methods must conform to base class:
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard(){}
    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event(){}
    // Overridden methods can throw inherited exceptions:
    public void atBat(){}
    public static void main(String[] args) {
            StormyInning29 si = new StormyInning29();
            si.atBat();
        // Strike not thrown in derived version.
            // What happens if you upcast?
            Inning29 i = new StormyInning29();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
    }
} ///:~
