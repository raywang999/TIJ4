/*
Exercise 18: (8) Write a program that reads a Java source-code file
(you provide the file name on the command line) and
displays all the string literals in the code.
 */
import net.mindview.util.*;

import java.util.regex.*;

public class Exercise18 {
    public static void main(String[] args){
        //make sure file is a java source code file
        if (!Pattern.compile(".*\\.java$").matcher(args[0]).find()){
            System.out.println("File must be a java source code file");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\".*(?<!\\\\)\"");
        Matcher m = p.matcher("");
        int index = 0;
        int i = 0;
        for(String line: new TextFile(args[0])){
            i++;
            m.reset(line);
            while(m.find()) {
                index++;
                System.out.println(index + ": "
                        + m.group() + ": " + m.start());
            }
        }
    }
}
