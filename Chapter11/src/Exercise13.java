/*
Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally clause is executed, even if a NullPointerException is thrown.

 */

public class Exercise13{
    static void allExceptions(int i) throws Exception1,Exception2,Exception3,NullPointerException{
        if (i<0)
            throw new Exception1();
        if (i==0)
            throw new Exception2();
        if (i>0)
            throw new Exception3();
            throw new NullPointerException();
    }
    public static void main(String[] args){
        try {
            allExceptions(0);
            allExceptions(1);
            allExceptions(-1);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Always Excecuted");
        }
    }
}
