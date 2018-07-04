import static net.mindview.util.Print.*;

class Exercise14{
	static void compareAll(String s1, String s2){
		print(s1==s2);
		print(s1.equals(s2));
		print(s1!=s2);
		print(s1.length()<s2.length());
		print(s1.length()>s2.length());
		print(s1.length()<=s2.length());
		print(s1.length()>=s2.length());
	}
	public static void main(String[] args){
		compareAll("lol", "lolol");
	}
}
