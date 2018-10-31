/*
Exercise 10: (3) Write a program to determine whether an
array of char is a primitive type or a true Object.
 */
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args){
        char[] c = {'a', 'b', 'c'};
        System.out.println(
                c.getClass().getSuperclass()
        );
        char a = 'a';
        //System.out.println(a.getClass().getSuperclass());
        // whereas getClass is unavailable for char a, so we
        // can assume char[] is a true Object
    }
}
