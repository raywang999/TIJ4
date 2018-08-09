/*
Exercise 17: (8) Write a program that reads a Java source-code file
(you provide the file name on the command line) and displays all the comments.
 */

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise17 {
    public static void main(String[] args){
        //make sure file is a java source code file
        if (!Pattern.compile(".*\\.java$").matcher(args[0]).find()){
            System.out.println("File must be a java source code file");
            System.exit(0);
        }
        //regex for single line comments
        Pattern s = Pattern.compile("//.*$");
        //regex for double line comments
        Pattern ds = Pattern.compile("/\\*.*");
        Pattern de = Pattern.compile("\\*/");
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher sm = s.matcher("");
        Matcher dsm = ds.matcher("");
        Matcher dem = de.matcher("");
        TextFile t = new TextFile(args[0]);
        for(String line : t) {
            sm.reset(line);
            while(sm.find())
                System.out.println(index++ + ": " +
                        sm.group() + ": " + sm.start());
        }/*xd*/
        System.out.println("\n ------------ Now match " +
                "multiline comments ------------\n");
        int i = 0;
        for(String line : t) {
            i++;
            dsm.reset(line);
            while(dsm.find()) {
                System.out.println(index++ + " starting at char "
                        + dsm.start() + ": \n" + dsm.group());
                dem.reset(line);
                while(!dem.find()){
                    dem.reset(t.toArray()[i].toString());
                    System.out.println(t.toArray()[i++]);
                }
            }
        }
    }
}
