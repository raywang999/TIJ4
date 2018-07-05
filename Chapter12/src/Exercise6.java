/*
Exercise 6: (2) Create a class that contains int, long, float and double fields.
Create a toString( ) method for this class that uses String.format( ), and
demonstrate that your class works correctly.
 */

public class Exercise6 {
   int i;
   long l;
   float f;
   double d;
    public String toString() {
        return String.format("i is    l is    f is    d is\n----    ----    ----    ----\n %-7d %-7d %-7.5f %-7.1f", i,l,f,d);
    }
    public static void main(String[] args){
        System.out.println(new Exercise6());
    }
}
