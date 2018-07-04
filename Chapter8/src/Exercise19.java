/*
Exercise 19: (3) Create a framework using Factory Methods
that performs both coin tossing and dice tossing.
 */
/*
Exercise 17: (1) Modify the solution to Exercise 19 from the
Interfaces chapter to use anonymous inner classes.
 */
import static net.mindview.util.Print.*;
import java.util.Random;

public class Exercise19 {
    static void gamble(GamblingFactory factory){
        Gambling g = factory.getGamble();
        g.toss();
    }
    public static void main(String[] args){
        //gamble(new DiceFactory());
        //gamble(new CoinFactory());
        gamble(Coin.factory);
        gamble(Dice.factory);
    }
}

interface Gambling{
    Random rand = new Random();
    void toss();
}

interface GamblingFactory{
    Gambling getGamble();
}

class Coin implements Gambling{
    private Coin(){}
    public void toss(){
        if (rand.nextInt(2) == 0)
            print("heads");
        else print("tails");
    }
    public static GamblingFactory factory =
            new GamblingFactory() {
                @Override
                public Gambling getGamble() {
                    return new Coin();
                }
            };
}

/*class CoinFactory implements GamblingFactory{
    public Gambling getGamble() { return new Coin(); }
}*/

class Dice implements Gambling{
    public void toss() {
        String s = "You rolled a ";
        switch (rand.nextInt(6)){
            case 0 : print(s + "1");break;
            case 1 : print(s + "2");break;
            case 2 : print(s + "3");break;
            case 3 : print(s + "4");break;
            case 4 : print(s + "5");break;
            case 5 : print(s + "6");break;
            default:break;
        }
    }
    public static GamblingFactory factory =
            new GamblingFactory() {
                @Override
                public Gambling getGamble() {
                    return new Dice();
                }
            };
}

class DiceFactory implements GamblingFactory{
    @Override
    public Gambling getGamble() { return new Dice(); }
}
