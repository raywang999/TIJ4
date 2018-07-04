/*
Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner.
In main( ), create and initialize a reference to an Inner.

Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field
(initialized by the constructor), and Inner has a toString( ) that displays
this field. Create an object of type Inner and display it.
 */
public class Exercise1 {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.getIn();
        System.out.println(i);
    }
}

class Outer{
    private String feild = "Im a field";
    class Inner{
        public String toString(){return feild;}
    }
    Inner getIn(){return new Inner();}
}
