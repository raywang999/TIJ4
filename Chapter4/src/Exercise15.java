/*
Create a class with a String that is initialized using instance initialization.
 */

class Bottles{
    String s;
    {
        s = "bottle";
    }
}

class Exercise15 {
    public static void main(String[] args){
        Bottles bottle = new Bottles();
        System.out.print(bottle.s);
    }
}
