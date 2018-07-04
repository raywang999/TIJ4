/*
Following the form of the example Lunch.java, create a class called
ConnectionManager that manages a fixed array of Connection objects.
The client programmer must not be able to explicitly create Connection objects,
but can only get them via a static method in ConnectionManager.
When the ConnectionManager runs out of objects, it returns a null reference.
Test the classes in main( ).
 */
import Exercise8.*;

public class Exercise8 {
    public static void main(String[] args){
        for (int i = 0; i < 11; i++) {
//            if (ConnectionManager.getConnection() == null)
//                System.out.println("hi");
//            System.out.println("bye");
            ConnectionManager cm = new ConnectionManager();
//            System.out.println(cm);
            cm.getConnection();
        }
    }
}
