enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        // Output an enum value
        System.out.println("Value of ap: " + ap);
        System.out.print("\n");

        ap = Apple.GoldenDel;

        // compare the two enum values
        if(ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }

        // Use an enum to control a switch statement
        switch(ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
            case Cortland:
                System.out.println("Cortland is red");
        }
    }
}