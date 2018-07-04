/*
Exercise 10: (2) Create a class with two methods, f( ) and g( ).
In g( ), throw an exception of a new type that you define. In f( ), call g( ),
catch its exception and, in the catch clause, throw a different exception
(of a second type that you define). Test your code in main( ).
 */
class Exc10MyException1 extends Exception{}
class Exc10MyException2 extends Exception{}
class Exc10MyException3 extends Exception{}

class IHaveTwoMethods{
    void f() throws Exc10MyException1{
        System.out.println("Originating in f()");
        try {
            try{
                g();
            } catch (Exc10MyException2 e){
                System.out.println("caught an exception2");
                e.printStackTrace(System.out);
                System.out.println("creating E10ME");
                Exc10MyException3 E10ME = new Exc10MyException3();
                E10ME.initCause(new Exc10MyException2());
                E10ME.printStackTrace(System.out);
                throw E10ME;
            }
        } catch (Exc10MyException3 e){
            System.out.println("caught E10ME");
            e.printStackTrace(System.out);
        }
    }
    void g() throws Exc10MyException2{
        System.out.println("Originating in g()");
        throw new Exc10MyException2();
    }
}

public class Excersize10 {
    public static void main(String[] args){
        IHaveTwoMethods ihtm=new IHaveTwoMethods();
        try {
            ihtm.f();
        } catch (Exc10MyException1 e) {
            System.out.println("e.printstacktrace in main");
            e.printStackTrace(System.out);
        }
    }
}
