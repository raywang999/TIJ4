/*
Exercise 21: (2) Demonstrate that a derived-class constructor
cannot catch exceptions thrown by its base-class constructor.
 */
class Base{
    Base() throws Exception{
        throw new NullPointerException();
    }
}

public class Excersize21 extends Base{
    Excersize21() throws Exception {
        /* Super must be first statement, or not exist.
        try {
            super();
        }*/
    }
}
