/*
Create a class with protected data. Create a second class in the same
file with a method that manipulates the protected data in the first class.
 */
class proData{
    protected static int i = 0;
}

public class Exercise6 {
    public static void main(String[] args){
        System.out.println(proData.i);
        proData.i ++;
        System.out.println(proData.i);
    }
}
