/*
Exercise 6: (1) Create two exception classes, each of which
performs its own logging automatically. Demonstrate that these work.
 */
import java.util.logging.*;
import java.io.*;

public class Excersize6 {
    public static void main(String[] args){
        try {
            StringWriter trace = new StringWriter();
            throw new AutoLog1(trace);
        }catch (Exception e){ }
        try {
            throw new AutoLog2();
        }catch (Exception e){ }
    }
}

class AutoLog1 extends Exception{
    private static Logger logger = Logger.getLogger("AutoLog1");
    AutoLog1(StringWriter trace){
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class AutoLog2 extends Exception{
    private static Logger logger = Logger.getLogger("AutoLog1");
    AutoLog2(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
