/*
Exercise 20: (5) Look up the interface for java.lang.Class
in the JDK documentation from http://java.sun.com. Write a
program that takes the name of a class as a command-line argument,
then uses the Class methods to dump all the information available for that class.
Test your program with a standard library class and a class you create.
 */
import static net.mindview.util.Print.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.regex.*;

public class Exercise20 {
    public static void superClasses(Class<?> c){
        Class superC = c.getSuperclass();
        if (superC!=null){
            print("Extends: " + superC);
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
            print("Class not found");
            System.exit(0);
        }
        print("Your class: " + c);
        superClasses(c);
        print("Annotation list: ");
        for(Annotation a:c.getAnnotations())
            print("    " + a);
        print("Canonical Name: " + c.getCanonicalName());
        print("Inner classes and interfaces count: " + c.getClasses().length);
        print("Inner classes and interfaces list: ");
        for(Class myC: c.getClasses())
            print("    " + p.matcher(myC.toString()).replaceAll(""));
        print("Class loader: " + c.getClassLoader());
        print("Component type: " + c.getComponentType());
        print("List of constructors: ");
        for (Constructor<?> con: c.getConstructors())
            print("    " + con.getName());
        print("Declared Annotation list: ");
        for(Annotation a:c.getDeclaredAnnotations())
            print("    " + a);
        print("List of Declared classes: ");
        for (Class<?> cl: c.getDeclaredClasses())
            print("    "+cl.getName());
        print("List of Declared constructors: ");
        for (Constructor<?> con: c.getDeclaredConstructors())
            print("    "+con);
        print("List of Declared fields: ");
        for (Field f: c.getDeclaredFields())
            print("    "+f);
        print("List of Declared methods: ");
        for (Method m: c.getDeclaredMethods())
            print("    "+m);
        print(" Class:" + c.getClass());
        print("Enclosing Class: " + c.getEnclosingClass());
        print("Enclosing Constructor: " + c.getEnclosingConstructor());
        print("Enclosing Method: " + c.getEnclosingMethod());
        print("List of Enum constants: ");
        try {
            for (Object o : c.getEnumConstants())
                print("    " + o);
        } catch (NullPointerException e){
            print("null");
        }
        print("List of fields: ");
        for (Field f: c.getFields())
            print("    "+f);
        print("List of generic Interfaces: ");
        for(Type t: c.getGenericInterfaces())
            print("    " + t);
        print("Direct superclass: " + c.getGenericSuperclass());
        print("List of Interfaces");
        for (Class<?> i: c.getInterfaces())
            print("    " + i);
        print("List of methods: ");
        for (Method m: c.getMethods())
            print("    "+m);
        print("modifiers: " + c.getModifiers());
        print("c.getName(): " + c.getName());
        print("c.getPackage" + c.getPackage());
        print("c.getProtectionDomain: " + c.getProtectionDomain());
        print("List of signers: ");
        try {
            for (Object o : c.getSigners())
                print("    " + o);
        } catch (NullPointerException e){
            print("null");
        }
        print("c.getSimpleName: " + c.getSimpleName());
        print("Superclass of C: " + c.getSuperclass());
        print("List of TypeVariables: ");
        for (TypeVariable t: c.getTypeParameters())
            print("    " + t);
    }
}
