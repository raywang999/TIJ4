/*
Exercise 3: (2) Add Rhomboid to Shapes.java.
Create a Rhomboid, upcast it to a Shape, then downcast
it back to a Rhomboid. Try downcasting to a Circle
and see what happens.
 */
import java.util.*;

abstract class Shape3 {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle3 extends Shape3 {
    public String toString() { return "Circle"; }
}

class Square3 extends Shape3 {
    public String toString() { return "Square"; }
}

class Triangle3 extends Shape3 {
    public String toString() { return "Triangle"; }
}

class Rhomboid3 extends Shape3{
    public String toString(){ return "Rhomboid";}
}

public class Shapes3 {
    public static void main(String[] args) {
        List<Shape3> shapeList = Arrays.asList(
                new Circle3(), new Square3(), new Triangle3(), new Rhomboid3()
        );
        for(Shape3 shape : shapeList)
            shape.draw();
        //downcast into a rhomboid
        Rhomboid3 r = ((Rhomboid3)shapeList.get(3));
        r.draw();
        //downcasting won't work
        //((Circle3)r).draw();
    }
}
