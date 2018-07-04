	
class Exercise9{
	public static void main(String[] args){
		System.out.println("max float : " + 0x1.fffffeP+127f);
		System.out.println("min float : " + -1*(0x1.fffffeP+127f));
		System.out.println("min float : " + Float.MIN_VALUE);
		System.out.println("max double : " + Double.MAX_VALUE);
		System.out.println("min double : " + -(Double.MAX_VALUE));
		System.out.println("min double : " + Double.MIN_VALUE);
	}
}
