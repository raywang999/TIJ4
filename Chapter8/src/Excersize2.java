/*
Exercise 2: (1) Create a class as abstract without including any abstract
methods and verify that you cannot create any instances of that class.
 */
abstract class AbstractTest{
    void hi(){System.out.println("hi");}
}

class Yup extends AbstractTest{
    Yup(){System.out.println("yup");}
}

public class Excersize2 {
    public static void main(String[] args){
//        AbstractTest at = new AbstractTest();
        Yup yup = new Yup();
    }
}
