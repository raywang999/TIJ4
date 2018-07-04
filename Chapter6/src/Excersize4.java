/*
Prove that the base-class constructors are
(a) always called and (b) called
before derived-class constructors.
 */
class Graphite{
    Graphite(){ System.out.println("graphite constructed"); }
}

class Pencil extends Graphite{
    Pencil(){ System.out.println("pencil constructed"); }
}

public class Excersize4 extends Pencil{
    public static void main(String[] args){
        Excersize4 exc = new Excersize4();
    }
}