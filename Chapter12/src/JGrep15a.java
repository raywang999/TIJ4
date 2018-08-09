/*
Exercise 15: (5) Modify JGrep.java to accept flags as arguments
(e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
in this file, it will be using the things like "(?i)" etc,
but can compile multiple flags
*/

import java.util.regex.*;
import net.mindview.util.*;

public class JGrep15a {
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex flags");
            System.exit(0);
        }
        Pattern p;
        if (args.length>2) {
            StringBuilder s = new StringBuilder();
            for (int i = 2; i <args.length; i++) {
                s.append(args[i]);
            }
            try {
                p = Pattern.compile(s + args[1]);
            } catch (Exception e){
                System.out.println("Invalid Flag, so ignoring flag");
                p=Pattern.compile(args[1]);
            }
        } else
            p = Pattern.compile(args[1]);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
} /* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
