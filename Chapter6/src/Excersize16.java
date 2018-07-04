/*
Create a class called Amphibian. From this, inherit a class called Frog.
Put appropriate methods in the base class. In main( ), create a Frog
and upcast it to Amphibian and demonstrate that all the methods still work.
 */
/*
Modify Exercise 16 so that Frog overrides the method definitions from the base class
(provides new definitions using the same method signatures). Note what happens in main( ).
 */
import static net.mindview.util.Print.*;
class Amphibian{
    void breath(){}
    void speak(){}
    void move(int i){}
    void birth(){}
    void reproduce(Amphibian a){
        a.birth();
        print("reproduced");
    }
}

class Frog extends Amphibian{
    @Override void reproduce(Amphibian a){
        a.birth();
        print("override reproduced");
    }
    @Override void birth(){
        print("birth");
    }
    @Override void move(int i){
        print("move");
    }
    @Override void speak(){
        print("ribbit");
    }
    @Override void breath(){
        print("breath");
    }
}

public class Excersize16 {
    public static void main(String[] args){
        Frog toadder = new Frog();
        toadder.reproduce(toadder);
    }
}