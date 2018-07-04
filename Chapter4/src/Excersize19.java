/*
Write a method that takes a vararg String array.
Verify that you can pass either a comma-separated
list of Strings or a String[] into this method.
 */
class VarargTest{
    void test(String ... args){
        for (String s:args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

public class Excersize19 {
    public static void main(String[] args) {
        VarargTest vt = new VarargTest();
        System.out.println("with list : ");
        vt.test("hi", "bye","nope");
        System.out.println("with array : ");
        vt.test(new String[]{"nope", "bye", "hi"});
    }
}