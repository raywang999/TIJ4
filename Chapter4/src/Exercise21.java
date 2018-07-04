/*
Create an enum of the least-valuable six
types of paper currency. Loop through the values( )
and print each value and its ordinal( ).
 */
//Exercise22
/*
Write a switch statement for the enum
in the previous example. For each case,
output a description of that particular currency.
 */
import static net.mindview.util.Print.*;
enum Money {
   DOLLAR1, DOLLAR5, DOLLAR10, DOLLAR20 ,DOLLAR50 ,DOLLAR100
}

public class Exercise21 {
    Money billType;
    public static void main(String[] args) {
        for (Money billType : Money.values()) {
            System.out.print("This bill's worth ");
            switch (billType) {
                case DOLLAR1:
                    print("1 buck");
                    break;
                case DOLLAR5:
                    print("5 buck");
                    break;
                case DOLLAR10:
                    print("10 buck");
                    break;
                case DOLLAR20:
                    print("20 buck");
                    break;
                case DOLLAR50:
                    print("50 buck");
                    break;
                case DOLLAR100:
                    print("100 buck");
                    break;
                default:
                    print("100 buck");
                    break;
            }
        }
    }
}
