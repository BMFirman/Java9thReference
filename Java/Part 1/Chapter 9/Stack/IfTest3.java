/*
    In this program, mystack is a reference to the IntStack interface.
    Thus, when it refers to ds, it uses the versions of push( )
    and pop( ) defined by the DynStack implementation.
    When it refers to fs, it uses the versions of push( )
    and pop( ) defined by FixedStack.
    As explained, these determinations are made at run time.
    Accessing multiple implementations of an interface through
    an interface reference variable is the most powerful way
    that Java achieves run-time polymorphism.
*/


class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5); 
        FixedStack fs = new FixedStack(8);

        mystack = ds; // load the dynamic stack
        for(int i=0; i<12; i++) {
            mystack.push(i);
        }

        mystack = fs; // load the fixed stack
        for(int i=0; i<8; i++) {
            mystack.push(i);
        }

        mystack = ds;
        System.out.println("Values in dynamic stack:");
        for(int i=0; i<12; i++) {
            System.out.println(mystack.pop());
        }

        mystack = fs;
        System.out.println("Values in fixed stack:");
        for(int i=0; i<8; i++) {
            System.out.println(mystack.pop());
        }

    } 
}