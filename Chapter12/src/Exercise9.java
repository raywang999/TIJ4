/*
Exercise 9: (4) Using the documentation for java.util.regex.Pattern as a resource,
replace all the vowels in Splitting.knights with underscores.

Ima assume y is a vowel
 */

public class Exercise9 {
    public static String knights =
    "Then, when you have found the shrubbery, you must " +
    "cut down the mightiest tree in the forest... " +
    "with... a herring!";
    public static void main(String[] args){
        System.out.println(knights.replaceAll("[aeiouâãäåæçèéêëìíîïðñòóôõøùúûüAEIOUyY]", "_"));
    }
}
