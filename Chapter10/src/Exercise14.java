import java.util.*;
/*
Exercise 14: (3) Create an empty LinkedList<Integer>. Using a ListIterator, add Integers
to the List by always inserting them in the middle of the List.
 */
public class Exercise14 {
    public void addMiddle(List<Integer> l, int i){
        ListIterator<Integer> it = l.listIterator(l.size()/2);
        it.add(i);
    }
    public static void main(String[] args) {
        Exercise14 exc14 = new Exercise14();
//        Random rand = new Random(47);
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            exc14.addMiddle(l, i);
        System.out.println(l);
    }
}
