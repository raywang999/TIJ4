/*
Create a class with a static String field that is initialized at the point of definition, and another one that is initialized by the static block.
Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
*/
class SS{
    static String s1 = "hi";
    static String s2;
    static {
        s2 = "bye";
        System.out.println("Initialized");
    }
    static void f1(){};
    static void print(){
        System.out.println(s1);
        System.out.println(s2);
    }
    SS(){
        print();
    }
}

class Excersize14 {
    public static void main(String[] args){
       System.out.println("inside main");
       SS.print();
    }
    static SS s = new SS();
}
