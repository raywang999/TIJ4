/*
Exercise 15: (4) Implement a new PetCreator using Registered Factories,
and modify the Pets Facade so that it uses this one instead of the other two.
Ensure that the rest of the examples that use Pets .Java still work correctly.

Refer to TIJ4-code/typeinfo/pets/individual15.java
all classes extending Pet had the "public static class Factory" inner class
added (line 7 to 10)
 */

import net.mindview.util.TypeCounter;
import typeinfo.pets.*;


public class PetFactories15{
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for(int i = 0; i < 20; i++) {
            Individual15 in = Individual15.createRandom();
            counter.count(in);
        }
        System.out.println(counter);
    }
}
