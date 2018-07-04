import java.util.concurrent.*;

class Excersize7{
	public static void main(String[] args){
		//initializes a number that has a 50 50 chance of being 0 or 1
		int randomNum = ThreadLocalRandom.current().nextInt(0,2);
		System.out.println("true is heads, false is tails");
		System.out.println(randomNum == 0);
	}
}
