/*
Exercise 11: (4) Create a class with a method that takes a String argument
and produces a result that swaps each pair of characters in that argument.
Adapt the class so that it works with interfaceprocessor.Apply.process( ).
 */

import static net.mindview.util.Print.*;
import interfaces.interfaceprocessor.*;

public class Exercise11 {
    public static void main(String[] args){
        Swapper s = new Swapper();
        SwapperAdapter sa = new SwapperAdapter(s);
        String str = "asdf";
        print(s.process("safddod"));
        Apply.process(sa,"asdfeven");
        Apply.process(new SwapperAdapter(new Swapper()),str);
    }
}

class Swapper {
    private static char[] toArray(String s) { return s.toCharArray(); }
    private static String tostring(char[] c){
        String result="";
        for (char a:c) {
            result+=a;
        }
        return result;
    }
    public String name(){return getClass().getSimpleName();}
    public String process(String s) {
        char[] input = Swapper.toArray(s);
        for (int i = 0; i < input.length-1; i+=2) {
            int a = ++i; i--;
            char c = input[i];
            input[i]=input[a];
            input[a]=c;
        }
        return Swapper.tostring(input);
    }
}

class SwapperAdapter implements Processor{
    Swapper swapper;
    SwapperAdapter(Swapper swapper){ this.swapper = swapper; }
    public String process(Object input){ return swapper.process((String)input); }
    public String name(){return getClass().getSimpleName();}
}
