/*
Exercise 6: (4) Modify Shapes6.java so that it can "highlight"
(set a flag in) all shapes of a particular type. The toString( )
method for each derived Shape6 should indicate whether that Shape
is "highlighted."
 */
import java.util.Arrays;
import java.util.List;

abstract class Shape6 {
    void draw() {System.out.println(this + ".draw()");}
    abstract public String toString();
}

class Circle6 extends Shape6{
    static boolean hilight = false;
    public String toString(){return "Circle" + (hilight ? "[hilighted]" : "");}
}

class Square6 extends Shape6{
    static boolean hilight = false;
    public String toString(){return "Sqaure" + (hilight ? "[hilighted]" : "");}
}
class Triangle6 extends Shape6{
    static boolean hilight = false;
    public String toString(){return "Triangle" + (hilight ? "[hilighted]" : "");}
}
public class Shapes6 {
    public static void hilight(Shape6 s){
        if (s instanceof Circle6){
            Circle6.hilight =true;
        }
    }
    public static void main(String[] args){
        List<Shape6> shapes = Arrays.asList(
                new Circle6(), new Square6(), new Triangle6(), new Circle6()
        );
        hilight(shapes.get(0));
        for (Shape6 s:shapes) {
            s.draw();
        }
    }
}
