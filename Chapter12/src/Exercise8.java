/*
Exercise 8: (2) Split the string Splitting.knights on the words "the" or “you."
 */

import java.util.Arrays;

public class Exercise8 {
    public static String knights =
    "Then, when you have found the shrubbery, you must " +
    "cut down the mightiest tree in the forest... " +
    "with... a herring!";
    public static void main(String[] args){
        String[] result = knights.split("the|you");
        System.out.println(Arrays.toString(result));
    }
}
