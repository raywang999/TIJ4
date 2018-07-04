/*
Exercise 16: (3) Following the example in Transmogrify.java,
create a Starship class containing an AlertStatus reference
that can indicate three different states. Include methods to change the states.
 */
import static net.mindview.util.Print.*;

class AlertStatus{ public void alert(){} }

class Green extends AlertStatus{ public void alert(){print("All good");} }
class Orange extends AlertStatus{ public void alert(){print("Ship Damaged");} }
class Red extends AlertStatus{ public void alert(){print("Evacuate Ship!");} }

public class Starship {
    private AlertStatus status = new Green();
    public void fixed(){ status = new Green(); }
    public void hit(){ status = new Orange(); }
    public void destroyed(){ status = new Red(); }
    public void alert(){status.alert();}
    public static void main(String[] args){
        Starship falcon = new Starship();
        falcon.alert();
        falcon.hit(); falcon.alert();
        falcon.destroyed(); falcon.alert();
        print("Bringing remains of falcon to base...");
        print("Fixing remains of falcon...Done");
        falcon.fixed(); falcon.alert();
    }
}
