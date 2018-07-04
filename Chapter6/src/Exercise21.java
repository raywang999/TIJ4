/*
Create a class with a final method.
Inherit from that class and attempt
to overwrite that method.
 */
class OverAttempt{
    final void g(){}
}

public class Exercise21 extends OverAttempt{
//!    @Override final void g(){System.out.println("Overridden");} //final methods cannot be overridden
    public static void main(String[] args){
        Exercise21 exc21 = new Exercise21();
        exc21.g();
    }
}
