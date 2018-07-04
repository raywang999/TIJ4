/*
Exercise 8: (1) Write a class with a method that throws an exception of the type
created in Exercise 4. Try compiling it without an exception specification to see
what the compiler says. Add the appropriate exception specification. Try out your
class and its exception inside a try-catch clause.
 */
public class Excersize8 {
    static void f() throws MyException{
        throw new MyException("asdf");
    }
    public static void main(String[] args){
        try {
            f();
        }catch (MyException e){
            e.prints();
        }
    }
}

/*
Error:(9, 9) java: unreported exception MyException; must be caught or declared to be thrown
 */
