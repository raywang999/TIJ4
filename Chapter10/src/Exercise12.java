/*
Exercise 12: (3) Create and populate a List<Integer>. Create a second List<Integer>
of the same size as the first, and use ListIterators to read elements from the first List
and insert them into the second in reverse order.
(You may want to explore a number of different ways to solve this problem.)
 */
import java.util.*;
import static net.mindview.util.Print.*;

public class Exercise12 {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> l2 = new ArrayList<>(l1.size());
        ListIterator<Integer> it = l1.listIterator(l1.size());
        while (it.hasPrevious())
            l2.add(it.previous());
        print(l1);
        print(l2);
        for (int i = 1; i<101; i++)
            print(i);
    }
}
