class peeler{
    void peeled(){
        System.out.println("peeled");
        peel();
        this.peel();
    }
    void peel(){
        System.out.println("peel");
    }
}

class Excersize8 {
    public static void main(String[] args){
        peeler p = new peeler();
        p.peeled();
    }
}
