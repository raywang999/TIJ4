class aliasing{
	float f;
}

class Excersize2{
	public static void main(String[] args){
		aliasing a = new aliasing();
		aliasing b = new aliasing();
		a.f = 0.23f;
		b.f = 1.23f;
		System.out.println("a.f = " + a.f + "b.f = " + b.f);
		a = b;
		System.out.println("a.f = " + a.f + "b.f = " + b.f);
	}
}
