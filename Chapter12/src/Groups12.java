/*
Exercise 12: (5) Modify Groups.java to count all of the
unique words that do not start with a capital letter.
 */

import java.util.*;
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Groups12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(?<= )[a-z]\\w+")
                        .matcher(POEM);
        int total = 0;
        Set <String> uniqueWords = new LinkedHashSet<>();
        while(m.find()) {
            for(int j = 0; j <= m.groupCount(); j++)
                printnb("[" + m.group(j) + "]");
            print();
            total++;
            uniqueWords.add(m.group());
        }
        print("In total, there are: "+total + " lower case words");
        print("There are: "+uniqueWords.size()+" unique words which are: "+uniqueWords);
    }
} /* Output:
[the slithy toves][the][slithy toves][slithy][toves]
[in the wabe.][in][the wabe.][the][wabe.]
[were the borogoves,][were][the borogoves,][the][borogoves,]
[mome raths outgrabe.][mome][raths outgrabe.][raths][outgrabe.]
[Jabberwock, my son,][Jabberwock,][my son,][my][son,]
[claws that catch.][claws][that catch.][that][catch.]
[bird, and shun][bird,][and shun][and][shun]
[The frumious Bandersnatch.][The][frumious Bandersnatch.][frumious][Bandersnatch.]
*///:~

