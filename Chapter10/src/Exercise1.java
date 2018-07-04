/*
Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber
that’s initialized in the constructor. Give it a method called hop( ) that
displays which gerbil number this is, and that it’s hopping.
Create an ArrayList and add Gerbil objects to the List.
Now use the get( ) method to move through the List and call hop( ) for each Gerbil.

Exercise 8: (1) Modify Exercise 1 so it uses an Iterator to move through the List while calling hop( ).

Exercise 17: (2) Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name
(e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table.
Get an Iterator for the keySet( ) and use it to move through the Map, looking up the Gerbil for each key and
printing out the key and telling the Gerbil to hop( ).

 */
import java.util.*;
import static net.mindview.util.Print.*;

public class Exercise1 {
    public static void main(String[] args){
        ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
        for (int i = 0; i < 3; i++)
            gerbil.add(new Gerbil());
        for (Gerbil g : gerbil) {
            g.hop();
        }
        System.out.println("Using Iterator:");
        Iterator<Gerbil> it = gerbil.iterator();
        while (it.hasNext()) {
            Gerbil g = it.next();
            g.hop();
        }
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Fuzzy", new Gerbil());
        gerbils.put("Spot", new Gerbil());
        gerbils.put("Ron", new Gerbil());
        Iterator<String> iter = gerbils.keySet().iterator();
        while (iter.hasNext()){
            String s = iter.next();
            print(s + " " + gerbils.get(s));
            gerbils.get(s).hop();
        }
    }
}

class Gerbil{
    private static long counter;
    private final long Number = counter++;
    int gerbiNumber;
    Gerbil(){
        gerbiNumber = (int)Number;
    }
    void hop(){System.out.println(gerbiNumber+" is hopping");}
}
