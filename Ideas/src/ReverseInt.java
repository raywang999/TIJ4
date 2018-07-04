/*
reverses a int
 */
public class ReverseInt {
    int getLength(int i){
        int length = 0;
        while(i!=0){
            length++;
            i = i / 10;
        }
        return length;
    }
//    int[] toArray(int input, int length) { }
    /*int reverseint(int[] input, int length){
        for (int counter1 = 0; counter1 != length || (counter1+1) != length; counter1++){
            input[counter1];
        }
    }*/
    public static void main(String[] args){
        ReverseInt ri = new ReverseInt();
        int length = ri.getLength(876);
        System.out.println(length);
    }
}
