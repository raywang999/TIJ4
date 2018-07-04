/*
Exercise 23: (4) Create an interface U with three methods.
Create a class A with a method that produces a reference to a U by building an anonymous inner class.
Create a second class B that contains an array of U.
B should have one method that accepts and stores a reference to a U in the array,
a second method that sets a reference in the array (specified by the method argument) to null,
and a third method that moves through the array and calls the methods in U.
In main( ), create a group of A objects and a single B.
Fill the B with U references produced by the A objects.
Use the B to call back into all the A objects.
Remove some of the U references from the B.
 */

public class Excersize23 {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new A();
        B b = new B(4);
        for (int i = 0; i < 4; i+=2) {
            b.storeU(a1.getU());
            b.storeU(a2.getU());
        }
        b.callU();
        for (int i = 0; i < 4; i+=2)
            b.nullU(i);
        b.callU();
    }
}

interface U {
    void func1();
    void func2();
    void func3();
}

class A {
    U getU(){return new U() {
        public void func1() {System.out.println("func1");}
        public void func2() {System.out.println("func2");}
        public void func3() {System.out.println("func3");}
    };}
}

class B{
    U[] items;
    B(int length){items = new U[length];}
    int i = 0;
    void storeU(U u){items[i]=u; i++;}
    void nullU(int i){items[i]=null;}
    void callU(){
        for (U u : items) {
            u.func1();
            u.func2();
            u.func3();
        }
    }
}
