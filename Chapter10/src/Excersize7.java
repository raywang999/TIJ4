/*
Exercise 7: (3) Create a class, then make an initialized array of objects of your class.
Fill a List from your array. Create a subset of your List by using subList( ),
then remove this subset from your List.
 */
import static net.mindview.util.Print.*;
import java.util.*;

public class Excersize7 {
    public static void main(String[] args){
        Knife[] knives = new Knife[8];
        for (int i = 0; i<knives.length; i++)
            knives[i] = new Knife();
        List<Knife> kL = new LinkedList<>(Arrays.asList(knives));
        print(kL);
        List sub = kL.subList(0,3);
        print(sub);
        List copy = new ArrayList(sub);
        kL.removeAll(copy);
        print(kL);
        print(copy);
        Iterator<Knife> it = copy.iterator();
        while (it.hasNext())
            print(it);
    }
}

class Knife{}
