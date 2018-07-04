//turn incrementable code fragments into a working program

class Incrementable {
  static void increment() { StaticTest.i++; }
}

class Excersize7{
  public static void main(String[] args){
    Incrementable sf = new Incrementable();
    sf.increment();
    StaticTest st1 = new StaticTest();
    System.out.println(st1.i);
    Incrementable.increment();
    System.out.println(st1.i);
  }
}