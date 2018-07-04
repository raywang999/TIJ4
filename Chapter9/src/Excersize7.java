/*
Exercise 7: (2) Create a class with a private field and a private method.
Create an inner class with a method that modifies the outer-class field
and calls the outer-class method. In a second outer-class method, create
an object of the inner class and call its method, then show
the effect on the outer-class object.
 */
/*
Exercise 12: (1) Repeat Exercise 7 using an anonymous inner class.
 */

public class Excersize7 {
    private int i = 0;
    private void test(){System.out.println(i);}
    class Inner{
        void mod(){
            i++;
            test();
        }
    }
    abstract class Inner2{abstract void mod();}
    public Inner2 getInner2(){
        return new Inner2() {
            @Override
            public void mod() {
                int i = 0;
            }
        };
    }
    public static void main(String[] args){
        Excersize7 e = new Excersize7();
        Excersize7.Inner i = e.new Inner();
        i.mod();
        System.out.println("version 2");
        e.getInner2().mod();
        Inner2 a = e.getInner2();
    }
}
