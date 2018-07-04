/*
Exercise 2: (1) Define an object reference and initialize it to null.
Try to call a method through this reference. Now wrap the code in a
try-catch clause to catch the exception.
 */

public class Excersize2 {
    public static void main(String[] args){
        Object o = null;
        try {
            o.getClass();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
