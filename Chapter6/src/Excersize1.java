/*
Create a simple class. Inside a second class, define a reference to an
object of the first class. Use lazy initialization to instantiate this object.
 */
class Simple{
    private String s;
    Simple(){
        System.out.println("Simple");
        s = "constructed";
    }
    public String toString(){
        return s;
    }
}

public class Excersize1 {
    private Simple s;
    public String toString(){
        if (s == null){
            s = new Simple();
        }
        return "s = "+ s;
    }
    public static void main(String[] args) {
        Excersize1 exc = new Excersize1();
        System.out.println(exc);
    }
}
