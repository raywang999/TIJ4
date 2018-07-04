/*
Exercise 31: (3) Modify polymorphism/shape/RandomShapeGenerator.java to make it Iterable.
You’ll need to add a constructor that takes the number of elements that you want the
iterator to produce before stopping. Verify that it works.
 */
import polymorphism.shape.*;

import java.util.*;

public class Excersize31 {
    public static void main(String[] args){
        RandomShapeGenerator rsg = new RandomShapeGenerator(10);
        Iterator<Shape> it = rsg.iterator();
        while (it.hasNext()) {
            it.next().draw();
        }
        System.out.println("\nUsing foreach: ");
        for (Shape s: rsg) {
            s.draw();
        }
    }
}
