/*
Exercise 3: (2) Create a base class with an abstract print( ) method that
is overridden in a derived class. The overridden version of the method
prints the value of an int variable defined in the derived class. At
the point of definition of this variable, give it a nonzero value.
In the base-class constructor, call this method. In main( ), create an object
of the derived type, and then call its print( ) method. Explain the results.
 */
abstract class AbsPrint{
    abstract protected void print();
//    static private AbsPrintable absp = new AbsPrintable();
    AbsPrint(){print();}
}

class AbsPrintable extends AbsPrint{
    private int i = 1;
    @Override protected void print(){ System.out.println(i); }
}

public class Excersize3 {
    public static void main(String[] args){
        /*
        * Storage for AbsPrintable ap is allocated
        * Base-class constructor AbsPrint() is called
        * AbsPrintable.print() is called in AbsPrint() (ap.i=0)
        * Member initializers are called in order (ap.i = 1)
        * Body of AbsPrintable is called
         */
        AbsPrintable ap = new AbsPrintable();
        ap.print();
    }
}
