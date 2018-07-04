/*
Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and
print the toString( ) of each object in the container. Fill all the different types of
Collections with objects and apply your method to each container.
 */

import java.util.*;

public class Exercise11 {
    public void display(Collection c){
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o.getClass() + " toString: " + o.toString());
        }
    }
    public static void main(String[] args){
        Exercise11 exc11 = new Exercise11();
        Collection<Object> objects = Arrays.asList
                (new String(), new Integer(0), new Character('x'));
        Collection<Object> lL = new LinkedList<>();
        Collection<Object> aL = new ArrayList<>();
        Collection<Object> hS = new HashSet<>();
        Collection<Object> lHS = new LinkedHashSet<>();
        lL.addAll(objects);
        aL.addAll(objects);
        hS.addAll(objects);
        lHS.addAll(objects);
        exc11.display(lL);
        exc11.display(aL);
        exc11.display(hS);
        exc11.display(lHS);
    }
}
