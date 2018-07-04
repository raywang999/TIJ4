class Tank{
    int fullness;
//    boolean emptied;
    Tank (int fillLevel){
        fullness = fillLevel;
    }
    void fillTank(int amount){
        fullness += amount;
    }
    void empty(){
        fullness = 0;
    }
    protected void finalize(){
        if(fullness != 0)
            System.out.println("Error, " + fullness + " is filled");
    }
}

class Excersize12 {
    public static void main(String[] args){
        Tank t1 = new Tank(100);
        Tank t2 = new Tank(10);
        Tank t3 = new Tank(1);
        Tank t5 = new Tank(11);
        Tank t4 = new Tank(0);
        new Tank(1);
        t3.empty();
        t5.empty();
        System.gc();
        System.runFinalizersOnExit(true);
    }
}
