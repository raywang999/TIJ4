import static net.mindview.util.Print.*;
import java.lang.StringBuilder.*;

class Excersize5{
	public static void main(String[] args){
		byte b = 0x3a;
		byte t = 0x2a;
		String s1 = "";
		String s2 = "";
		print("with tobinarystring : " + Integer.toBinaryString(b));
		print("with tobinarystring : " + Integer.toBinaryString(t));
		for (; b>0;){
			s1 += (b%2 == 0)? "0" : "1";
			//Divide both variables by 2
			int a = b/2;
			b = (byte)a;
		}
		for (; t>0;){
			s2 += (t%2 == 0)? "0" : "1";
			int a = t/2;
			t = (byte)a;
		}
		s1 = new StringBuilder(s1).reverse().toString();
		s2 = new StringBuilder(s2).reverse().toString();
		print("with my functions, b : " + s1);
		print("with my functions, t : " + s2);
	}
}