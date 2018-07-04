/*
Exercise 30: (2) Modify Human.java so that the exceptions inherit from RuntimeException. 
Modify main( ) so that the technique in TurnOffChecking.java is used to handle the 
different types of exceptions.
 */
//: exceptions/Human.java
// Catching exception hierarchies.

class Annoyance30 extends RuntimeException {}
class Sneeze30 extends Annoyance30 {}

public class Human30 {
    static void Oops(int i) throws Annoyance30, Sneeze30{
        switch (i){
            case 0: throw new Annoyance30();
            case 1: throw new Sneeze30();
            default:
        }
    }
    public static void main(String[] args) {
        // Catch the exact type:
        for (int i = 0; i<2;i++) {
            try {
                System.out.println("For " + i);
                Human30.Oops(i);
            } catch (Sneeze30 s) {
                System.out.println("Caught Sneeze30");
            } catch (Annoyance30 a) {
                System.out.println("Caught Annoyance30");
            }
            // Catch the base type:
        }
    }
} /* Output:
Caught Sneeze30
Caught Annoyance30
*///:~
