//: strings/InfinteRecursion2.java
// Accidental recursion.
// {RunByHand}
import java.util.*;

public class InfinteRecursion2 {
    public String toString() {
        return " InfinteRecursion2 address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        List<InfinteRecursion2> v =
                new ArrayList<>();
        for(int i = 0; i < 10; i++)
            v.add(new InfinteRecursion2());
        System.out.println(v);
    }
} ///:~

