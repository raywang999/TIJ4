/*
Exercise 2: (1) Create a class that holds a String, and has a
toString( ) method that displays this String. Add several instances
of your new class to a Sequence object, then display them
 */

public class Excersize2 {
    public static void main(String[] args){
        Sequence sequence = new Sequence(3);
        for (int i = 0; i < 3; i++)
            sequence.add(new Holder());
        Selector s = sequence.selector();
        while(!s.end()){
            System.out.println(s.current());
            s.next();
        }
    }
}

class Holder{
    private String str = "im a string";
    public String toString(){return str;}
}

interface Selector{
    boolean end();
    Object current();
    void next();
}

class Sequence{
    private Object[] items;
    private int next = 0;
    Sequence(int size){items = new Object[size];}
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end() { return (i == items.length); }
        public Object current() { return items[i]; }
        public void next() { if(i<items.length) i++; }
    }
    public Selector selector(){return new SequenceSelector();}
}
