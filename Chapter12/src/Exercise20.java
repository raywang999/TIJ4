/*
Exercise 20: (2) Create a class that contains int, long, float
and double and String fields. Create a constructor for this class
that takes a single String argument, and scans that string into the
various fields. Add a toString( ) method and demonstrate that your
class works correctly.
 */

import java.util.Scanner;

public class Exercise20 {
    int i;
    long l;
    float f;
    double d;
    String s;
    Exercise20(String in){
        Scanner sc = new Scanner(in);
        i = sc.nextInt();
        l=sc.nextLong();
        d=sc.nextDouble();
        f=sc.nextFloat();
        s=sc.next();
    }
    public String toString(){
        return i + " " + l + " " + d + " " + f + " " + s + " ";
    }
    public static void main(String[] args){
        Exercise20 exc = new Exercise20("1 9000 0.1 1.0912345 urmom");
        System.out.println(exc);
    }
}
