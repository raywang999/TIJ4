/*
Excerisze5:
Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
Inherit a new class called C from A, and create a member of class B inside C.
Do not create a constructor for C. Create an object of class C and observe the results.

Excersize7:
Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
Write a constructor for C and perform all initialization within C’s constructor.
 */
class A{
    A(int i, int a){
        System.out.println("I am A");
    }
}

class B{
    B(int i, int b){ System.out.println("I am B"); }
}

class C extends A{
    C() {
        super(1,1);
        B b = new B(1,1);
    }
}

public class Excersize5 {
    public static void main(String[] args){
        C c = new C();
    }
}
