/*
Exercise 16: (4) Modify the Coffee hierarchy in the Generics
chapter to use Registered Factories.
 */
import typeinfo.factory.Factory;
import java.util.*;

class CoffeeFactory {
    static List<Factory<? extends Coffee>> CoffeeFactories =
            new ArrayList<>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        CoffeeFactories.add(new Americano.Factory());
        CoffeeFactories.add(new Cappuccino.Factory());
        CoffeeFactories.add(new Breve.Factory());
        CoffeeFactories.add(new Latte.Factory());
        CoffeeFactories.add(new Mocha.Factory());
    }
    private static Random rand = new Random(47);
    public static Coffee createRandom() {
        int n = rand.nextInt(CoffeeFactories.size());
        return CoffeeFactories.get(n).create();
    }
}

class Coffee extends CoffeeFactory{
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Americano extends Coffee{
    public static class Factory
    implements typeinfo.factory.Factory{
        public Americano create(){return new Americano();}
    }
}
class Breve extends Coffee{
    public static class Factory
            implements typeinfo.factory.Factory{
        public Breve create(){return new Breve();}
    }

}
class Cappuccino extends Coffee{
    public static class Factory
            implements typeinfo.factory.Factory{
        public Cappuccino create(){return new Cappuccino();}
    }
}
class Latte extends Coffee{
    public static class Factory
            implements typeinfo.factory.Factory{
        public Latte create(){return new Latte();}
    }
}

class Mocha extends Coffee{
    public static class Factory
            implements typeinfo.factory.Factory{
        public Mocha create(){return new Mocha();}
    }
}

public class CoffeeGenerator16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(CoffeeFactory.createRandom());
    }
}
