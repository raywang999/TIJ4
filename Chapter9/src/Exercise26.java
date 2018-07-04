/*
Exercise 26: (2) Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
 */

public class Exercise26 {
    class Inner extends HasInner.Inner{
        Inner(HasInner hi){
            hi.super(1);
        }
    }
    public static void main(String[] args){
        HasInner hasinner = new HasInner();
        Exercise26 exc26 = new Exercise26();
        Exercise26.Inner exc26i = exc26.new Inner(hasinner);
    }
}

class HasInner{
    class Inner{
        Inner(int i){}
    }
}
