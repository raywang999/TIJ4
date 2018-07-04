class Excersize4{
  public static void main(String[] args){
    int prime = 1;
    //test's for the first 25 integers
    //System.out.println(prime);
    for (int i=0; prime<5; i++)
      System.out.println(prime);
      prime++;
      System.out.println(prime);
      int counter = 2;
      System.out.println(counter);
      for (int i=2; (prime%i) != 0; i++)
        counter++;
        //System.out.println(counter);
      if (prime==counter)
        System.out.println(prime + "is a prime number");
   //System.out.println(2%2);
  }
}