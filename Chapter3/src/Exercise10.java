import java.util.Arrays;
import java.util.Collections;

class Exercise10{
    public static void main(String[] args){
        for (int i = 1000; i <= 9999; i++){
            char[] test = ("" + i).toCharArray();
            for (int i1 = 0; i<24 ; i++) {
                Collections.shuffle(Arrays.asList(test));
                String s = new String(test);
                String[] history = new String[24];
                history[i1] = s;
                for (int a = 0; a < 4; ++a) {
                    switch (a) {
                        case 0:
                        case 1:
                            test[a] *= 10;
                            break;
                        case 2:
                        case 3:
                            test[a] += test[a - 1];
                            break;
                    }
                }
                if (test[2] * test[4] == i) {
                    System.out.println(i + " is a vampire number");
                    break;
                }
            }
        }
    }
}
