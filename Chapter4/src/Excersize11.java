//Modify the previous exercise so that your finalize( ) will always be
//called.
class Finalizeable2 {
    boolean Dead = false;
    Finalizeable2(boolean Dying){
        Dead = Dying;
    }
    void heal(){
        Dead = false;
    }
    protected void finalize(){
        if(Dead)
            System.out.println("Dead");
    }
}

class Excersize11{
    public static void main(String[] args){
        Finalizeable2 f = new Finalizeable2(true);
        f.heal();
        new Finalizeable2(true);
        Finalizeable2 f2 = new Finalizeable2(true);
        Finalizeable2 f3 = new Finalizeable2(true);
        f2.heal();
        System.runFinalization();
        Runtime.getRuntime().runFinalization();
        System.gc();
        System.runFinalizersOnExit(true);
    }
}