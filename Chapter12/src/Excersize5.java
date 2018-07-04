/*
Exercise 5: (5) For each of the basic conversion types in the above table,
write the most complex formatting expression possible. That is, use all the
possible format specifiers available for that conversion type.
 */

import java.math.BigInteger;
import java.util.Formatter;

public class Excersize5 {
    public static void main(String[] args) {
        Formatter format = new Formatter(System.out);

        char u = 'c';
        format.format("char can be %5s, %5S, %5c, %5C, %5b %5B, %5h, %5H" ,u,u,u,u,u,u,u,u);

        char u = 'c';
        format.format("char can be %5s, %5S, %5c, %5C, %5b %5B, %5h, %5H" ,u,u,u,u,u,u,u,u);

    }
}
