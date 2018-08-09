/*
Exercise 16: (5) Modify JGrep.java to accept a directory name or a file name as argument
(if a directory is provided, search should include all files in the directory).
Hint: You can generate a list of file names with:

File[] files = new File(".").listFiles();

I'm going to assume that a file
has to have an extension for this one.
 */
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.io.File;
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep16 {
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep (file or directory) regex");
            System.exit(0);
        }
        //regex to check that it has a file extension
        Matcher a = Pattern.compile("\\.\\w+").matcher(args[0]);
        Pattern p = Pattern.compile(args[1]);
        if (a.find()) {
            int index = 0;
            Matcher m = p.matcher("");
            for(String line : new TextFile(args[0])) {
                m.reset(line);
                while(m.find())
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
            }
        } else {
            File[] files = new File(args[0]).listFiles();
            for (File f : files) {
                int index = 0;
                Matcher m = p.matcher("");
                for(String line : new TextFile(f.toString())) {
                    m.reset(line);
                    while(m.find())
                        System.out.println("File: " + f + " " + index++ + ": " +
                                m.group() + ": " + m.start());
                }
            }
        }
        // Iterate through the lines of the input file:
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
