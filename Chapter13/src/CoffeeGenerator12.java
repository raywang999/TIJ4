/*
Exercise 12: (3) Use TypeCounter with the CoffeeGenerator.java
class in the Generics chapter.
 */
import generics.coffee.*;
import net.mindview.util.*;

public class CoffeeGenerator12 extends CoffeeGenerator{
    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Coffee.class);
        for(Coffee c: new CoffeeGenerator(10))
            counter.count(c);
        System.out.println(counter);
    }
}
