/*
Exercise 23: (4) Starting with Statistics.java, create a program that runs the test repeatedly and
looks to see if any one number tends to appear more than the others in the results.
 */
import java.util.*;

public class Excersize23 {
    void test(Map<Integer, Integer> map) {
        Random rand = new Random(47);
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
    }
    void trendTest(Map<Integer, Integer> map) {
        for (int i : map.keySet()) {
            for (int it : map.values()) {
                if (map.get(i) >= 200 + it)
                    System.out.println(i + " appears at least 200 times more than the others");
            }
        }
        System.out.println("no outliers");
    }
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        Excersize23 exc23 = new Excersize23();
        exc23.test(m);
        exc23.test(m);
        exc23.test(m);
        exc23.trendTest(m);
    }
}
