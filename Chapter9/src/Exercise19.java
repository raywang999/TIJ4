/*
Exercise 19: (2) Create a class containing an inner class that
itself contains an inner class. Repeat this using nested classes.
Note the names of the .class files produced by the compiler.
 */

public class Exercise19 {}

class Inn{
    class Room{
        class Table{}
    }
}

class Hotel{
    static class Room{
        static class Table{}
    }
}
