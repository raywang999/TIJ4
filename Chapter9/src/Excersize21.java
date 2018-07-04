/*
Exercise 21: (2) Create an interface that contains a nested class that
has a static method that calls the methods of your interface and displays the results.
Implement your interface and pass an instance of your implementation to the method.
 */

public class Excersize21 {
   public static void main(String[] args){
       Nested.In.Say(new Imp());
   }
}

interface Nested{
    void add();
    void sub();
    void mul();
    void div();
    class In{
        static void Say(Nested n){n.add(); n.sub(); n.mul(); n.div();}
    }
}

class Imp implements Nested{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void sub() {
        System.out.println("sub");
    }

    @Override
    public void mul() {
        System.out.println("mul");
    }

    @Override
    public void div() {
        System.out.println("div");
    }
}
