/*
Exercise 7: (3) Modify SweetShop.java so that each type of object creation
is controlled by a command-line argument. That is, if your command line is
"Java Sweetshop7 Candy," then only the Candy object is created. Notice how
you can control which Class objects are loaded via the commandline argument.
 */
import static net.mindview.util.Print.print;

class Candy {
  static { print("Loading Candy"); }
}

class Gum {
  static { print("Loading Gum"); }
}

class Cookie {
  static { print("Loading Cookie"); }
}

public class SweetShop7 {
  public static void main(String[] args) {	
    print("inside main");
    for(String s: args) {
      try {
        Class.forName(s);
      } catch (ClassNotFoundException e) {
        System.out.println("Class not found");
      }
    }
  }
}
