/*
Exercise 29: (2) Create a simple class that inherits from
Object and contains no members, and show that you cannot
successfully add multiple elements of that class to a PriorityQueue.
This issue will be fully explained in the Containers in Depth chapter.
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class Exercise29 {
    public static void main(String[] args){
        Queue<Simple> q = new PriorityQueue<>();
        q.offer(new Simple());
        System.out.println("First offer done: " + q);
        System.out.println("Proceeding to second offer: ");
        q.offer(new Simple());
    }
}

class Simple {

}
