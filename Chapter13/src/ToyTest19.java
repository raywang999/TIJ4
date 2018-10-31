//: typeinfo/toys/ToyTest.java
// Testing class Class.
/*
Exercise 19: (4) In ToyTest.java, use reflection to create a
Toy object using the non- default constructor.
 */
import java.lang.reflect.*;
import static net.mindview.util.Print.print;

public class ToyTest19 {
  public static void main(String[] args) {
    try {
      Toy.class.getDeclaredConstructor(int.class).newInstance(1);
    }
    catch(NoSuchMethodException e){
      print("No such method: "+e);
    }
    catch(IllegalAccessException e){
      print("Unable to access: "+e);
    }
    catch(InstantiationException e){
      print("Unable to make: "+e);
    }
    catch(InvocationTargetException e){
      print("Invocation Target problem: "+e);
    }
  }
} /* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~
