/*
Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.Java,
count and display the number of vowels in each input word,
and also display the total number of vowels in the input file.

Exercise 20: (3) Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
 */
package Chapter10.src;
import net.mindview.util.*;

import java.util.*;

public class Excersize16 {
    void countVowels(Set<String> st){
        Set<Character> v = new HashSet<>();
        Collections.addAll(v,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int total = 0;
        for (String s: st) {
            int count = 0;
            for (char c: s.toCharArray()) {
                if (v.contains(c)){
                    total++;
                    count++;
                }
            }
            System.out.print(s + ": ");
            System.out.println(count);
        }
        System.out.println("total: " + total);
    }
    void trackVowels(Set<String> st){
        Set<Character> v = new HashSet<>();
        Collections.addAll(v,
                'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        Iterator<Character> it = v.iterator();
        while (it.hasNext()) {
            int count = 0;
            char vow = it.next();
            for (String s : st) {
                for (char c : s.toCharArray()) {
                    if (c == vow)
                        count++;
                }
            }
            System.out.println("There are/is "+count+" case/s of "+vow);
        }
    }
    public static void main(String[] args){
        Set<String> words = new TreeSet<String>(
                new TextFile("word.txt", "\\W+"));
        Excersize16 exc16 = new Excersize16();
        exc16.countVowels(words);
        exc16.trackVowels(words);
    }
}
