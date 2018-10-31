/*
Exercise 4: (2) Modify the previous exercise so that it uses
instanceof to check the type before performing the downcast.
 */
import java.util.*;

abstract class Shape4 {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle4 extends Shape4 {
    public String toString() { return "Circle"; }
}

class Square4 extends Shape4 {
    public String toString() { return "Square"; }
}

class Triangle4 extends Shape4 {
    public String toString() { return "Triangle"; }
}

class Rhomboid4 extends Shape4{
    public String toString() {return "Rhomboid";}
}

public class Shapes4 {
    public static void main(String[] args) {
        List<Shape4> shapeList = Arrays.asList(
                new Circle4(), new Square4(), new Triangle4(), new Rhomboid4()
        );
        for(Shape4 shape : shapeList)
            shape.draw();
        Rhomboid4 r = (Rhomboid4)shapeList.get(3);
        if ((Shape4)r instanceof Circle4)
            r.draw();
    }
}
