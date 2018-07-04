/*
Exercise 9: (2) Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 */

public class Excersize9 {
    static void allExceptions(int i) throws Exception1,Exception2,Exception3{
        if (i<0)
            throw new Exception1();
        if (i==0)
            throw new Exception2();
        if (i>0)
            throw new Exception3();
    }
    public static void main(String[] args){
        try {
            allExceptions(0);
            allExceptions(1);
            allExceptions(-1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Exception1 extends Exception{}
class Exception2 extends Exception{}
class Exception3 extends Exception{}
