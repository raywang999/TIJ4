/*
Exercise 5: (3) Implement a rotate(Shape5) method in Shapes5.java,
such that it checks to see if it is rotating a Circle
(and, if so, doesn’t perform the operation).
 */
import java.util.*;

abstract class Shape5 {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle5 extends Shape5 {
    public String toString() { return "Circle"; }
}

class Square5 extends Shape5 {
    public String toString() { return "Square"; }
}

class Triangle5 extends Shape5 {
    public String toString() { return "Triangle"; }
}

public class Shapes5 {
    public static void rotate(Shape5 s){
        if (s instanceof Circle5)
            System.out.println("No need to rotate");
        else
            System.out.println("Rotating " + s);
    }
    public static void main(String[] args) {
        List<Shape5> shapeList = Arrays.asList(
                new Circle5(), new Square5(), new Triangle5()
        );
        for(Shape5 shape : shapeList)
            rotate(shape);
    }
}
