public class Excersize17 {
    public static void main(String[] args){
//!        StaticFinal.i++;
        System.out.println(StaticFinal.i);
    }
}

interface StaticFinal{
    int i = 1;
}
