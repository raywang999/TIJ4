/*
Exercise 24: (2) Fill a LinkedHashMap with String keys and objects of your choice.
Now extract the pairs, sort them based on the keys, and reinsert them into the Map.
 */
import java.util.*;

public class Exercise24 {
    public static void main(String[] args){
        LinkedHashMap<String, Object> m = new LinkedHashMap<>();
        m.put("Hi", 1001);
        m.put("Myname", "Ray");
        m.put("Something", new Exercise1());
        m.put("Hip", 1.2);
        System.out.println(m);
        Set<String> ss = new TreeSet<>(m.keySet());
        TreeMap<String, Object> mTemp = new TreeMap<>();
        for (String s:ss) {
            Object o = m.get(s);
            m.remove(s);
            mTemp.put(s,o);
        }
        System.out.println("Stage 2" + mTemp);
        Set<String> ssTemp = new TreeSet<>(mTemp.keySet());
        Iterator<String> it = ssTemp.iterator();
        while (it.hasNext()) {
            String s = it.next();
            Object o = mTemp.get(s);
            m.put(s, o);
        }
        mTemp.clear();
        System.out.println(m);
    }
}
