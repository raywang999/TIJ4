/*
Exercise 2: (2) Incorporate a new kind of interface into ToyTest.java
and verify that it is detected and displayed properly.
 */
import static net.mindview.util.Print.print;

interface Speaks{}

class Buzz extends FancyToy implements Speaks{Buzz(){super();}}

public class ToyTest2 {
    static void printInfo(Class cc) {
    print("Class name: " + cc.getName() +
      " is interface? [" + cc.isInterface() + "]");
    print("Simple name: " + cc.getSimpleName());
    print("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("Buzz");
    } catch(ClassNotFoundException e) {
      print("Can't find Buzz");
      System.exit(1);
    }
    printInfo(c);	
    for(Class face : c.getInterfaces())
        printInfo(face);
    Class up = c.getSuperclass();
    Object obj = null;
    try {
        // Requires default constructor:
        obj = up.newInstance();
    } catch(InstantiationException e) {
        print("Cannot instantiate");
        System.exit(1);
    } catch(IllegalAccessException e) {
      print("Cannot access");
      System.exit(1);
    }
    printInfo(obj.getClass());
  }
} /* Output:
Class name: Buzz is interface? [false]
Simple name: Buzz
Canonical name : Buzz
Class name: Speaks is interface? [true]
Simple name: Speaks
Canonical name : Speaks
Class name: FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : FancyToy
*///:~
