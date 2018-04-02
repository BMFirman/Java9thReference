// demonstrate the instanceOf operator
class A {
    int i,j;
}

class B {
    int i,j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if(a instanceOf A)
            System.out.println("a is an instance of A");
        if(b instanceOf B)2Y
            System.out.println("b is and instance of B");
        if(c instanceOf C)
            System.out.println("c is an instance of C");
        if(c instanceOf A)
            System.out.println("c can be cast to A");

        if(a instanceOf C)
            System.out.println("a can be cast to C");

        System.out.println();

        // compare types of derived types
        A ob;

        ob = d; // A refence to d
        System.out.println("ob now refers to d");
        if (ob instanceOf D) {
            System.out.println("ob can be cast to D");
        } else
            System.out.println("ob cannot be cast to D");
        } 
    }
}