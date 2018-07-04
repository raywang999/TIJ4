import java.util.Random;

/*
Exercise 22: (2) Create a class called FailingConstructor with a constructor that
might fail partway through the construction process and throw an exception.
In main( ), write code that properly guards against this failure.
 */
class FailingConstructor {
    FailingConstructor() throws Exception {
        Random rand = new Random(47);
        if (rand.nextInt() <= 10)
            throw new Exception();
        int i = rand.nextInt();
        System.out.println(i);
    }

    public static void main(String[] args) {
        try {
            FailingConstructor fc = new FailingConstructor();
        } catch (Exception e) {
            System.out.println("constructor failed");
        }
    }
}

public class Excersize22 {
    public static void main(String[] args){
        FailingConstructor.main(args);
    }
}
