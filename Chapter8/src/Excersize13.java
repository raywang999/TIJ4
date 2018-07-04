/*
Exercise 13: (2) Create an interface, and inherit two new interfaces
from that interface. Multiply inherit a third interface from the second two.
 */

public class Excersize13 {
    public static void main(String[] args){ }
}

interface Int1{}
interface MulInt1 extends Int1 { }
interface MulInt2 extends Int1{ }
interface Int2 extends MulInt1, MulInt2{ }
