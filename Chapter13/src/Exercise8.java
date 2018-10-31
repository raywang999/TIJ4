/*
Exercise 8: (5) Write a method that takes an object and
recursively prints all the classes in that object’s hierarchy.
 */
abstract class aa{}

class a extends aa{}

class b extends a{}

class c extends b{}

public class Exercise8 {
    public static void rP(Object o){
        System.out.println("Start at: "+ o);
        while(o.getClass().getSuperclass()!=null){
            o=o.getClass().getSuperclass();
            System.out.println("Extends: " + o);
            try {
                o = ((Class)o).newInstance();
            }catch (InstantiationException e){
                System.out.println("Which is an abstract class so " +
                        "it's ended as an Object");
            }catch (IllegalAccessException e){
                System.out.println("U broke something");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args){
        Exercise8.rP(new c());
    }
}
