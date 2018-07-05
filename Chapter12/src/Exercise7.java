/*
Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource,
write and test a regular expression that checks a sentence to see that it begins
with a capital letter and ends with a period.
 */
package Chapter12.src;

import java.util.regex.*;

public class Exercise7 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("^\\p{Upper}.*\\.\n?$");
        String example = "Example that works.\n";
        Matcher exampleMatcher = p.matcher(example);
        for (String s: args) {
            Matcher m = p.matcher(s);
            System.out.format("Does '%s' start with a capital letter and end with a period? %s\n"
                    ,s, ((m.matches()) ? "yes, it does":"no, it doesn't"));
        }
        System.out.println(exampleMatcher.matches());
    }

}
