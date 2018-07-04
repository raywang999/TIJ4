//turn the DataOnly code fragments into a working program

class DataOnly{
  int i;
  double d;
  boolean b;
}

class Excersize4{
  public static void main(String[] args){
    DataOnly data = new DataOnly();
    data.i = 21;
    data.d = 2.0;
    data.b = true;
    System.out.println("in data, i = " + data.i);
    System.out.println("in data, d = " + data.d);
    System.out.println("in data, b = " + data.b);
  }
}