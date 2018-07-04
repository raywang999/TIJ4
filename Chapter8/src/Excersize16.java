/*
Exercise 16: (3) Create a class that produces a sequence of chars.
Adapt this class so that it can be an input to a Scanner object.
 */
import java.nio.CharBuffer;
import java.util.*;

public class Excersize16 {
    public static void main(String[] args){
        Scanner s = new Scanner(new CharSeqProAdapter(3, 10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}

class CharSeqPro {
    Random rand = new Random();
    char[] AllChars = new char[58];{
        int a = 65;
            for (int i = 0; i < 58; i++, a++) {
                AllChars[i] = ((char) a);
//                System.out.println(AllChars[i]);
            }
    }
    char[] produceArray(int length){
        char[] output = new char[length];
        for (int i = 0; i < length; i++) {
            output[i] = AllChars[(rand.nextInt(AllChars.length))];
            //System.out.print(output[i]);
        }
        /*
        for (char c:output) {
            System.out.print(c);
        }
        System.out.println();
        */
        return output;
    }
}

class CharSeqProAdapter implements Readable {
    private int count;
    private int length;
    private int endlength;
    private CharSeqPro csp = new CharSeqPro();
    CharSeqProAdapter(int i, int l){count = i; length = endlength = l;}
    public int read(CharBuffer cb){
        if (count-- == 0) return -1;
        String str = new String();
        char[] c = csp.produceArray(length);
        for (char a:c) str += a;
        cb.append(str);
        cb.append(' ');
        //System.out.println(csp.produceArray(length));
        return ++endlength;
    }
}
