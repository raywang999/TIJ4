/*
Exercise 26: (1) Change the file name string in MainException.java to
name a file that doesn’t exist. Run the program and note the result.
 */
import java.io.*;

public class Excersize26 {
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file =
                new FileInputStream("Doesn't_Exist.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
