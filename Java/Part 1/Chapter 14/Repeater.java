class Repeat {
    Repeat ob;

    Repeat() {
        System.out.println("Will this go on forever?");
    }

    Repeat(Repeat o) {
        ob = new Repeat(o);
        System.out.println("Will this go on forever?");
    }
}

class Repeater {
    public static void main(String[] args) {
        Repeat rob = new Repeat();
        Repeat rob2 = new Repeat(rob);
    }
}