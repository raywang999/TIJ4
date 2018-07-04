/*
Exercise 8: (2) Determine whether an outer class has
access to the private elements of its inner class.
 */

public class Excersize8 {
    class Inner{
        private int i = 0;
        private void hi(){System.out.println("hi");}
    }
    void test(){
        Inner i = new Inner();
        i.hi();
        i.i++;
        System.out.println(i.i);
    }
    public static void main(String[] args){
        Excersize8 e = new Excersize8();
        e.test();
    }
}
