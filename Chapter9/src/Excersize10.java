/*
Exercise 10: (1) Repeat the previous exercise but
define the inner class within a scope within a method.
 */

public class Excersize10 {
    void murloc(boolean b){
        if(b){
            class Murloc implements Animal{
                public void grow(){System.out.println("growing murloc");}
            }
            Murloc m = new Murloc();
            m.grow();
        }
    }
    public void grow(){murloc(true);}
    public static void main(String[] args){
        Excersize10 e = new Excersize10();
        e.grow();
    }
}

interface Animal{void grow();}
