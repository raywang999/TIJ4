class Exercise10{
	public static void main(String[] args){
		byte b = 0x2d;
		byte t = 0x2a;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(t));
		System.out.println(Integer.toBinaryString(b&t));
		System.out.println(Integer.toBinaryString(b|t));
		System.out.println(Integer.toBinaryString(b^t));
		System.out.println(Integer.toBinaryString(~t));
		System.out.println(Integer.toBinaryString(~b));
	}
}
