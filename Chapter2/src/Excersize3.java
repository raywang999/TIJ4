class MethodAliasing{
	float f = 3/2;
	void change(MethodAliasing f){
		f.f = 10/3;
	}
}

class Excersize3{
	public static void main(String[] args){
		MethodAliasing ma = new MethodAliasing();
		MethodAliasing ma1 = new MethodAliasing();
		System.out.println("ma = " + ma.f + " ma1 = " + ma1.f);
		ma.change(ma);
		System.out.println("ma = " + ma.f + " ma1 = " + ma1.f);
	}
}
