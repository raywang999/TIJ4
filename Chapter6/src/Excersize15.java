/*
Create a class inside a package. Your class should contain a protected method.
Outside of the package, try to call the protected method and explain the results.
Now inherit from your class and call the protected method from inside a method of your derived class.
 */
import Excersize15.test;

public class Excersize15 extends test{
    void test(){
        hi();
    }
    public static void main(String[] args){
        Excersize15 t = new Excersize15();
        t.test();
    }
}