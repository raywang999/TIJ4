/*
Exercise 3: (1) Write code to generate and catch an ArraylndexOutOfBoundsException.
 */
/*
Exercise 7: (1) Modify Exercise 3 so that the catch clause logs the results.
 */
/*
Exercise 27: (1) Modify Exercise 3 to convert the exception to a RuntimeException.
 */
import exceptions.*;

public class Exercise3 {
    public static void main(String[] args){
        int[] i = new int[3];
        try {
            for (int a=0; a < 4; a++)
                System.out.println(i[a]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught");
            LoggingExceptions2.logException(e);
            throw new RuntimeException(e);
        }
        catch (RuntimeException e){
            e.printStackTrace(System.out);
        }
    }
}
