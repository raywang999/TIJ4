/*
Create a class inside a package. Your class should contain a protected method.
Outside of the package, try to call the protected method and explain the results.
Now inherit from your class and call the protected method from inside a method of your derived class.
 */
import Exercise15.test;

public class Exercise15 extends test{
    void test(){
        hi();
    }
    public static void main(String[] args){
        Exercise15 t = new Exercise15();
        t.test();
    }
}
