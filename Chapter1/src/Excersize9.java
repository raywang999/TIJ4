//demenstrate autoboxing works for all primitive types

class Excersize9{
  public static void main(String[] args){
    char c = 'x';
    Character ch = new Character(c);
    System.out.println("c = " + c + " ch = " + ch);
    int i = 1;
    Integer in = new Integer(1);
    System.out.println("i = " + i + " in = " + in);
    boolean b = true;
    Boolean bo = new Boolean(b);
    System.out.println("b = " + b + " bo = " + bo);
    Double dou = new Double(2.0);
    double d = dou;
    System.out.println("d = " + d + " dou = " + dou);
  }
}