//Excersize 5 & 6

import static net.mindview.util.Print.*;

class dog{
    /*void bark(String s){
        print("Woof");
    }*/
    void bark(char c){
        print("Aooo");
    }
    void bark(byte b){
        print("Howl");
    }
    void bark(short s){
        print("Yada");
    }
    void bark(int i){
        print("Wraf");
    }
    void bark(long l){
        print("bark");
    }
    void bark(float f){
        print("whimper");
    }
    void bark(double d){
        print("Yipp");
    }
    void bark(int i, char c){
        print("icic");
    }
    void bark(char c, int i){
        print("cici");
    }
}

class Excersize5 {
    public static void main(String[] args){
        dog scruffy = new dog();
        scruffy.bark('c');
        scruffy.bark((byte)0);
        scruffy.bark((short)1);
        scruffy.bark(1);
        scruffy.bark((long)1);
        scruffy.bark((float)10/3);
        scruffy.bark(1.0);
        scruffy.bark(1,'c');
        scruffy.bark('c',1);
    }
}
