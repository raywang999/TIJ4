/*
Exercise 9: (5) Modify the previous exercise so that it uses
Class.getDeclaredFields( ) to also display information about
the fields in a class.
 */
import java.lang.reflect.Field;

class d{}
class e extends d{int i;}
class f extends e{int a = 0;}
class g extends f{double d = 0.19234;}

public class Exercise9 {
    public static void rPA(Object o){
        System.out.println("Start at "+o);
        while(o.getClass().getSuperclass()!=null){
            for(Field f: o.getClass().getDeclaredFields())
                System.out.println("Contains field: " + f);
            o=o.getClass().getSuperclass();
            System.out.println("Extends: " + o);
            try {
                o = ((Class)o).newInstance();
            } catch (Exception e){
                System.out.println("Abstract class error");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args){
        Exercise9.rPA(new g());
    }
}
