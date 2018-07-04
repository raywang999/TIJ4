class Finalizeable {
    boolean Dead = false;
    Finalizeable(boolean Dying){
        Dead = Dying;
    }
    void heal(){
        Dead = false;
    }
    protected void finalize(){
        if(Dead)
            System.out.println("error, Dead");
    }
}

class Exercise10{
    public static void main(String[] args){
        Finalizeable f = new Finalizeable(true);
//        f.heal();
        new Finalizeable(true);
        System.gc();
    }
}
