/*
Exercise 10: (2) For the phrase "Java now has regular expressions"
evaluate whether the following expressions will find a match:

^Java
\Breg.* n.w\s+h(a|i)s s?
s*
s+
s{4}
S{1}.
s{0,3}
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {
    public static void main(String[] args){
        for (String regex: new String[]{"^Java","\\Breg.* n.w\\s+h(a|i)s s?","s*","s+","s{4}","S{1}.","s{0,3}"}) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher("Java now has regular expressions");
            System.out.println("Regular expressions is: " + regex);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
