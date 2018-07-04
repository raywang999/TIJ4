/*
Exercise 9: (4) Modify innerclasses/Sequence.java so that
Sequence works with an Iterator instead of a Selector.
 */
import java.util.*;

public class Exercise9 {
        Collection<Object> items = new LinkedList<>();
        void add(Object o){items.add(o);}
        Iterator iterator(){return items.iterator();}
    public static void main(String[] args){
        Exercise9 exc9 = new Exercise9();
        for (int i = 0; i<10; i++)
            exc9.add(i);
        Iterator it = exc9.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}
