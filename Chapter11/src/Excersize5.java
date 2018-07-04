/*
Exercise 5: (3) Create your own resumption-like behavior using a while loop
that repeats until an exception is no longer thrown.
 */

public class Excersize5 {
    public static void main(String[] args){
        int i = 0;
        while (true){
            try {
                if (i != 10)
                    throw new Exception("i has to be 10");
            }catch (Exception e){
                System.out.println(i);
                if (i<10)
                    i++;
                else if (i>10)
                    i--;
                continue;
            }
            break;
        }
        System.out.println("i is now " + i);
    }
}
