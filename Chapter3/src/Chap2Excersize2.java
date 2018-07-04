class Chap2Exercise2{
  public static void main(String[] args){
    for (int i = 0; i < 13; i++){
      double i1 = Math.random();
      double i2 = Math.random();
      if (i1 > i2)
        System.out.println("i1 > i2");
      else if(i1 < i2)
        System.out.println("i1 < i2");
      else
        System.out.println("i1 = i2");
    }
  }
}
