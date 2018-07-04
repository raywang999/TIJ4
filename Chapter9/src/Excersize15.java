/*
Exercise 15: (2) Create a class with a non-default constructor (one with arguments)
and no default constructor (no "no-arg" constructor).
Create a second class that has a method that returns
a reference to an object of the first class. Create
the object that you return by making an anonymous
inner class that inherits from the first class.
 */
package Chapter9.src;

public class Excersize15 {
    static NoArg getNoArg(){
        return new NoArg(0){};
    }
    public static void main(String[] args){
        NoArg na = new Excersize15().getNoArg();
    }
}

class NoArg{
    NoArg(int i){System.out.println(i);}
}
