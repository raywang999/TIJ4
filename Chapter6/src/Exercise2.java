/*
Inherit a new class from class Detergent. Override
scrub( ) and add a new method called sterilize( ).
 */
public class Exercise2 extends reusing.Detergent{
    public void scrub(){
        append(" overwritten");
//        super.scrub();
    }
    public void sterilize(){append(" sterilize()");}
    public static void main(String[] args){
        Exercise2 exc = new Exercise2();
        exc.scrub();
        exc.sterilize();
        System.out.println(exc);
    }
}
