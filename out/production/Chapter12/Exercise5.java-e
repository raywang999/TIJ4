/*
Exercise 5: (5) For each of the basic conversion types in the above table,
write the most complex formatting expression possible. That is, use all the
possible format specifiers available for that conversion type.
 */

import java.math.BigInteger;
import java.util.Formatter;

public class Excersize5 {
    public static void main(String[] args) {
        Object n = null;
        Formatter format = new Formatter(System.out);

        char u = 'c';
        format.format("%17s %5b, %5B, %15s, %15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n", "char can be",u,u,u,u,u,u,n,n,n,u,u,n,n,n);

        BigInteger i = new BigInteger("50000000000000");
        format.format("%17s %5b, %5B, %15s, %15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n","BigInteger can be" ,i,i,i,i,i,i,i,i,i,n,n,n,n,n);

        int v = 147;
        format.format("%17s %5b, %5B, %15s, %15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n", "int can be" ,v,v,v,v,v,v,v,v,v,n,n,n,n,n);

        double x = 179.136;
        format.format("%17s %5b, %5B, %15s, %15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n", "double can be" ,x,x,x,x,x,x,n,n,n,n,n,x,x,x);

        Excersize5 y = new Excersize5();
        format.format("%17s %5b, %5B, %15.15s, %15.15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n", "class can be" ,y,y,y,y,y,y,n,n,n,n,n,n,n,n);

        Boolean b = false;
        format.format("%17s %5b, %5B, %15.15s, %15.15S, %8h, %8H, %15d, %12x, %12X, %4c, %4C, %10f, %12e, %6E\n", "class can be" ,b,b,b,b,b,b,n,n,n,n,n,n,n,n);
    }
}
