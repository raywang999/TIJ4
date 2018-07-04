/*
Exercise 24: (3) Add a dispose( ) method to the FailingConstructor class
and write code to properly use this class.
 */
import java.util.Random;

class FailingConstructor3 {
    FailingConstructor3() throws Exception {
        Random rand = new Random();
        if (rand.nextInt(2) ==0)
            throw new Exception();
    }

    void dispose(){
        System.out.println("Disposed");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor3 fc = new FailingConstructor3();
            try {
                //fc stuff
            } finally {
                fc.dispose();
            }
        } catch (Exception e){
            System.out.println("construction failed");
        }
    }
}

public class Exercise24 {
    public static void main(String[] args){
        FailingConstructor.main(args);
    }
}

