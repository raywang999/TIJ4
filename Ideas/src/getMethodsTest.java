import java.lang.reflect.*;
import java.util.regex.Pattern;

public class getMethodsTest {
    public static void main(String[] args){
        Pattern p = Pattern.compile("\\w+\\.");
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            for (Method m:methods) {
                System.out.println(p.matcher(m.toString()).replaceAll(""));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
