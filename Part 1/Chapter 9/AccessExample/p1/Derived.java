package p1;

class Derived extends Protection {

    Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);

// class only
// System.out.println("n_pri = "4+n_pri());

        System.out.println("n_pro = " + p.n_pro());
        System.out.println("n_pub = " + p.n_pub());
    }
}