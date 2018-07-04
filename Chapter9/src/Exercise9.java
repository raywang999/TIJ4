/*
Exercise 9: (1) Create an interface with at least one method,
and implement that interface by defining an inner class within a
method, which returns a reference to your interface.
 */
/*
Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.
 */
public class Exercise9 {
    Plant tree(){
        class Tree implements Plant{
            public void grow(){
                System.out.println("growing tree");
            }
        }
        return new Tree();
    }
    Plant getTree(){
        return new Plant(){
            public void grow(){
                System.out.println("Growing Anonomus");
            }
        };
    }
    public static void main(String[] args){
        Exercise9 e = new Exercise9();
        Plant p = e.tree();
        p.grow();
        e.getTree().grow();
    }
}

interface Plant{void grow();}
