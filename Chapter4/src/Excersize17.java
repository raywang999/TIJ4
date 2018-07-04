import java.util.Random;

/*
Create a class with a constructor that takes a String argument.
During construction, print the argument. Create an array of object references to this class,
but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization
messages from the constructor calls are printed.
Excersize 7 and 8
 */
class Pizza{
    Pizza(String s){System.out.println(s);}
}

public class Excersize17 {
    public static void main(String[] args){
        Random rand = new Random(47);
        Pizza[] p = new Pizza[rand.nextInt(20)];
//        Pizza p1 = new Pizza("cheese");
        for (int i=0; i<p.length; i++){
            p[i] = new Pizza("pepperoni");
        }
    }
}
