interface i{}

public class Exercise20Test implements i{
    public interface innerI{}
    private class innerClass{}
    public innerClass get(){return new innerClass();}
    public class publicinnerclass{}
    public static void main(String[] args){
        Exercise20Test e = new Exercise20Test();
        innerClass i = e.get();
        System.out.println(i);
    }
}
