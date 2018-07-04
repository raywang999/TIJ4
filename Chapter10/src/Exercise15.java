/*
Exercise 15: (4) Stacks are often used to evaluate expressions in programming languages.
Using net.mindview.util.Stack, evaluate the following expression, where’+’ means "push the
following letter onto the stack," and’-’ means "pop the top of the stack and print it":
"+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 */

import net.mindview.util.Stack;


public class Exercise15 {
    public static void main(String[] args){
        String s ="+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-";
        Stack st = new Stack();
        for (char c: s.toCharArray()){
            switch (c){
                case '+': break;
                case '-': System.out.print(st.pop()); break;
                default: st.push(c); //System.out.println(c);
            }
        }
    }
}
