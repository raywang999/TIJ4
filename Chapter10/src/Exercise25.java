/*
Exercise 25: (3) Create a Map<String,ArrayList<Integer>>.
Use net.mindview.TextFile to open a text file and read it
in a word at a time (use "\\W+" as the second argument to
the TextFile constructor). Count the words as you read them in,
and for each word in the file, record in the ArrayList<Integer>
the word count associated with that word—this is, in effect,
the location in the file where that word was found.

Exercise 26: (4) Take the resulting Map from the previous exercise and
re-create the order of the words as they appeared in the original file.
 */
import net.mindview.util.*;
import java.util.*;

public class Exercise25 {
    public static void main(String[] args){
        Map<String, ArrayList<Integer>> m = new LinkedHashMap<>();
        List<String> ls = new LinkedList<>(
                new TextFile("word.txt", "\\W+")
        );
        int scount = 0;
        for (String s:ls) {
            int ccount = 0;
            scount++;
            //System.out.println("scount is " + scount);
            for (char c:s.toCharArray()) {
                ccount++;
            }
            //System.out.println("ccount is now " + ccount);
            ArrayList<Integer> lTemp = new ArrayList<>();
            lTemp.add(ccount);
            if (m.containsKey(s)){
                //System.out.println("if before" + m);
                m.get(s).add(scount);
                //System.out.println("if" + m);
            }
            else {
                lTemp.add(scount);
                //System.out.println("else" + m);
                //System.out.println("map is " + m);
                m.put(s, lTemp);
            }
            //System.out.println("map is now " + m);
        }
        System.out.println("First number is word count, rest are word positions");
        System.out.println(m);
    }
}
