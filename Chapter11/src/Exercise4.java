/*
Exercise 4: (2) Create your own exception class using the extends keyword.
Write a constructor for this class that takes a String argument and stores
it inside the object with a String reference. Write a method that displays
the stored String. Create a try-catch clause to exercise your new exception.
 */
class MyException extends Exception{
    private String s;
    MyException(String s1){
        s=s1;
    }
    void prints(){System.out.println(s);}
}

public class Exercise4 {
    public static void main(String[] args){
        try {
            throw new MyException("Message");
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
