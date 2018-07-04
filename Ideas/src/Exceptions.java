import java.util.Optional;
import java.util.Random;

/*
Exception tests, cause i need to try it to understand it
 */
class Disposeable {
    void action(int i){
        i++;
        System.out.println(i);
    }
    void dispose(){
        System.out.println("Disposed");
    }
}

public class Exceptions {
    public static void main(String[] args){
        try {
            System.out.println("Before");
            Object o = new Object();
            Disposeable d = new Disposeable();
            try {
                d.action(1);
                System.out.println(o);
            } finally {
                d.dispose();
                //o.dispose();
            }
            throw new Exception();
            //System.out.println("after");
        } catch (Exception e){

        }

    }
}
