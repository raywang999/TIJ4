/*
Exercise 19: (2) Repeat the previous exercise with a HashSet and LinkedHashSet.
 */

import java.util.*;

import static net.mindview.util.Print.print;

public class Exercise19 {
    public static void main(String[] args){
        HashSet<Object> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Obj " + i);
        }
        print("Filled Set " + set);
        TreeSet<Object> ts = new TreeSet<>();
        ts.addAll(set);
        print("Sorted Set " + ts);
        LinkedHashSet<Object> lset = new LinkedHashSet<>();
        for (Object o:ts)
            lset.add(o);
        print("Linked Set " + lset);
    }
}
