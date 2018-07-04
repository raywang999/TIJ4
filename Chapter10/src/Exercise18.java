/*
Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show ordering by hash code.
Extract the pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */
import static net.mindview.util.Print.*;
import java.util.*;

public class Exercise18 {
    public static void main(String[] args){
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put("obj " + i, i);
        }
        print(map);
        TreeSet<Object> ts = new TreeSet<>();
        ts.addAll(map.keySet());
        print(ts);
        LinkedHashMap<Object, Object> lmap = new LinkedHashMap<>();
        for (Object o:ts)
            lmap.put(o,map.get(o));
        print(lmap);
    }
}
