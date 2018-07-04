public class Exponents {
    static long exponent(long base, long exponent){
        for (long i = 1; i < exponent; i++){
            base *= base;
            System.out.println(base);
        }
        return base;
    }
    static int reverse(char[] c){
        /*for (int i = 0; i<c.length/2; i++){
            char end = c[c.length-i];
            c[c.length-i]=c[i];
            c[i]=end;
        }*/
        for (int i = 0; i<c.length; i++){
            int a = c[i]-48;

        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(exponent(4 ,2));
    }
}