/*
Exercise 28: (2) Fill a PriorityQueue (using offer( )) with
Double values created using java.util.Random, then remove the
elements using poll( ) and display them.
 */
import java.util.*;

public class Exercise28 {
    public static void main(String[] args){
        Queue<Double> q = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++)
            q.offer(rand.nextDouble());
        while (q.peek()!=null)
            System.out.println(q.poll());
    }
}
