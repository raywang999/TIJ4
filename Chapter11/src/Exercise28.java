/*
Exercise 28: (1) Modify Exercise 4 so that the custom exception class inherits from
RuntimeException, and show that the compiler allows you to leave out the try block.
 */
class MyException2 extends RuntimeException{
    private String s;
    MyException2(String s1){
        s=s1;
    }
    void prints(){System.out.println(s);}
}

public class Exercise28 {
    static void f(){
        System.out.println("Inside f()");
        throw new RuntimeException();
    }
    public static void main(String[] args){
        try {
            throw new MyException("Message");
        }catch (MyException e){
            e.prints();
        }
        f();
    }
}
