/*
Exercise 5: (1) Create a class with an inner class.
In a separate class, make an instance of the inner class.
 */

public class Excersize5 {
    public static void main(String[] args){
        WithIn w = new WithIn();
        WithIn.Inner i = w.new Inner();
    }
}

class WithIn{ class Inner{ } }
