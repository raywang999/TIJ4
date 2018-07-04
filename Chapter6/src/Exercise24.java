/*
In Beetle.java, inherit a specific type of beetle from class Beetle,
following the same format as the existing classes. Trace and explain the output.
 */
/*
class Test{
    void d(){}
}
*/
import reusing.Beetle;

public class Exercise24{
    public static void main(String[] args){
        Beetle.main(args);
    }
}
/*Output(without explanations):
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle.main
Insect constructor
i = 9, j = 0
end Insect constructor
Beetle.k initialized
Beetle constructor
k = 47
j = 39
end Beetle constructor
static Ladybug.n initialized
Insect constructor
i = 9, j = 0
end Insect constructor
Beetle.k initialized
Beetle constructor
k = 47
j = 39
end Beetle constructor
Ladybug.m initialized
Ladybug constructor
m =47
n =47
end Ladybug constructor
end Beetle.main
 */

/*Output(with explanations):
    Compiler tries to access Beetle.main and so finds a
class called Beetle and loads it. When loading, it finds
that Beetle class inherits from Insect, and so it loads
the base class Insect.
    The static code blocks are initialized in textual
order. Insect.x1 uses static method printinit(String s)
so that method is loaded. now x1 is initialized:
*/
/*
static Insect.x1 initialized
*/
/*
    Now all the statics in Insect are initialized, the
compiler loads to the class inheriting from it. In this
case, the class is Beetle. The Beetle statics are now
initialized(Including main):
*/
/*
static Beetle.x2 initialized
Beetle.main
/*
now, a new Beetle reference is created. It first initializes
all the primitives to their default values and all references
to null. Then, it calls the base class Constructor(in this case,
Insect()). Now, all the Instance variables are initialized in
textual order. Finally, the rest of the constructor is executed:
*/
/*
Insect constructor
i = 9, j = 0
end Insect constructor
//Now the Beetle constructor is CALLED
//Now the instance variables in the Beetle class is initialized:
Beetle.k initialized
//finally beetle constructor is EXECUTED
Beetle constructor
k = 47
j = 39
end Beetle constructor
//Now the Beetle reference B has finished being initialized.
//Now a new Ladybug reference is created. First the statics
static Ladybug.n initialized
/*now the primitives and references inside the Insect class
//are all set to their default values and null, respectfully
//now the root base class constructor is CALLED:
//now the root base class instance variables are initialized
now the root base class constructor is EXECUTED:
*/
/* Insect constructor
i = 9, j = 0
end Insect constructor
 */
/*
//Beetle instance variables are initialized
Beetle.k initialized
 */
/*
now the primitives and references inside the Beetle class
//are all set to their default values and null, respectfully
//now the base class constructor is CALLED:
//now the base class instance variables are initialized
now the base class constructor is EXECUTED:
 */
/*
Beetle constructor
k = 47
j = 39
end Beetle constructor
 */
/*
//Ladybug instance variables are initialized
Ladybug.m initialized
 */
/*
now the primitives and references inside the Beetle class
//are all set to their default values and null, respectfully
//now the base class constructor is CALLED:
//now the base class instance variables are initialized
now the base class constructor is EXECUTED:
 */
/*
Ladybug constructor
m =47
n =47
end Ladybug constructor
 */
/*
//Ladybug is now ready to manipulate
//finally, Beetle.main finishes
end Beetle.main
*/
