/*
Exercise 15: (5) Modify JGrep.java to accept flags as arguments
(e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
 */

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep15b {
    static int getFlag(String s){
        switch (s){
            default:
                return 0;
            case "Pattern.CANON_EQ":
                return Pattern.CANON_EQ;
            case "Pattern.CASE_INSENSITIVE":
                return Pattern.CASE_INSENSITIVE;
            case "Pattern.COMMENTS":
                return Pattern.COMMENTS;
            case "Pattern.DOTALL":
                return Pattern.DOTALL;
            case "Pattern.LITERAL":
                return Pattern.LITERAL;
            case "Pattern.MULTILINE":
                return Pattern.MULTILINE;
            case "Pattern.UNICODE_CASE":
                return Pattern.UNICODE_CASE;
            case "Pattern.UNICODE_CHARACTER_CASE":
                return Pattern.UNICODE_CHARACTER_CLASS;
            case "Pattern.UNIX_LINES":
                return Pattern.UNIX_LINES;
        }
    }
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex flags");
            System.exit(0);
        }
        Pattern p;
        if (args.length>2&&getFlag(args[2])!=0) {
                p = Pattern.compile(args[1], getFlag(args[2]));
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
