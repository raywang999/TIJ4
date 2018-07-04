/*
Inherit a new class from class Detergent. Override
scrub( ) and add a new method called sterilize( ).
 */
public class Excersize2 extends reusing.Detergent{
    public void scrub(){
        append(" overwritten");
//        super.scrub();
    }
    public void sterilize(){append(" sterilize()");}
    public static void main(String[] args){
        Excersize2 exc = new Excersize2();
        exc.scrub();
        exc.sterilize();
        System.out.println(exc);
    }
}