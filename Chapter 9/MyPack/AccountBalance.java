// a simple package
package MyPack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if(bal<0) {
            System.out.print("---> ");
        }
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance current [] = new Balance[3];

        current[0] = new Balance("Bailey", 420);
        current[1] = new Balance("Mitchell", 69);
        current[2] = new Balance("Dhiren", 21);

        for(int i=0; i<3; i++) {
            current[i].show();
        }
    }
}