import java.util.*;

public class CentralTendency {
    void mean(int[] data){
        int count = 0;
        for (int i:data) {
            count += i;
        }
        System.out.println(count/data.length);
    }
    void median(int[] input){
        List<Integer> data = new ArrayList<>();
        for (int i:input) {
            data.add(i);
        }
        Collections.sort(data);
        if (data.size()%2!=0){
            System.out.println(data);
        }
    }
    void mode(int[] data){
        Map<Integer,Integer> m = new HashMap<>();
        for (int i:data) {
            Integer freq = m.get(i);
            m.put(i, freq == null? 1 : freq+1);
        }
    }
}
