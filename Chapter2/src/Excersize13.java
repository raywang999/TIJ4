class changable{
	int charToBinary(char c){
		c<<=1;
		c>>=1;
		return c; 
	}
}

class Excersize13{
	public static void main(String[] args){
		changable c = new changable();
		int i;
		i = c.charToBinary('x');
		System.out.println(Integer.toBinaryString(i));
	}
}
