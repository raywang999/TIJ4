/*
Exercise 11: (2) Create a private inner class that implements a public interface.
Write a method that returns a reference to an instance of the private inner class,
upcast to the interface. Show that the inner class is completely hidden by trying to downcast to it.
 */
class Exercise11 {
    private class Biotic implements Alive{
        public void say(){System.out.println("say");}
    }
    Alive getBiotic(){
        return new Biotic();
    }
}

class test{
    public static void main(String[] args){
        Exercise11 e = new Exercise11();
        e.getBiotic().say();
        //! ((Biotic)e.getBiotic()).say();
    }
}

public interface Alive{
    void say();
}
