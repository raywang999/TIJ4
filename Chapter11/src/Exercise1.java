/*
Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception
inside a try block. Give the constructor for Exception a String argument.
Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there.
 */

public class Exercise1 {
    public static void main(String[] args){
        try{
            throw new Exception("My Message");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("I was here");
        }
    }
}
