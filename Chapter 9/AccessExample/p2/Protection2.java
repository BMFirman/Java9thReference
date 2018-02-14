package p2;

class Protection2 extends p1.Protection {

    Protection2() {
        System.out.println("derived other package constructor");

    // class or package only
    // System.out.println("n = " + n);

    // class only
    // System.out.println("n_pri = " + p.n_pri);

    // class, subclass or package only
    // System.out.println("n_pro = " +p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}