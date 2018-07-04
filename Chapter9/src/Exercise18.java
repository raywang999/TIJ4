/*
Exercise 18: (1) Create a class containing a nested class.
In main( ), create an instance of the nested class.
 */

public class Exercise18 {
    static class Nested{}
    public static void main(String[] args){
        Exercise18.Nested n = new Nested();
        Hey.Jude j = new Hey.Jude();
    }
}

class Hey{
    static class Jude{}
}
