interface i{
    void hi();
}

class A{}

public class Exercise20Test extends A implements i{
    @Deprecated
    int asdf;
    double dsad;
    public interface innerI{}
    private class innerClass{}
    public innerClass get(){return new innerClass();}
    public class publicinnerclass{}
    public static void main(String[] args){
        Exercise20Test e = new Exercise20Test();
        innerClass i = e.get();
        System.out.println(i);
    }
    @Override
    public void hi(){System.out.println("hi");}
}
