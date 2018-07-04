/*
Exercise 23: (4) Add a class with a dispose( ) method to the previous exercise.
Modify FailingConstructor so that the constructor creates one of these disposable
objects as a member object, after which the constructor might throw an exception,
after which it creates a second disposable member object. Write code to properly
guard against failure, and in main( ) verify that all possible failure situations
are covered.
 */
import java.util.Random;

class Disposable{
    static int counter;
    final int id = counter++;
    void dispose(){
        System.out.println("Disposing " + id);
    }
}

class FailingConstructor2 {
    Disposable d1;
    Disposable d2;
    FailingConstructor2() throws Exception {
        try {
            d1 = new Disposable();
            try {
                Random rand = new Random();
                if (rand.nextInt(2) == 1)
                    throw new Exception();
                try {
                    d2 = new Disposable();
                } catch (Exception e) {
                    System.out.println("d2 was not created");
                }
            } catch (Exception e) {
                System.out.println("Constructor failed");
                d1.dispose();
            }
        } catch (Exception e){
            System.out.println("D1 was not created");
        }
    }
    public static void main(String[] args) {
        try {
            FailingConstructor2 fc2 = new FailingConstructor2();
            System.out.println(fc2.d1);
            System.out.println(fc2.d2);
        } catch (Exception e) {
            System.out.println("constructor failed");
        }
    }
}

public class Exercise23 {

}
