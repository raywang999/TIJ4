/*
Exercise 20: (5) Look up the interface for java.lang.Class
in the JDK documentation from http://java.sun.com. Write a
program that takes the name of a class as a command-line argument,
then uses the Class methods to dump all the information available for that class.
Test your program with a standard library class and a class you create.
 */
import static net.mindview.util.Print.*;
import java.lang.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise20 {
    class InnerClass{}
    public static void superClasses(Class<?> c){
        Class superC = c.getSuperclass();
        if (superC!=null){
            print(superC);
            superClasses(superC);
        }
    }
    public static void main(String[] args){
        if (args.length<1){
            print("Usage: class name");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\\w+\\$");
        Class<?> c = null;
        try{
            c=Class.forName(args[0]);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        print("Your class: " + c);
        superClasses(c);
        print("Annotation count: " + c.getAnnotations().length);
        print("Annotation list: ");
        for(Annotation a:c.getAnnotations())
            print(a);
        print("Canonical Name: " + c.getCanonicalName());
        print("Inner classes and interfaces count: " + c.getClasses().length);
        print("Inner classes and interfaces list: ");
        for(Class myC: c.getClasses())
            print(p.matcher(myC.toString()).replaceAll(""));
        print(c.getClassLoader());
    }
}
