/*
 Create a class with a blank final reference to an object.
 Perform the initialization of the blank final inside all constructors.
 Demonstrate the guarantee that the final must be initialized before use,
 and that it cannot be changed once initialized.
 */
class FinalTest{ }
public class Exercise19 {
   final FinalTest exc19;
   private final int i;
   Exercise19(){
       exc19 = new FinalTest();
       i = 0;
   }
   Exercise19(int i){
       exc19 = new FinalTest();
       this.i = i;
   }
//!   Exercise19(){}//doesn't guarantee initialization
   public static void main(String[] args){
       Exercise19 exc1 = new Exercise19();
       Exercise19 exc2 = new Exercise19(21);
       System.out.println("exc1 fields: " + exc1.i + " " + exc1.exc19);
       System.out.println("exc2 fields: " + exc2.i + " " + exc2.exc19);
       //!exc1.i++;
       //!exc1.exc19=new Exercise19();
   }
}
