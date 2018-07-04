import static net.mindview.util.Print.*;

class Excersize6{
    static int result = 0;
    static void test1(int testval, int target, int begin, int end){
        if (testval <= end && testval >= begin)
            result = 10;
        else if(testval > target)
            result = +1;
        else if(testval < target)
            result = -1;
        else
            result = 0; // Match
    }
    static int test2(int testval, int target, int begin, int end){
        if (testval <= end && testval >= begin)
            return 10;
        else if(testval > target)
            return +1;
        else if(testval < target)
            return +1;
        else
            return +1;
    }
    public static void main(String[] args){
        test1(10, 20, 11, 12);
        print(result);
        test1(10, 20, 9, 10);
        print(result);
        print(test2(10, 20, 11, 12));
        print(test2(10, 20, 9, 11));
    }
}