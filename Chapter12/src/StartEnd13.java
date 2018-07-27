/*
Exercise 13: (2) Modify StartEnd.java so that it uses Groups.POEM as input,
but still produces positive outputs for find( ), lookingAt( ) and matches( ).
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static net.mindview.util.Print.print;

public class StartEnd13 {
    public static String input = Groups12.POEM;
    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex) { this.regex = regex; }
        void display(String message) {
            if(!regexPrinted) {
                print(regex);
                regexPrinted = true;
            }
            print(message);
        }
    }
    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find())
            d.display("find() '" + m.group() +
                    "' start = "+ m.start() + " end = " + m.end());
        if(m.lookingAt()) // No reset() necessary
            d.display("lookingAt() start = "
                    + m.start() + " end = " + m.end());
        if(m.matches()) // No reset() necessary
            d.display("matches() start = "
                    + m.start() + " end = " + m.end());
    }
    public static void main(String[] args) {
        for(String in : input.split("\n")) {
            print("input : " + in);
            for(String regex : new String[]{"\\w*ere\\w*",
                    "\\w*ever", "T\\w+", "The.*?."})
                examine(in, regex);
        }
    }
} /* Output:
input : Twas brillig, and the slithy toves
T\w+
find() 'Twas' start = 0 end = 4
lookingAt() start = 0 end = 4
input : Did gyre and gimble in the wabe.
input : All mimsy were the borogoves,
\w*ere\w*
find() 'were' start = 10 end = 14
input : And the mome raths outgrabe.
input :
input : Beware the Jabberwock, my son,
input : The jaws that bite, the claws that catch.
T\w+
find() 'The' start = 0 end = 3
lookingAt() start = 0 end = 3
input : Beware the Jubjub bird, and shun
input : The frumious Bandersnatch.
T\w+
find() 'The' start = 0 end = 3
lookingAt() start = 0 end = 3
*///:~

