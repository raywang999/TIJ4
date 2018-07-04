/*Exercise 4: (3) Create a generator class that produces character
names (as String objects) from your favorite movie (you can use Snow White
or Star Wars as a fallback) each time you call next( ), and loops around
to the beginning of the character list when it runs out of names.
Use this generator to fill an array, an ArrayList, a LinkedList,
a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
*/
import static net.mindview.util.Print.*;
import java.util.*;

public class Excersize4 {
    public static void main(String[] args){
        Generator g = new Generator();
        String[] s = new String[10];
        g.fillA(s);
        Collection<String> aL = new ArrayList<>();
        Collection<String> lL = new LinkedList<>();
        Collection<String> hS = new HashSet<>();
        Collection<String> lHS = new LinkedHashSet<>();
        Collection<String> tS = new TreeSet<>();
        print(g.fill(aL, 10));
        print(g.fill(lL, 10)
        );
        print(g.fill(hS, 10));
        print(g.fill(lHS,10));
        print(g.fill(tS, 10));
    }
}

class Generator{
    int key = 0;
    public String next(){
        switch (key){
            default:
            case 0:  key++; return "Anakin Skywalker";  
            case 1:  key++; return "Luke Skywalker";    
            case 2:  key++; return "Jar Jar Binks";     
            case 3:  key++; return "Obi Wan Kanobi";    
            case 4:  key=0; return "Darth Vadar";
        }
    }
    void fillA(String[] s){
        for (int i = 0; i < s.length; i++)
            s[i]=next();
    }
    public Collection<String>fill(Collection<String> c, int n){
        for (int i = 0; i<n; i++) c.add(next());
        return c;
    }
}
