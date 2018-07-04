import static net.mindview.util.Print.*;

class Engine {
    private String s;
    Engine() {
        print("Engine()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

public class Airplane {
    private String fuselage, wings, tail;
    private Engine e;
    public Airplane() {
        print("Inside Airplane()");
        fuselage = "Body";
        wings = "Airfoils";
        tail = "Empennage";
    }
    public String toString() {
        if(e == null) // lazy (delayed) initialization:
            e = new Engine();
        return "fuselage = " + fuselage + ", " +
                "wings = " + wings + ", " +
                "tail = " + tail + ", " +
                "Engine = " + e;
    }
    public static void main(String[] args) {
        Airplane N1234 = new Airplane();
        print(N1234);
    }
}
