//the storage code fragments into a method and class
class storage{
  int storage(String s) {
    return s.length() * 2;
  }
}

class Exercise6{
  public static void main(String[] args){
    //setting new stored type of object
    storage stored = new storage();
    //giving the method something to be used on
    int i;
    i = stored.storage("asdf");
    System.out.println("Storage space for asdf = " + i);
  }
}
