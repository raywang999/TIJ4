/*
Exercise 20: (3) Modify StormyInning.java by adding an
UmpireArgument exception type and methods that throw this exception. 
Test the modified hierarchy.
 */
//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Throws no checked exceptions
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

class UmpireArgument extends Exception{}
class ArguedOut extends UmpireArgument{}
class ArguedIn extends UmpireArgument{}
class StormyArguedIn extends ArguedIn{}
class UnreasonableArgument extends UmpireArgument{}

interface Umpire {
    public void result() throws ArguedOut, ArguedIn;
    public void picky() throws UnreasonableArgument;
    public void event() throws UmpireArgument;
    public void flexible() throws Exception;
}

public class Exercise20 extends Inning implements Storm, Umpire{
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public Exercise20()
            throws RainedOut, BaseballException {}
    public Exercise20(String s)
            throws Foul, BaseballException {}
    // Regular methods must conform to base class:
//! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}
    // If the method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {}
    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {}
    //An implemented method can throw exceptions derived from base method exceptions:
    public void result() throws StormyArguedIn{}
    public void flexible() throws UnreasonableArgument, ArguedIn{}
    //! Added exceptions do not overload method:
    //public void result() throws ArguedIn, ArguedOut{}
    //! Implemented method cannot have more than the base class exception/s
//    public void picky() throws UnreasonableArgument, ArguedIn{}
    //It can throw less, same but not more than base-class exceptions:
    public void picky(){}
    public static void main(String[] args) {
        try {
            Exercise20 si = new Exercise20();
            si.atBat();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new Exercise20();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
} ///:~
