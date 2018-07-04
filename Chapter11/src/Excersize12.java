import innerclasses.Sequence;

import java.util.LinkedList;

class TestException extends Exception{}

public class Excersize12{
    private LinkedList<Object> list = new LinkedList<>();
    int limit;
    Excersize12(int max){
        limit=max;
    }
    void add(Object o) throws TestException{
        if (limit==list.size())
            throw new TestException();
        else
            list.add(o);
    }
    public static void main(String[] args){
        Excersize12 exc = new Excersize12(3);
        for (int i = 0; i < 4; i++){
            try {
                exc.add(i);
            } catch (TestException e){
                System.out.println("Caught");
                e.printStackTrace(System.out);
            }
        }
        Sequence.main(args);
    }
}
