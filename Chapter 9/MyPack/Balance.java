package MyPack;

public class Balance {
    public String name;
    public double bal;

    // constructors need to be public also to be used.
    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if(bal<0) {
            System.out.print("---> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
