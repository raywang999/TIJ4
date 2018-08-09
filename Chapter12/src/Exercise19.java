/*
Exercise 19: (8) Building on the previous two exercises,
write a program that examines Java source code and produces
all the class names used in a particular program.
 */
import net.mindview.util.*;
import java.util.regex.*;

public class Exercise19 {
    public static void main(String[] args){
        //make sure file is a java source code file
        if (!Pattern.compile(".*\\.java$").matcher(args[0]).find()){
            System.out.println("File must be a java source code file");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\\s?class\\s(\\w+)");
        Matcher m = p.matcher("");
        int index = 0;
        for(String line: new TextFile(args[0])){
            m.reset(line);
            while(m.find()){
                index++;
                System.out.println(index + ": " +
                        m.group(1) + ": " + m.start());
            }
        }
    }
}
