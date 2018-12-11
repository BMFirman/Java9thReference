// using enum constructors, instance variables, and methods
enum Apple { 
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland();

    private int price; // price of each rectangle

    // constructor
    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        // display the price of winesap
        System.out.println("Winesap costs " + Apple.Winesap.getPrice()
            + " cents.\n");

        System.out.println("All apple prices");
        for(Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getPrice()
                + " cents.");
        }

        System.out.println("All apple prices");
        for(Apple a : Apple.values()) {
            System.out.println(a.ordinal());
        }
    }
}