enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Here are all the Apple contants");
        
        // Use values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples) {
            System.out.println(a);
        }

        System.out.println();

        // Use valueOf()
        // valueOf() returns the emun value associated with
        // the name constant
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}