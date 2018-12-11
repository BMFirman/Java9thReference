class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // object of type a
        B b = new B(); // object of type b
        C c = new C(); // object of type c

        A r; // obtain a reference of type A

        r = a; // r refers to an A object
        r.callme();

        r = b; // r refers to an B object
        r.callme();

        r = c; // r refers to an C object
        r.callme();
    }
}