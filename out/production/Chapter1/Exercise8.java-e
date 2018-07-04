/* Write a program that demonstrates that, no matter how many objects you create of a particular class, 
there is only one instance of a particular static field in that class */

class StaticTest{
  static int i = 47;
}

class Exercise8{
  public static void main(String[] args){
    StaticTest st1 = new StaticTest();
    StaticTest st2 = new StaticTest();
    System.out.println("Before increment st1: " + st1.i + "Before increment st2: " + st2.i);
    st1.i ++;
    System.out.println("After increment st1: " + st1.i + "After increment st2: " + st2.i);
  }
}
