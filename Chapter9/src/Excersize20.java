/*
Exercise 20: (1) Create an interface containing a nested class. Implement this interface and create an instance of the nested class.
 */

public class Excersize20 implements In{
    public static void main(String[] args){
        In.Nested i = new In.Nested();
    }
}

interface In{class Nested{}}
