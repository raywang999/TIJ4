/*
Exercise 15: (2) Show that WithFinally.java
doesn’t fail by throwing a RuntimeException inside the try block.
 */

public class Exercise15{
    private static Switch sw = new Switch();
    public static void f()
            throws OnOffException1,OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            sw.off();
            sw.on();
            throw new RuntimeException();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
        finally {
            sw.off();
        }
    }
}
