/*
Exercise 11: (4) Create a class with a method that takes a String argument
and produces a result that swaps each pair of characters in that argument.
Adapt the class so that it works with interfaceprocessor.Apply.process( ).
 */

import static net.mindview.util.Print.*;
import interfaces.interfaceprocessor.*;

import java.util.Random;

public class test {
    public static void main(String[] args){
        Tester.progress();
        print(Tester.i);
        Random rand = new Random();
        for (int i=0;i<100;i++)
        System.out.println(rand.nextInt(2));
    }
}

interface Tester{
    int i = 0;
    void process();
    static void progress(){print("hi");print(i);};
}
