/*
Exercise 27: (2) Write a class called Command that contains a String and has a method operation( )
that displays the String. Write a second class with a method that fills a Queue with Command objects
and returns it. Pass the filled Queue to a method in a third class that consumes the
objects in the Queue and calls their operation( ) methods.
 */

import java.util.LinkedList;
import java.util.Queue;

public class Excersize27 {
    void consume(Queue<Command> q){
        while (q.peek()!=null)
            q.remove().operation();
    }
    public static void main(String[] args){
        Queue<Command> q = new LinkedList<>();
        Filler f = new Filler();
        f.fill(q,10);
        Excersize27 exc27 = new Excersize27();
        exc27.consume(q);
        System.out.println("Done" + q);
    }
}

class Command{
    private String s;
    Command(String arg){s=arg;}
    void operation(){System.out.println(s);}
}

class Filler{
    Queue<Command> fill(Queue<Command> q, int bound){
        for (int i = 0; i<bound; i++)
            q.add(new Command("Command # " + i));
        return q;
    }
}
