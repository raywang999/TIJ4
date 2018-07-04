import sun.security.util.Cache;

/*
Exercise 25: (2) Create a three-level hierarchy of exceptions.
Now create a base-class A with a method that throws an exception
at the base of your hierarchy. Inherit B from A and override the
method so it throws an exception at level two of your hierarchy.
Repeat by inheriting class C from B. In main( ), create a C and
upcast it to A, then call the method.
 */
class Disaster extends Exception{}
class Earthquake extends Disaster{}
class PeruEarthquake extends Earthquake{}

class A {
    void f() throws Disaster{
        throw new Disaster();
    }
}

class B extends A{
    void f() throws Earthquake {
        throw new Earthquake();
    }
}

class C extends B{
    void f() throws PeruEarthquake{
        throw new PeruEarthquake();
    }
}

public class Exercise25 {
    public static void main(String[] args){
        A c = new C();
        try {
            c.f();
        }
        catch (PeruEarthquake d){
            d.printStackTrace(System.out);
        }
        catch (Earthquake d){
            d.printStackTrace(System.out);
        }
        catch (Disaster d){
            d.printStackTrace(System.out);
        }
    }
}
