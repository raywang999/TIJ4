class test{
    String s;
    String s1 = "hi";
    String str;
    test(){str = "auto";}
}

class Excersize2 {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.s);
        System.out.println(t.str);
        System.out.println(t.s1);

    }
}
